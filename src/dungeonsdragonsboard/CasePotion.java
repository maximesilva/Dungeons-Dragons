package dungeonsdragonsboard;

public class CasePotion extends CaseBonus{
	String name;
	int potionEffect;
	
	public CasePotion(int potionEffect) {
		this.name = "Potion";
		this.potionEffect = potionEffect;
	}
	
	@Override
	public String toString() {
		//%s et %d sont des puces remplacé respectivement par ce qui suit
		return String.format("%s qui rend %d pv", this.name, this.potionEffect);	
	}
	@Override
	public void event() {
		// TODO Auto-generated method stub
	}
}

