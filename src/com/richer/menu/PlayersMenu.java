package com.richer.menu;

public class PlayersMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n\t Set number of players(2-8):");
		System.out.println("2. 2");
		System.out.println("3. 3");
		System.out.println("4. 4");
		System.out.println("5. 5");
		System.out.println("6. 6");
		System.out.println("7. 7");
		System.out.println("8. 8");
		System.out.println("0. Back");
		System.out.print("Your selected:");
	}

	@Override
	public boolean doChoice(int choice) {
		System.out.println("Choice = " + choice);
		if(choice!=0) {
			System.out.println("Set number of players = " + choice);
		}
		this.game.setCurMenu(MenuId.MAIN_MENU);
		return true;
	}

}
