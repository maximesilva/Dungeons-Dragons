package dungeonsdragonsboard;

public class CaseNull extends Case {
	String caseNull;
	public CaseNull() {
		this.caseNull = "Vide";
	}
	
	@Override
	public String toString() {
		return caseNull;	
	}
	
	@Override
	public void event() {
		
	}
}