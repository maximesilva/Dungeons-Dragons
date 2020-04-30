package dungeonsdragons;

public class Warrior{
	private String name;
	private int healthPoint;
	private int powerPoint;
	private String shield;
	
	public Warrior(String name, int healthPoint, int powerPoint, String shield) {
		this.name = name;
		this.healthPoint = healthPoint;
		this.powerPoint = powerPoint;
		this.shield = shield;
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
	public String getShield() {
		return shield;
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
	public void setShield(String newShield) {
		this.shield = newShield;
	}
}