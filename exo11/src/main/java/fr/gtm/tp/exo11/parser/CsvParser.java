package fr.gtm.tp.exo11.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import fr.gtm.tp.exo11.HEADER;
import fr.gtm.tp.exo11.domain.RoundPlate;
import fr.gtm.tp.exo11.domain.Spoon;
import fr.gtm.tp.exo11.domain.SquarePlate;
import fr.gtm.tp.exo11.domain.Utensil;

public class CsvParser implements Parser {

	private static final String CVS_SEPARATOR = ",";
	private static final Logger LOGGER = LoggerFactory.getLogger(CsvParser.class);
	private InputStream inputData;
	private Map<HEADER, Integer> headerMap;

	public void loadData(String path, boolean virtual) {
		try {
			if (virtual) {
				this.loadDataVirtual(path);
			} else {
				this.loadDataHDD(path);
			}
		} catch (IOException e) {
			String msg = "Parser cannot load data : ";
			LOGGER.error(msg, e);
			throw new IllegalArgumentException(msg, e);
		}
	}

	/**
	 * 
	 * @param path
	 * @throws IOException
	 *             si le fichier n'existe pas ou n'est pas lisible (droit de
	 *             lecture).
	 */
	private void loadDataHDD(String path) throws IOException {

		final File csvFile = new File(path);
		if (csvFile.exists() && csvFile.canRead()) {
			this.inputData = new FileInputStream(csvFile);
		} else {
			throw new IOException(
					"Impossible d'exécuter le parseur sur un fichier non existant" + "ou sans les droits de lecture.");
		}

	}

	private void loadDataVirtual(String path) throws IOException {
		final InputStream is = this.getClass().getClassLoader().getResourceAsStream(path);
		if (is != null) {
			this.inputData = is;
		} else {
			throw new IOException("Impossible de trouver le fichier dans le classpath.");
		}

	}

	@Override
	public List<Utensil> parse() {
		List<Utensil> result = new ArrayList<Utensil>();

		try (BufferedReader reader = new BufferedReader(new InputStreamReader(this.inputData));) {
			String line;
			LOGGER.debug("Début lecture du flux :");
			boolean firstLine = true;
			while ((line = reader.readLine()) != null) {
				if (firstLine) {
					this.buildHeaders(line);
					firstLine = false;
				} else {
					result.add(this.buildUtensil(line));
				}
				LOGGER.debug(line);
			}
		} catch (IOException e) {
			LOGGER.debug("Erreur pendant la lecture du fichier:", e);
			System.exit(-1);
		}
		return result;
	}

	private Utensil buildUtensil(String line) {
		Utensil utensil = null;
		final String[] data = line.split(CVS_SEPARATOR);
		final String type = data[this.headerMap.get(HEADER.TYPE)];
		switch (type) {
		case "Assiette ronde":
			utensil = new RoundPlate();
			break;
		case "Assiette carré":
			utensil = new SquarePlate();
			break;
		case "cuillière":
			utensil = new Spoon();
			break;
		default:
			break;
		}
		//Récupérer et mémoriser l'année de fabrication
		final int year = Integer.parseInt(data[this.headerMap.get(HEADER.YEAR)]);
		utensil.setCreation(LocalDate.of(year, 1, 1));
		//Récupérer et mémoriser la cote de l'ustensile
		utensil.setScore(data[this.headerMap.get(HEADER.SCORE)]);
		return utensil;
	}

	private void buildHeaders(String line) {
		this.headerMap = new HashMap<>();
		final List<String> headers = Arrays.asList(line.split(CVS_SEPARATOR));
		for (final HEADER header : HEADER.values()) {
			final int index = headers.indexOf(header.column);
			if (index >= 0) {
				// Colonne retrouvée dans le CSV, mémoriser l'indice de colonne.
				this.headerMap.put(header, index);
			} else {
				// Colonne obligatoire manquante!
				LOGGER.error(
						"Colonne {} manquante dans le fichier CSV, impossible" + " de continuer les traitemements.");
				System.exit(1);
			}
		}
	}

}
