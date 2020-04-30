package dungeonsdragons;

public class Spell {
	private int spellStat = 5;
	private String spellName;
	
	
	//----------- CONSTRUCTOR --------------//
	Spell (String spellName){
		this.spellName = spellName;
	}
	
	//----------- GETTERS --------------//
	public int getSpellStat() {
		return spellStat;
	}
	public String getSpellName() {
		return spellName;
	}
	
	//----------- SETTERS --------------//
	public void setSpellStat(int newSpellStat) {
		this.spellStat = newSpellStat;
	}
	public void setSpellName(String newSpellName) {
		this.spellName = newSpellName;
	}
}
