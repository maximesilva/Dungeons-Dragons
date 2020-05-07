package dungeonsdragonsboard;

import java.util.ArrayList;

public class Board {

	public static final int SIZE = 10;

	public ArrayList<Case> generateCases() {
		ArrayList<Case> cases = new ArrayList<Case>();

		for (int i = 0; i < SIZE; i++) {
			int random = (int) (Math.random() * 4);
			
			if (random == 0) {
				CaseNull caseNull = new CaseNull();
				cases.add(i, caseNull);
			} else if (random == 1) {
				CasePotion potion = new CasePotion(3);
				cases.add(i, potion);
			}else if (random == 2) {
				CasePotion potion = new CasePotion(5);
				cases.add(i, potion);
			}
			else {
				MonsterCase monster = new MonsterCase("Goblin");
				cases.add(i, monster);
			}
		}
		return cases;
	}

	public void showCase(ArrayList<Case> board) {
		for (int i = 0; i < board.size(); i++) {
			System.out.println("Case n°" + i + "\n" + board.get(i).toString());
		}
	}
}
