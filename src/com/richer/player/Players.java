package com.richer.player;

import java.util.ArrayList;
import java.util.List;

import com.richer.iterator.*;

import com.richer.block.Block;
import com.richer.menu.MenuMgr;
import com.richer.strategy.*;

public class Players {
	private static Players playersIns = null;
	private List<Player> playerList = null;
	private Strategy strategy;
	
	private int inDir;
	
	private Players() {
		playerList = new ArrayList<Player>();
		playerList.add(new HumanPlayer(0, 0, "HumanPlayer"));
		playerList.add(new HandsomePlayer(0, 0, "HandsomePlayer"));
		playerList.add(new BeautifulPlayer(0, 0, "BeautifulPlayer"));
		playerList.add(new AutoPlayer(0, 0, "AutoPlayer1"));
		playerList.add(new AutoPlayer(0, 0, "AutoPlayer2"));
		setInDir(Direction.UNDEFINED);
	}
	public static Players getPlayersIns() {
		if (playersIns == null) {
			playersIns = new Players();
		}
		return playersIns;
	}
	public List<Player> getPlayerList(){
		return this.playerList;
	}
	public void addPlayer(Player player) {
		this.playerList.add(player);
	}
	public void play() {
		strategy.play();
	}
	public boolean position(Block block) {
		for (int i = 0; i < playerList.size(); ++i) {
			Player player = playerList.get(i);
			//如果玩家和自动玩家在同一个block的话只显示一个位置
			if (player.x == block.getRow() && player.y == block.getCol()) {
				MenuMgr.getMenuMgr().getDevice().draw("" + player.leftSign);
				MenuMgr.getMenuMgr().getDevice().draw("X");
				MenuMgr.getMenuMgr().getDevice().draw("" + player.rightSign);
				return true;
			}
		}
		return false;
	}
	public AbsCppIterator createCppIterator() {
		return new CppIterator(this);
	}
	public AbsJavaIterator createJavaIterator() {
		return new JavaIterator(this);
	}
	
	public int getInDir() {
		return inDir;
	}
	public void setInDir(int inDir) {
		this.inDir = inDir;
		if (inDir == Direction.UNDEFINED) {
			this.strategy = new DefaultStrategy();
		} else if (inDir == Direction.NONE) {
			this.strategy = new AverageStrategy();
		} else {
			this.strategy = new NotAverageStrategy();
		}
	}
	
	public Player getApplyPlayer() {
		int ram = (int)(Math.random()*10)%playerList.size();
		return playerList.get(ram);
	}
	
	
	

}
