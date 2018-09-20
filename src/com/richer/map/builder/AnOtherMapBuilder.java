package com.richer.map.builder;

import com.richer.block.Block;
import com.richer.block.factory.BarBlockFactory;
import com.richer.block.factory.BlockFactory;
import com.richer.block.factory.MoneyBlockFactory;
import com.richer.block.factory.SlideBlockFactory;
import com.richer.block.factory.TripBlockFactory;

public class AnOtherMapBuilder extends MapBuilder {
	
	Block[][] map;
	
	BlockFactory moneyBlockFactory = new MoneyBlockFactory();
	BlockFactory slideBlockFactory = new SlideBlockFactory();
	BlockFactory tripBlockFactory = new TripBlockFactory();
	BlockFactory barBlockFactory = new BarBlockFactory();

	@Override
	public void buildMap() {
		map = new Block[5][5];
		for(int i=0;i<map[0].length;i++) {
			map[0][i] = moneyBlockFactory.createBlock();
			map[2][i] = barBlockFactory.createBlock();
			map[4][i] = moneyBlockFactory.createBlock();
		}
		map[1][0] = tripBlockFactory.createBlock();
		map[1][2] = tripBlockFactory.createBlock();
		map[3][0] = slideBlockFactory.createBlock();
		map[3][2] = slideBlockFactory.createBlock();
		
		
		
	}

	@Override
	public Block[][] getMap() {
		// TODO Auto-generated method stub
		return map;
	}

}
