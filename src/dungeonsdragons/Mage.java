package dungeonsdragons;
/**
 * Description
 * Mage enfant de Character qui prend les attributs de celui ci
 * @author silvamaxime
 *
 */
public class Mage extends Character{
	private Spell spell;
	private String philtre;
	
	//----------- CONSTRUCTOR --------------//
	/**
	 * Description
	 * Lors de l'instance d'un héro de type Mage
	 * @see Character
	 * @param name voir class Character
	 * @param healthPoint voir class Character
	 * @param powerPoint voir class Character
	 * @param spell instancie un sort
	 * @param philtre nom du philtre
	 */
	
	public Mage(String name, int healthPoint, int powerPoint, Spell spell, String philtre) {
		super(name, healthPoint, powerPoint);
		this.spell = spell; //instancier dans le construct
		this.philtre = philtre;
	}
	public Mage(String name, int healthPoint, int powerPoint, String philtre) {
		super(name, healthPoint, powerPoint);
		this.philtre = philtre;
	}
	public String toString() {
		return "Magicien : " + this.name + "\nPoint de vie : " + this.healthPoint + "\nSort : " + this.spell;
	}
	
	//----------- GETTERS --------------//
	public String getPhiltre() {
		return philtre;
	}
	
	//----------- SETTERS --------------//
	public void setPhiltre(String newPhiltre) {
		this.philtre = newPhiltre;
	}
	public void setSpell(Spell spellStat) {
		this.spell = spellStat;
	}
}