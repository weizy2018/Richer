package com.richer.menu;

public class LoadMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n\t Select the Record to be loaded(1-5):");
		System.out.println("1. 1");
		System.out.println("2. 2");
		System.out.println("3. 3");
		System.out.println("4. 4");
		System.out.println("5. 5");
		System.out.println("0. Back");
		System.out.print("Your selected: ");
	}

	@Override
	public boolean doChoice(int choice) {
		System.out.println("Choice = " + choice);
		if(choice!=0) {
			System.out.println("Loading record with id = " + choice);
		}
		this.game.setCurMenu(MenuId.MAIN_MENU);
		
		return true;
	}

}
