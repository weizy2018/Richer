package com.richer.iterator;

import com.richer.player.Player;

public interface AbsCppIterator {
	public void first();
	public void next();
	public boolean isLast();
	public Player current();
	public int count();
}
