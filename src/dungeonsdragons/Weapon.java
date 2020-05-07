package dungeonsdragons;
/**
 * Description
 * Instance une arme
 * @author silvamaxime
 *
 */
public class Weapon {
	private int weaponStat = 3;
	private String weaponName;
	
	//----------- CONSTRUCTOR --------------//
	Weapon(String weaponName){
		this.weaponName = weaponName;
	}
	
	public String toString(){
		return weaponName + " " + weaponStat + " de dégats.";
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