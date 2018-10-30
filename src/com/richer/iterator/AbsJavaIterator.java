package com.richer.iterator;

import com.richer.player.Player;

public interface AbsJavaIterator {
	public Player next();
	public boolean hasNext();
	public int count();
	
}
