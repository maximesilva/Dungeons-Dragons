package dungeonsdragons;

public class Weapon {
	private int weaponStat = 3;
	private String weaponName;
	
	//----------- CONSTRUCTOR --------------//
	Weapon(String weaponName){
		this.weaponName = weaponName;
	}
	
	//----------- GETTERS --------------//
	public int getWeaponStat() {
		return weaponStat;
	}
	public String getWeaponName() {
		return weaponName;
	}
	
	//----------- SETTERS --------------//
	public void setWeaponStat(int newWeaponStat) {
		this.weaponStat = newWeaponStat;
	}
	public void setWeaponName(String newWeaponName) {
		this.weaponName = newWeaponName;
	}
	
}
