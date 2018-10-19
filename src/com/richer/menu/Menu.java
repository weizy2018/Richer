package com.richer.menu;

import java.util.Scanner;

public abstract class Menu {
	public abstract void show();
	public abstract boolean doChoice(int choice);
	public abstract boolean process();
	
	public int getChoice() {
		int choice = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
}
