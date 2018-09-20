package com.richer.map.director;

import com.richer.block.Block;
import com.richer.map.builder.MapBuilder;
import com.richer.map.builder.SimpleMapBuilder;

public class MapDirector {
	protected MapBuilder builder = null;
	public void buildMap(){
		builder = new SimpleMapBuilder();
		builder.buildMap();
	}
	public Block[][] getBuildedMap(){
		return builder.getMap();
	}

}
