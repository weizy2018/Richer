package com.richer.menu;

public class SaveMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n\tSelect the Record to save(1-5):");
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
		System.out.println("\nYou Choice = " + choice);
		if(choice!=0) {
			System.out.println("Record " + choice + " was saved");
		}
		
		this.game.setCurMenu(MenuId.MAIN_MENU);
		return true;
	}

}
