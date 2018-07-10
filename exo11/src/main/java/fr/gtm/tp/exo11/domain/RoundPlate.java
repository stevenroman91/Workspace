package fr.gtm.tp.exo11.domain;

public class RoundPlate extends Utensil implements Plate {

	private float radius;
	
	public float calArea() {
		return (float) (Math.pow(this.radius, 2)*Math.PI) ;
	}

	
	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}


	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	
	@Override
	public String toString() {
		return super.toString().replace("Ustensile", "Assiette ronde");
	}

	@Override
	public void setScore(Object obj) {
		this.setRadius(Float.parseFloat(obj.toString()));
	}

}
