package com.richer.map;

import com.richer.block.Block;

public class Map {
	protected MapImp mapImp;

	public Map(MapImp aImp) {
		this.mapImp = aImp;
	}
	public void addBlock(Block block) {
		mapImp.addBlock(block);
	}
	public Block getBlock(int index) {
		return mapImp.getBlock(index);
	}
	
	public void showMap() {		//将地图打印出来
		mapImp.showMap();
	}
	
	
	
	

}
