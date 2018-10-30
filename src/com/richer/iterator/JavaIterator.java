package com.richer.iterator;

import java.util.List;

import com.richer.player.Player;
import com.richer.player.Players;

public class JavaIterator implements AbsJavaIterator {
	private Players players;
	private List<Player> playerList;
	private int index;
	
	public JavaIterator(Players players) {
		this.players = players;
		this.playerList = players.getPlayerList();
		this.index = -1;
	}

	@Override
	public Player next() {
		index ++;
		return playerList.get(index);
	}

	@Override
	public boolean hasNext() {
		return index < playerList.size() - 1;
	}

	@Override
	public int count() {
		return index;
	}

}
