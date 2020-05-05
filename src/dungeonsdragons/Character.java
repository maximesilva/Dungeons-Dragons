package dungeonsdragons;

public class Character {
	protected String name;
	protected int healthPoint;
	protected int powerPoint;
	
	public Character(String name, int healthPoint, int powerPoint) {
		this.name = name;
		this.healthPoint = healthPoint;
		this.powerPoint = powerPoint;
	}
	
	//----------------- GETTERS --------------//
	public String getName() {
		return name;
	}
	public int getHealthPoint() {
		return healthPoint;
	}
	public int getPowerPoint() {
		return powerPoint;
	}
	
	//-------------- SETTERS ------------------//
	public void setName(String newName) {
		this.name = newName;
	}
	public void setHealthPoint(int newHealthPoint) {
		this.healthPoint = newHealthPoint;
	}
	public void setPowerPoint(int newPowerPoint) {
		this.powerPoint = newPowerPoint;
	}
}