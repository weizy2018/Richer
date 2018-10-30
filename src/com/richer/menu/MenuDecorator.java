package com.richer.menu;

public class MenuDecorator extends Menu {
	private Menu menu;
	
	public MenuDecorator(Menu menu) {
		this.menu = menu;
	}

	@Override
	public void show() {
		menu.show();

	}

	@Override
	public boolean doChoice(int choice) {
		return menu.doChoice(choice);
	}

	@Override
	public boolean process() {
		return menu.process();
	}

}
