package fr.gtm.tp.exo11.domain;

import java.time.LocalDate;

public abstract class Utensil {
	
	private LocalDate creation;
	
	public abstract void setScore(Object obj);
	
	public int calValue(LocalDate current) {
		return this.creation.getYear()-50>0 ? current.getYear()-this.creation.getYear()-50 : 0;
	}

	/**
	 * @return the creation
	 */
	public LocalDate getCreation() {
		return creation;
	}

	/**
	 * @param creation the creation to set
	 */
	public void setCreation(LocalDate creation) {
		this.creation = creation;
	}
	
	@Override
	public String toString() {
		
		final StringBuilder sb = new StringBuilder("Ustensile[");
		sb.append("Fabrication ->");
		sb.append(this.creation.toString());
		return sb.toString();
	}

}
