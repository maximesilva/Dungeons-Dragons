package dungeonsdragonsboard;

public class MonsterCase extends CaseMalus {
	String name;
	
	public MonsterCase(String name) {
		this.name = name;
	}
	
	
	@Override
	public String toString() {
		//%s et %d sont des puces remplacé respectivement par ce qui suit
		return String.format("ATTENTION UN %s", this.name);	
	}
	
	@Override
	public void event() {
		// TODO Auto-generated method stub
		
	}
}
