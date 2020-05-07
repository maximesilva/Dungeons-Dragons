package dungeonsdragonsboard;

import java.util.ArrayList;

public class MainBoard {

	public static void main(String[] args) {
		Board newBoard = new Board();
		ArrayList<Case> cases = newBoard.generateCases();
		newBoard.showCase(cases);
	}
}
