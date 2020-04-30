package dungeonsdragons;

import java.util.Scanner;
import java.util.ArrayList;

public class Game {

	// attribut dispo dans toute la class game

	Scanner sc = new Scanner(System.in);
	ArrayList<Warrior> newWarrior = new ArrayList<Warrior>();
	ArrayList<Mage> newMage = new ArrayList<Mage>();

	public void startGame() {
		boolean createMore = true;
		while (createMore) {

			// ------------- Choice Specification ------------//
			System.out.println("Veuillez saisir votre classe : Guerrier ou Magicien ?");
			String type = sc.nextLine();
			while (!type.equalsIgnoreCase("Guerrier") && !type.equalsIgnoreCase("Magicien")) {
				System.out.println("Non, vous avez le choix entre : Guerrier ou Magicien ?");
				type = sc.nextLine();

			}
			System.out.println("Vous avez choisi un " + type);
			if (type.equalsIgnoreCase("Guerrier")) {

				createWarrior();

			} else if (type.equalsIgnoreCase("Magicien")) {

				createMage();
			}
			System.out.println("Voulez-vous créer un autre personnage ? Oui ou Non ?");
			if (sc.nextLine().equalsIgnoreCase("Non")) {
				createMore = false;
			}
		}
		System.exit(0);
	}

	private void createMage() {

		// ------------- Choice Name ------------//
		System.out.println("Veuillez saisir votre nom : ");
		String newName = sc.nextLine();
		System.out.println("Votre nom est " + newName);

		// ------------- Choice Health Point ------------//
		System.out.println("Veuillez saisir vos points de vie entre 3 et 6 ? ");
		int newHealthPoint = sc.nextInt();
		sc.nextLine();
		while (newHealthPoint < 3 || newHealthPoint > 6) {
			System.out.println("Non ! Entre 3 et 6 ? ");
			newHealthPoint = sc.nextInt();
		}
		System.out.println("Vos points de vie sont de " + newHealthPoint);

		// ------------- Choice Strength ------------//
		System.out.println("Veuillez saisir votre force d'attaque entre 8 et 15 ? ");
		int newPowerPoint = sc.nextInt();
		sc.nextLine();
		while (newPowerPoint < 5 || newPowerPoint > 15) {
			System.out.println("Non ! Entre 8 et 15 ? ");
			newPowerPoint = sc.nextInt();
		}
		System.out.println("Votre force d'attaque est de " + newPowerPoint);

		// ------------- Choice Spell ------------//
		System.out.println("Veuillez saisir le nom de votre sort ? ");
		String newSpellName = sc.nextLine();
		System.out.println("Votre nouveau sort : " + newSpellName);
		Spell spellStat = new Spell(newSpellName);

		// ------------- Choice Philtre ------------//
		System.out.println("Veuillez saisir le nom de votre philtre ? ");
		String newPhiltre = sc.nextLine();
		System.out.println(newPhiltre + " vous protègera tout au long de votre aventure");

		Mage stat = new Mage(newName, newHealthPoint, newPowerPoint, newPhiltre);
		System.out.println(newName + " possède " + newHealthPoint + " points de vie, " + newPowerPoint
				+ " de force. Son sort " + newSpellName + " fait " + spellStat.getSpellStat() + " de dégats.");

		newMage.add(stat);

		System.out.println("Voulez-vous modifier votre personnage ? Oui ou non ? ");
		String answer = sc.nextLine();

		while (!answer.equalsIgnoreCase("oui") && !answer.equalsIgnoreCase("non")) {
			System.out.println("OUI OU NON ?!!!!!");
			answer = sc.nextLine();
		}
		if (answer.equalsIgnoreCase("oui")) {

			// ------------- Change Name ------------//
			System.out.println("Veuillez saisir votre nom : ");
			stat.setName(sc.nextLine());
			System.out.println("Votre nouveau nom est " + stat.getName());

			// ------------- Change Health Point ------------//
			System.out.println("Veuillez saisir vos noveaux points de vie entre 3 et 6 ? ");
			stat.setHealthPoint(sc.nextInt());

			while (stat.getHealthPoint() < 3 || stat.getHealthPoint() > 6) {
				System.out.println("Non ! Entre 3 et 6 ? ");
				stat.setHealthPoint(sc.nextInt());
			}
			sc.nextLine();
			System.out.println("Vos nouveaux points de vie sont de " + stat.getHealthPoint());

			// ------------- Change Strength ------------//
			System.out.println("Veuillez saisir votre nouvelle force d'attaque entre 8 et 15 ? ");
			stat.setPowerPoint(sc.nextInt());

			while (stat.getPowerPoint() < 8 || stat.getPowerPoint() > 15) {
				System.out.println("Non ! Entre 8 et 15 ? ");
				stat.setPowerPoint(sc.nextInt());
			}
			sc.nextLine();
			System.out.println("Votre nouvelle force d'attaque est de " + stat.getPowerPoint());

			// ------------- Change Spell ------------//
			System.out.println("Veuillez saisir le nouveau nom de votre sort ? ");
			spellStat.setSpellName(sc.nextLine());
			System.out.println("Votre nouveau sort : " + spellStat.getSpellName());

			// ------------- Change Philtre ------------//
			System.out.println("Veuillez saisir le nouveau nom de votre philtre ? ");
			stat.setPhiltre(sc.nextLine());
			System.out.println(stat.getPhiltre() + "vous protègera tout au long de votre aventure");

			System.out.println(stat.getName() + " possède " + stat.getHealthPoint() + " points de vie, "
					+ stat.getPowerPoint() + " de force. Son sort " + spellStat.getSpellName() + " fait "
					+ spellStat.getSpellStat() + " de dégats.");
			System.exit(0);

		} else if (answer.equalsIgnoreCase("non")) {

		}

	}

