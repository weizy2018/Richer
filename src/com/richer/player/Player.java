package com.richer.player;

import com.richer.card.Tools;
import com.richer.menu.MenuMgr;
import com.richer.player.state.State;

public abstract class Player {
	protected int x;
	protected int y;
	protected char leftSign;
	protected char rightSign;
	protected String playerName;
	protected int stepSize;
	protected int direction = Direction.DEFAULT;
	protected int money = 20;
	protected int addedMoney = 0;
	
	protected int state = State.NORMAL_STATE;
	
	private int loop = 1;
	
	protected int defaultStepSize;
	protected int defaultLoop;
	
	
	public abstract void execute();
	
	public abstract void accept(Tools card);
	
	public void applyRobCard(Player target) {
		
		target.setMoney(target.getMoney()/2);
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		for (Player player : Players.getPlayersIns().getPlayerList()) {
			MenuMgr.getMenuMgr().getDeviceDecorator().drawln("玩家 " + player.getPlayerName() + " 金钱：" + player.getMoney());
		}
	}
	public void applyMeanCard() {
		
		int money = 0;
		for (Player player : Players.getPlayersIns().getPlayerList()) {
			money += player.getMoney();
		}
		int aver = money/Players.getPlayersIns().getPlayerList().size();
		for (Player player : Players.getPlayersIns().getPlayerList()) {
			player.setMoney(aver);
		}
		
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
		for (Player player : Players.getPlayersIns().getPlayerList()) {
			MenuMgr.getMenuMgr().getDeviceDecorator().drawln("玩家 " + player.getPlayerName() + " 金钱：" + player.getMoney());
		}
		
	}
	public void applyReturnSpell(Player target) {
		target.setX(0);
		target.setY(0);
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("Apply success !");
	}
	
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}

	public char getLeftSign() {
		return leftSign;
	}

	public void setLeftSign(char leftSign) {
		this.leftSign = leftSign;
	}

	public char getRightSign() {
		return rightSign;
	}

	public void setRightSign(char rightSign) {
		this.rightSign = rightSign;
	}

	public String getPlayerName() {
		return playerName;
	}

	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}

	public int getStepSize() {
		return stepSize;
	}

	public void setStepSize(int stepSize) {
		this.stepSize = stepSize;
	}

	public int getDirection() {
		return direction;
	}

	public void setDirection(int direction) {
		this.direction = direction;
	}
	
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}

	public int getLoop() {
		return loop;
	}

	public void setLoop(int loop) {
		this.loop = loop;
	}

	public int getDefaultStepSize() {
		return defaultStepSize;
	}

	public void setDefaultStepSize(int defaultStepSize) {
		this.defaultStepSize = defaultStepSize;
	}

	public int getDefaultLoop() {
		return defaultLoop;
	}

	public void setDefaultLoop(int defaultLoop) {
		this.defaultLoop = defaultLoop;
	}
	public int getAddedMoney() {
		return addedMoney;
	}

	public void setAddedMoney(int addedMoney) {
		this.addedMoney = addedMoney;
	}

	public int getState() {
		return state;
	}

	public void setState(int state) {
		this.state = state;
	}
	
	

}
