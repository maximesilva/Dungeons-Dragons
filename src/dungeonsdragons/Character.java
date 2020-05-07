package dungeonsdragons;
/**
 * Description
 * Character est la base d'un héro
 * @author silvamaxime
 *
 */
public class Character {
	protected String name;
	protected int healthPoint;
	protected int powerPoint;
/**
 * Description
 * lors de l'instance d'un nouvel héro
 * @param name est le nom du héro
 * @param healthPoint ses points de vie
 * @param powerPoint sa force d'attaque
 */
	public Character(String name, int healthPoint, int powerPoint) {
		this.name = name;
		this.healthPoint = healthPoint;
		this.powerPoint = powerPoint;
	}
	//----------------- GETTERS --------------//
	/**
	 * GETTER getName	
	 * @return retourne le nom du héro
	 */
	
	public String getName() {
		return name;
	}
	/**
	 * GETTER getHealthPoint
	 * @return retourne les points de vies du héro
	 */
	public int getHealthPoint() {
		return healthPoint;
	}
	/**
	 * GETTER getPowerPoint
	 * @return retourne la force d'attaque du héro
	 */
	public int getPowerPoint() {
		return powerPoint;
	}
	//-------------- SETTERS ------------------//
	/**
	 * SETTER setName
	 * @param newName prend en paramètre le nouveau nom du héro
	 */
	public void setName(String newName) {
		this.name = newName;
	}
	/**
	 * SETTER setHealthPoint
	 * @param newHealthPoint prend en paramètre les nouveaux points de vies du héro
	 */
	public void setHealthPoint(int newHealthPoint) {
		this.healthPoint = newHealthPoint;
	}
	/**
	 * SETTER setPowerPoint
	 * @param newPowerPoint prend en paramètre la nouvelle force d'attaque du héro
	 */
	public void setPowerPoint(int newPowerPoint) {
		this.powerPoint = newPowerPoint;
	}
}