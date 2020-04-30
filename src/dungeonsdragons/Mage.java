package dungeonsdragons;

public class Mage{
	private String name;
	private int healthPoint;
	private int powerPoint;
	private String philtre;
	
	public Mage(String name, int healthPoint, int powerPoint, String philtre) {
		this.name = name;
		this.healthPoint = healthPoint;
		this.powerPoint = powerPoint;
		this.philtre = philtre;
	}
	public String getName() {
		return name;
	}
	public int getHealthPoint() {
		return healthPoint;
	}
	public int getPowerPoint() {
		return powerPoint;
	}
	public String getPhiltre() {
		return philtre;
	}
	public void setName(String newName) {
		this.name = newName;
	}
	public void setHealthPoint(int newHealthPoint) {
		this.healthPoint = newHealthPoint;
	}
	public void setPowerPoint(int newPowerPoint) {
		this.powerPoint = newPowerPoint;
	}
	public void setPhiltre(String newPhiltre) {
		this.philtre = newPhiltre;
	}
}