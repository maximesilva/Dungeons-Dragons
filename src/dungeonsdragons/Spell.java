package dungeonsdragons;

public class Spell {
	private int spellStat = 5;
	private String spellName;
	
	
	//----------- CONSTRUCTOR --------------//
	Spell (String spellName){
		this.spellName = spellName;
	}
	
	public String toString(){
		return spellName + " " + spellStat;
	}
	//----------- GETTERS --------------//
	public int getStat() {
		return spellStat;
	}
	public String getName() {
		return spellName;
	}
	
	//----------- SETTERS --------------//
	public void setStat(int newStat) {
		this.spellStat = newStat;
	}
	public void setName(String newName) {
		this.spellName = newName;
	}
}