	private void createWarrior() {

		// ------------- Choice Name ------------//
		System.out.println("Veuillez saisir votre nom : ");
		String newName = sc.nextLine();
		System.out.println("Votre nom est " + newName);

		// ------------- Choice Health Point ------------//
		System.out.println("Veuillez saisir vos points de vie entre 5 et 10 ? ");
		int newHealthPoint = sc.nextInt();
		sc.nextLine();
		while (newHealthPoint < 5 || newHealthPoint > 10) {
			System.out.println("Non ! Entre 5 et 10 ? ");
			newHealthPoint = sc.nextInt();
		}
		System.out.println("Vos points de vie sont de " + newHealthPoint);

		// ------------- Choice Strength ------------//
		System.out.println("Veuillez saisir votre force d'attaque entre 5 et 10 ? ");
		int newPowerPoint = sc.nextInt();
		sc.nextLine();
		while (newPowerPoint < 5 || newPowerPoint > 10) {
			System.out.println("Non ! Entre 5 et 10 ? ");
			newPowerPoint = sc.nextInt();
		}
		System.out.println("Votre force d'attaque est de " + newPowerPoint);

		// ------------- Choice Weapon ------------//
		System.out.println("Veuillez saisir le nom de votre arme ? ");
		String newWeaponName = sc.nextLine();
		Weapon weaponStat = new Weapon(newWeaponName);
		System.out.println(newWeaponName + " à une puissance de " + weaponStat.getWeaponStat()
				+ " et je peux te dire que ça fait mal");

		// ------------- Choice Shield ------------//
		System.out.println("Veuillez saisir le nom de votre bouclier ? ");
		String newShieldName = sc.nextLine();
		System.out.println(newShieldName + " vous protègera tout au long de votre aventure");

		Warrior stat = new Warrior(newName, newHealthPoint, newPowerPoint, newShieldName);
		System.out.println(newName + " possède " + newHealthPoint + " points de vie, " + newPowerPoint + " de force. "
				+ newWeaponName + " fait " + weaponStat.getWeaponStat() + " de dégats.");

		newWarrior.add(stat);

		System.out.println("Voulez-vous modifier votre personnage ? Oui ou non ? ");
		String answer = sc.nextLine();

		while (!answer.equalsIgnoreCase("oui") && !answer.equalsIgnoreCase("non")) {
			System.out.println("OUI OU NON ?!!!!!");
			answer = sc.nextLine();
		}
		if (answer.equalsIgnoreCase("oui")) {

			// ------------- Change Name ------------//
			System.out.println("Veuillez saisir votre nom : ");
			stat.setName(sc.nextLine());
			System.out.println("Votre nouveau nom est " + stat.getName());

			// ------------- Change Health Point ------------//
			System.out.println("Veuillez saisir vos noveaux points de vie entre 5 et 10 ? ");
			stat.setHealthPoint(sc.nextInt());

			while (stat.getHealthPoint() < 5 || stat.getHealthPoint() > 10) {
				System.out.println("Non ! Entre 5 et 10 ? ");
				stat.setHealthPoint(sc.nextInt());
			}
			sc.nextLine();
			System.out.println("Vos nouveaux points de vie sont de " + stat.getHealthPoint());

			// ------------- Change Strength ------------//
			System.out.println("Veuillez saisir votre nouvelle force d'attaque entre 8 et 15 ? ");
			stat.setPowerPoint(sc.nextInt());

			while (stat.getPowerPoint() < 5 || stat.getPowerPoint() > 15) {
				System.out.println("Non ! Entre 8 et 15 ? ");
				stat.setPowerPoint(sc.nextInt());
			}
			sc.nextLine();
			System.out.println("Votre nouvelle force d'attaque est de " + stat.getPowerPoint());

			// ------------- Change Weapon ------------//
			System.out.println("Veuillez saisir le nouveau nom de votre arme ? ");
			weaponStat.setWeaponName(sc.nextLine());
			System.out.println("Votre nouvelle arme : " + weaponStat.getWeaponName());

			// ------------- Change Shield ------------//
			System.out.println("Veuillez saisir le nom de votre bouclier ? ");
			stat.setShield(sc.nextLine());
			System.out.println(stat.getShield() + "vous protègera tout au long de votre aventure");

			System.out.println(stat.getName() + " possède " + stat.getHealthPoint() + " points de vie, "
					+ stat.getPowerPoint() + " de force. Son sort " + weaponStat.getWeaponName() + " fait "
					+ weaponStat.getWeaponStat() + " de dégats.");

			System.exit(0);

		} else if (answer.equalsIgnoreCase("non")) {
	
		}
	}
}