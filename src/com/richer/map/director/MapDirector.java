package com.richer.map.director;

import com.richer.block.Block;
import com.richer.block.BlocksId;
import com.richer.map.builder.MapBuilder;
import com.richer.map.Map;
import com.richer.map.MapImp;

public class MapDirector {
	protected MapBuilder builder = null;
	protected Map map = null;
	protected MapImp mapImp = null;
	
	public MapDirector() {
		mapImp = new MapImp();//防止用的时候没有setMapImp就直接buildMap了
		builder = new MapBuilder();//默认使用MapBuilder
	}
	public void setBuilder(MapBuilder builder) {
		this.builder = builder;
	}
	public void setMapImp(MapImp mapImp) {
		this.mapImp = mapImp;
	}
	
	public void buildMap(){
		map = new Map(mapImp);
		int[][] layout = {
				{1,1,1,1,1},
				{2,0,0,0,2},
				{3,0,0,0,3},
				{4,0,0,0,4},
				{1,1,1,1,1}};

		for(int i=0;i<BlocksId.MAP_ROWS;i++) {
			for(int j=0;j<BlocksId.MAP_COLS;j++) {
				Block block = builder.buildBlock(layout[i][j]);
				if(block!=null) {
					block.setPosition(i, j);
					map.addBlock(block);	//空的不放进去
				}
			}
		}


	}
	public Map getMap() {
		return map;
	}
}
