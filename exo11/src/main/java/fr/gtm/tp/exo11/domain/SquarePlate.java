package fr.gtm.tp.exo11.domain;

public class SquarePlate extends Utensil implements Plate {
	
	private float score;

	public float calArea() {
		return score*score;
	}

	/**
	 * @return the score
	 */
	public float getScore() {
		return score;
	}

	/**
	 * @param score the score to set
	 */
	@Override
	public void setScore(Object obj) {
		this.score = Float.parseFloat(obj.toString());
	}
	
	@Override
	public String toString() {
		return super.toString().replace("Ustensile", "Assiette carrée");
	}

}
