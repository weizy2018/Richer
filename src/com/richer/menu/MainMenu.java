package com.richer.menu;

import com.richer.main.Game;

public class MainMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n\t 主菜单");
		System.out.println("1. New");
		System.out.println("2. Load");
		System.out.println("3. Save");
		System.out.println("4. Option");
		System.out.println("5. Play");
		System.out.println("6. Change Map");
		System.out.println("0. Exit");
		System.out.print("Your selected:");
	}

	@Override
	public boolean doChoice(int choice) {
		System.out.println("\nYour selectd " + choice);
		
		switch(choice) {
		case 1: Game.getInstance().setCurMenu(MenuId.PLAYERS_MENU);return true;
		case 2: Game.getInstance().setCurMenu(MenuId.LOAD_MENU);return true;
		case 3: Game.getInstance().setCurMenu(MenuId.SAVE_MENU);return true;
		case 4: Game.getInstance().setCurMenu(MenuId.OPTION_MENU);return true;
		case 5: System.out.println("Now is playing ...");
				Game.getInstance().play();return true;
		case 6: System.out.println("After change ...");
				Game.getInstance().changeMap();
				Game.getInstance().play();return true;
		default: return false;
		}
	}


}
