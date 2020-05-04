package dungeonsdragons;

public class Weapon {
	private int weaponStat = 3;
	private String weaponName;
	
	//----------- CONSTRUCTOR --------------//
	Weapon(String weaponName){
		this.weaponName = weaponName;
	}
	
	//----------- GETTERS --------------//
	public int getStat() {
		return weaponStat;
	}
	public String getName() {
		return weaponName;
	}
	
	//----------- SETTERS --------------//
	public void setStat(int newStat) {
		this.weaponStat = newStat;
	}
	public void setName(String newName) {
		this.weaponName = newName;
	}
}