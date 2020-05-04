package dungeonsdragons;

public class Mage{
	private String name;
	private int healthPoint;
	private int powerPoint;
	private Spell spell;
	private String philtre;
	
	//----------- CONSTRUCTOR --------------//
	public Mage(String name, int healthPoint, int powerPoint, Spell spell, String philtre) {
		this.name = name;
		this.healthPoint = healthPoint;
		this.powerPoint = powerPoint;
		this.spell = spell; //instancier dans le construct
		this.philtre = philtre;
	}
	public Mage(String name, int healthPoint, int powerPoint, String philtre) {
		this.name = name;
		this.healthPoint = healthPoint;
		this.powerPoint = powerPoint;
		this.philtre = philtre;
	}
	public String toString() {
		return this.name + " " + this.healthPoint + " "+ this.spell;
	}
	//----------- GETTERS --------------//
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
	
	//----------- SETTERS --------------//
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
	public void setSpell(Spell spellStat) {
		this.spell = spellStat;
	}
}