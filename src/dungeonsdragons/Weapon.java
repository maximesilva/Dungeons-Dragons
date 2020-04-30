package dungeonsdragons;

public class Weapon {
	private int weaponStat = 3;
	private String weaponName;
	
	Weapon(String weaponName){
		this.weaponName = weaponName;
	}
	
	public int getWeaponStat() {
		return weaponStat;
	}
	public String getWeaponName() {
		return weaponName;
	}
	public void setWeaponStat(int newWeaponStat) {
		this.weaponStat = newWeaponStat;
	}
	public void setWeaponName(String newWeaponName) {
		this.weaponName = newWeaponName;
	}
	
}
