package fr.gtm.tp.exo11.domain;

public class Spoon extends Utensil  {

	private float length;

	/**
	 * @return the length
	 */
	public float getLength() {
		return length;
	}

	/**
	 * @param length the length to set
	 */
	public void setLength(float length) {
		this.length = length;
	}

	@Override
	public void setScore(Object obj) {
		this.setLength(Float.parseFloat(obj.toString()));
		
	}
}
