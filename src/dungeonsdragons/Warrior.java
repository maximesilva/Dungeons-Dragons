package dungeonsdragons;

public class Warrior extends Character{
	private Weapon weapon;
	private String shield;
	
	//----------- CONSTRUCTOR --------------//
	public Warrior(String name, int healthPoint, int powerPoint, Weapon weapon, String shield) {
		super(name, healthPoint, powerPoint);
		this.weapon = weapon;//instancier dans le construct
		this.shield = shield;
	}
	public Warrior(String name, int healthPoint, int powerPoint, String shield) {
		super(name, healthPoint, powerPoint);
		this.shield = shield;
	}
	
	public String toString() {
		return "Guerrier : " + this.name + "\nPoints de vie : " + this.healthPoint + "\nArme : "+ this.weapon;
	}
	//----------- GETTERS --------------//
	
	public String getShield() {
		return shield;
	}
	
	//----------- SETTERS --------------//
	public void setWeapon(Weapon weaponStat) {
		this.weapon = weaponStat;
	}
	public void setShield(String newShield) {
		this.shield = newShield;
	}
}