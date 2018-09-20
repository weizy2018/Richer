package com.richer.menu;

import java.util.Scanner;

import com.richer.main.Game;

public abstract class Menu {
	public abstract void show();
	public abstract boolean doChoice(int choice);
	public boolean process() {
		show();
		int choice = getChoice();
		return doChoice(choice);
	}
	public int getChoice() {
		int choice = 0;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		choice = sc.nextInt();
		sc.nextLine();
		return choice;
	}
}
