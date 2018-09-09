package com.richer.menu;

public class ResolutionMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n\tSet Resolution");
		System.out.println("1. 640 x 320");
		System.out.println("2. 800 x 600");
		System.out.println("3. 1024 x 768");
		System.out.print("Your selected:");
	}

	@Override
	public boolean doChoice(int choice) {
		System.out.println("Choice = " + choice);
		switch(choice) {
		case 1: System.out.println("Set Resolution to 640 x 320");break;
		case 2: System.out.println("Set Resolution to 800 x 600");break;
		case 3: System.out.println("Set Resoluton to 1024 x 768");break;
		}
		this.game.setCurMenu(MenuId.OPTION_MENU);
		return true;
	}

}
