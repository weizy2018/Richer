package com.richer.menu;

import com.richer.main.Game;

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
			Game.getInstance().setCurMenu(MenuId.VOLUME_MENU);
		}else if(choice==2) {
			Game.getInstance().setCurMenu(MenuId.RESOLUTION_MENU);
		}else {
			Game.getInstance().setCurMenu(MenuId.MAIN_MENU);
		}
		return true;
	}

}
