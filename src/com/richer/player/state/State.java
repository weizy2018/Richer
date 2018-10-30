package com.richer.player.state;

public abstract class State {
	
	public static final int NORMAL_STATE = 0;
	
	public static final int EXFLYCARD_STATE = 1;
	public static final int FLYCARD_STATE = 2;
	public static final int FREEZESPELL_STATE = 3;
	public static final int HURTSPELL_STATE = 4;
	public static final int LUCKCARD_STATE = 5;
	public static final int SUPERCARD_STATE = 6;
	
	public abstract void handle();

}
