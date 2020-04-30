package dungeonsdragons;

public class Spell {
	private int spellStat = 5;
	private String spellName;
	
	Spell (String spellName){
		this.spellName = spellName;
	}
	public int getSpellStat() {
		return spellStat;
	}
	public String getSpellName() {
		return spellName;
	}
	public void setSpellStat(int newSpellStat) {
		this.spellStat = newSpellStat;
	}
	public void setSpellName(String newSpellName) {
		this.spellName = newSpellName;
	}
}
