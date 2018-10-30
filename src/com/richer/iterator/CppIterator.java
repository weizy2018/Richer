package com.richer.iterator;

import java.util.List;

import com.richer.player.Player;
import com.richer.player.Players;

public class CppIterator implements AbsCppIterator {
	private Players players;
	private List<Player> playerList;
	private int index;
	
	public CppIterator(Players list) {
		this.players = list;
		this.playerList = list.getPlayerList();
		this.index = 0;
	}
	
	@Override
	public void first() {
		this.index = 0;
		
	}

	@Override
	public void next() {
		index ++;
		
	}

	@Override
	public boolean isLast() {
		return index == playerList.size();
	}

	@Override
	public Player current() {
		return this.playerList.get(index);
	}

	@Override
	public int count() {
		return index;
	}

}
