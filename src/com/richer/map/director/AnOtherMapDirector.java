package com.richer.map.director;

import com.richer.block.Block;
import com.richer.map.builder.AnOtherMapBuilder;

public class AnOtherMapDirector extends MapDirector {
	
	public void buildMap(){
		builder = new AnOtherMapBuilder();
		builder.buildMap();
	}
	public Block[][] getBuildedMap(){
		return builder.getMap();
	}
}
