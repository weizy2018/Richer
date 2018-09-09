package com.richer.menu;

public class OptionMenu extends Menu {

	@Override
	public void show() {
		System.out.println("\n\t Set options :");
		System.out.println("1.Set the value of Volume(0-100)");
		System.out.println("2.Set the resolution");
		System.out.println("0. Back");
		System.out.print("Your selected: ");
	}

	@Override
	public boolean doChoice(int choice) {
		System.out.println("Choice = " + choice);
		if(choice==1) {
			this.game.setCurMenu(MenuId.VOLUME_MENU);
		}else if(choice==2) {
			this.game.setCurMenu(MenuId.RESOLUTION_MENU);
		}else {
			this.game.setCurMenu(MenuId.MAIN_MENU);
		}
		return true;
	}

}
