package com.richer.map.director;

import com.richer.block.Block;
import com.richer.block.BlocksId;
import com.richer.map.Map;

public class EFMapDirector extends MapDirector {
	
	public EFMapDirector() {
		
	}
	
	@Override
	public void buildMap() {
		map = new Map(mapImp);
		
		int[][] layout = {
				{1,1,1,1,1},
				{2,0,0,0,2},
				{3,3,3,3,3},
				{4,0,0,0,4},
				{1,1,1,1,1}};
		
		for(int i=0;i<BlocksId.MAP_ROWS;i++) {
			for(int j=0;j<BlocksId.MAP_COLS;j++) {
				Block block = builder.buildBlock(layout[i][j]);
				if(block!=null) {
					block.setPosition(i, j);
					map.addBlock(block);
				}
				
			}
		}
		
	}
}
