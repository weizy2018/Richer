package com.richer.menu;

public class VolumeMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n\tSet Volume");
		System.out.print("Input value(0-100):");
	}

	@Override
	public boolean doChoice(int choice) {
		System.out.println("Choice = " + choice);
		System.out.println("Set Volume to " + choice);
		this.game.setCurMenu(MenuId.OPTION_MENU);
		return true;
	}

}
