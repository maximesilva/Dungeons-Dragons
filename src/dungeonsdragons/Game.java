package dungeonsdragons;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {

	// attribut dispo dans toute la class Game
	private Scanner sc;
	private ArrayList<Character> newCharacter;
	private String answer;

	public Game() {
		this.sc = new Scanner(System.in);
		this.newCharacter = new ArrayList<Character>();
	}

	public void startGame() {
		System.out.println(
				"(C)réer un personnage\n(L)ister les personnages\n(Q)uitter\nFaites votre choix ?");
		answer = sc.nextLine();
		if (answer.equalsIgnoreCase("C")) {
			createHero();

		} else if (answer.equalsIgnoreCase("L")) {
			if (newCharacter.isEmpty()) {
				System.out.println("Pas de héros, veuillez en créer un.");
				startGame();

			} else {
				seeList();
			}
		} else if (answer.equalsIgnoreCase("Q")) {
			System.exit(0);
		}
	}

	private void seeList() {
		for (int i = 0; i < newCharacter.size(); i++) {
			System.out.println(newCharacter.get(i).toString());
		}
		System.out.println(
				"(M)odifier un personnage\n(S)upprimer un personnage\n(Q)uitter\nFaites votre choix ?");
		answer = sc.nextLine();
		if (answer.equalsIgnoreCase("M")) {
			
		}else if (answer.equalsIgnoreCase("S")){
			
		}else if (answer.equalsIgnoreCase("Q")) {
			startGame();
		}
	}

	private void createHero() {
		// ------------- Choice Specification ------------//
		System.out.println("Veuillez saisir votre classe : Guerrier ou Magicien ?");
		String type = sc.nextLine();

		// recursivité rappelé la methode dans la methode
		while (!type.equalsIgnoreCase("Guerrier") && !type.equalsIgnoreCase("Magicien")) {
			System.out.println("Non, vous avez le choix entre : Guerrier ou Magicien ?");
			type = sc.nextLine();
			// createHero();
		}
		System.out.println("Vous avez choisi un " + type);
		if (type.equalsIgnoreCase("Guerrier")) {

			createWarrior();

		} else if (type.equalsIgnoreCase("Magicien")) {

			createMage();
		}
	}

	private String askForString(String question) {
		// ------------- Choice Name ------------//
		System.out.println(question);
		String newValue = sc.nextLine();
		System.out.println("Vous avez choisi : " + newValue);

		return newValue;
	}

	private int askForInt(String question, int statMin, int statMax) {
		// ------------- Choice Health Point ------------//
		System.out.println(question);
		int newValue = sc.nextInt();
		while (newValue < statMin || newValue > statMax) {
			System.out.println("Non ! Entre " + statMin + " et " + statMax + " ? ");
			newValue = sc.nextInt();
		}
		sc.nextLine();
		System.out.println("Vos points de vie sont de " + newValue);

		return newValue;
	}

	private void createMage() {

		// ------------- Choice Name ------------//
		String newName = askForString("Veuillez entrer votre nom ?");

		// ------------- Choice Health Point ------------//
		int newHealthPoint = askForInt("Veuillez saisir vos points de vie entre 3 et 6 ? ", 3, 6);

		// ------------- Choice Strength ------------//
		int newPowerPoint = askForInt("Veuillez saisir votre force d'attaque entre 8 et 15 ?", 8, 15);

		// ------------- Choice Spell ------------//
		String newSpellName = askForString("Veuillez saisir le nom de votre sort ?");
		Spell spellStat = new Spell(newSpellName);

		// ------------- Choice Philtre ------------//
		String newPhiltre = askForString("Veuillez saisir le nom de votre philtre ?");

		// instancier dans le constructeur
		// Mage stat = new Mage(newName, newHealthPoint, newPowerPoint, spellStat,
		// newPhiltre);

		// utilisation d'un setteur pour modifier attribut priver de la class Mage
		Mage stat = new Mage(newName, newHealthPoint, newPowerPoint, newPhiltre);
		stat.setSpell(spellStat);

		System.out.println(newName + " possède " + newHealthPoint + " points de vie, " + newPowerPoint
				+ " de force. Son sort " + newSpellName + " fait " + spellStat.getStat() + " de dégats.");

		System.out.println("Voulez-vous modifier votre personnage ? Oui ou non ? ");
		answer = sc.nextLine();

		while (!answer.equalsIgnoreCase("oui") && !answer.equalsIgnoreCase("non")) {
			System.out.println("OUI OU NON ?!!!!!");
			answer = sc.nextLine();
		}
		if (answer.equalsIgnoreCase("oui")) {

			modifyCharacter(stat, 3, 6, 8, 15);

			// ----------------------- Change Spell -----------------------//
			System.out.println("Veuillez saisir le nouveau nom de votre sort ? ");
			spellStat.setName(sc.nextLine());
			System.out.println("Votre nouveau sort : " + spellStat.getName());

			// ----------------------- Change Philtre --------------------------//
			System.out.println("Veuillez saisir le nouveau nom de votre philtre ? ");
			stat.setPhiltre(sc.nextLine());
			System.out.println(stat.getPhiltre() + "vous protègera tout au long de votre aventure");

			System.out.println(stat.getName() + " possède " + stat.getHealthPoint() + " points de vie, "
					+ stat.getPowerPoint() + " de force. Son sort " + spellStat.getName() + " fait "
					+ spellStat.getStat() + " de dégats.");

			// ------------------- SAVE HERO -----------------------//
			saveCharacter(stat);

		} else if (answer.equalsIgnoreCase("non")) {
			saveCharacter(stat);
		}
	}

	private void createWarrior() {

		// ------------- Choice Name ------------//
		String newName = askForString("Veuillez entrer votre nom ?");

		// ------------- Choice Health Point ------------//
		int newHealthPoint = askForInt("Veuillez saisir vos points de vie entre 3 et 6 ? ", 5, 10);

		// ------------- Choice Strength ------------//
		int newPowerPoint = askForInt("Veuillez saisir votre force d'attaque entre 8 et 15 ?", 5, 10);
		// ------------- Choice Weapon ------------//
		String newWeaponName = askForString("Veuillez saisir le nom de votre arme ?");
		Weapon weaponStat = new Weapon(newWeaponName);
		System.out.println(
				newWeaponName + " à une puissance de " + weaponStat.getStat() + " et je peux te dire que ça fait mal");

		// ------------- Choice Shield ------------//
		String newShieldName = askForString("Veuillez saisir le nom de votre bouclier ?");

		Warrior stat = new Warrior(newName, newHealthPoint, newPowerPoint, newShieldName);
		stat.setWeapon(weaponStat);

		System.out.println(newName + " possède " + newHealthPoint + " points de vie, " + newPowerPoint + " de force. "
				+ newWeaponName + " fait " + weaponStat.getStat() + " de dégats.");

		System.out.println("Voulez-vous modifier votre personnage ? Oui ou non ? ");
		answer = sc.nextLine();

		while (!answer.equalsIgnoreCase("oui") && !answer.equalsIgnoreCase("non")) {
			System.out.println("OUI OU NON ?!!!!!");
			answer = sc.nextLine();
		}
		if (answer.equalsIgnoreCase("oui")) {

			modifyCharacter(stat, 5, 10, 5, 10);

			// ------------- Change Weapon ------------//
			System.out.println("Veuillez saisir le nouveau nom de votre arme ? ");
			weaponStat.setName(sc.nextLine());
			System.out.println("Votre nouvelle arme : " + weaponStat.getName());

			// ------------- Change Shield ------------//
			System.out.println("Veuillez saisir le nom de votre bouclier ? ");
			stat.setShield(sc.nextLine());
			System.out.println(stat.getShield() + "vous protègera tout au long de votre aventure");

			System.out.println(stat.getName() + " possède " + stat.getHealthPoint() + " points de vie, "
					+ stat.getPowerPoint() + " de force. Son sort " + weaponStat.getName() + " fait "
					+ weaponStat.getStat() + " de dégats.");

			// ------------------- SAVE HERO -----------------------//
			saveCharacter(stat);

		} else if (answer.equalsIgnoreCase("non")) {
			saveCharacter(stat);
		}
	}

	private void saveCharacter(Character stat) {
		System.out.println("Voulez-vous enregistré votre nouvel héro " + stat.getName() + " ?");
		answer = sc.nextLine();
		while (!answer.equalsIgnoreCase("oui") && !answer.equalsIgnoreCase("non")) {
			System.out.println("OUI OU NON ?!!!!!");
			answer = sc.nextLine();
		}
		if (answer.equalsIgnoreCase("oui")) {
			newCharacter.add(stat);
			System.out.println("Nouveau personnage enregistré");
			startGame();
		} else {
			startGame();
		}
	}

	private void modifyCharacter(Character stat, int hpMin, int hpMax, int ppMin, int ppMax) {
		// ------------- Change Name ------------//
		System.out.println("Veuillez saisir votre nouveau nom : ");
		stat.setName(sc.nextLine());
		System.out.println("Votre nouveau nom est " + stat.getName());

		// ------------- Change Health Point ------------//
		System.out.println("Veuillez saisir vos noveaux points de vie entre " + hpMin + " et " + hpMax + " ?");
		stat.setHealthPoint(sc.nextInt());

		while (stat.getHealthPoint() < hpMin || stat.getHealthPoint() > hpMax) {
			System.out.println("Non ! Entre " + hpMin + " et " + hpMax + " ?");
			stat.setHealthPoint(sc.nextInt());
		}
		sc.nextLine();
		System.out.println("Vos nouveaux points de vie sont de " + stat.getHealthPoint());

		// ------------------ Change Strength -------------------------//
		System.out.println("Veuillez saisir votre nouvelle force d'attaque entre " + ppMin + " et " + ppMax + " ?");
		stat.setPowerPoint(sc.nextInt());

		while (stat.getPowerPoint() < ppMin || stat.getPowerPoint() > ppMax) {
			System.out.println("Non ! Entre " + ppMin + " et " + ppMax + " ?");
			stat.setPowerPoint(sc.nextInt());
		}
		sc.nextLine();
		System.out.println("Votre nouvelle force d'attaque est de " + stat.getPowerPoint());
	}
}