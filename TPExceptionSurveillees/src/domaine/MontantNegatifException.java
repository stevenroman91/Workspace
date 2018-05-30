package domaine;

/**
 * Classe d'exception de saisie de montant negatif
 * @author Adminl
 *
 */
public class MontantNegatifException extends Exception{

	/**
	 * constructeur
	 * @param message prends le msg en param
	 */
	public MontantNegatifException(String message) {
		
		super(message);
		
	}
	

}
