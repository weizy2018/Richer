package com.richer.menu;

public class MainMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n\t 主菜单");
		System.out.println("1. New");
		System.out.println("2. Load");
		System.out.println("3. Save");
		System.out.println("4. Option");
		System.out.println("5. Play");
		System.out.println("0. Exit");
		System.out.print("Your selected:");
	}

	@Override
	public boolean doChoice(int choice) {
		System.out.println("\nYour selectd " + choice);
		
		switch(choice) {
		case 1: this.game.setCurMenu(MenuId.PLAYERS_MENU);return true;
		case 2: this.game.setCurMenu(MenuId.LOAD_MENU);return true;
		case 3: this.game.setCurMenu(MenuId.SAVE_MENU);return true;
		case 4: this.game.setCurMenu(MenuId.OPTION_MENU);return true;
		case 5: System.out.println("Now is playing ...");return true;
		default: return false;
		}
	}


}
