package com.richer.map;

import com.richer.block.Block;
import com.richer.block.BlockPrototype;
import com.richer.block.BlocksId;
import com.richer.block.factory.*;
import com.richer.map.director.AnOtherMapDirector;
import com.richer.map.director.MapDirector;

public class Map {
	Block[][] gameMap;
	
	MapDirector director;
	BlockPrototype prototype;
	
	BlockFactory moneyBlockFactory = new MoneyBlockFactory();
	BlockFactory sliderBlockFactory = new SlideBlockFactory();
	BlockFactory tripBlockFactory = new TripBlockFactory();
	BlockFactory barBlockFactory = new BarBlockFactory();
	
	//利用工厂方法模式创建的地图
	public void createMap() {
		gameMap = new Block[5][5];
		
		for(int i=0;i<gameMap.length;i++) {
			gameMap[0][i] = moneyBlockFactory.createBlock();
			gameMap[4][i] = moneyBlockFactory.createBlock();
		}
		gameMap[1][0] = tripBlockFactory.createBlock();
		gameMap[1][2] = tripBlockFactory.createBlock();
		gameMap[2][0] = barBlockFactory.createBlock();
		gameMap[2][2] = barBlockFactory.createBlock();
		gameMap[3][0] = sliderBlockFactory.createBlock();
		gameMap[3][2] = sliderBlockFactory.createBlock();
		
	}
	
	//利用生成器模式创建地图
	public void createMapByBuilder() {
		director = new AnOtherMapDirector();	//通过不同的Director创建另一个地图
		director.buildMap();
		this.gameMap = director.getBuildedMap();
	}
	//使用原型方法创建Map
	public void createMapByPrototype() {
		gameMap = new Block[5][5];
		prototype = new BlockPrototype();
		for(int i=0;i<5;i++) {
			gameMap[0][i] = prototype.cloneBlock(BlocksId.MONEYBLOCK_ID);
			gameMap[4][i] = prototype.cloneBlock(BlocksId.MONEYBLOCK_ID);
			gameMap[2][i] = prototype.cloneBlock(BlocksId.BARBLOCK_ID);
		}
		gameMap[1][0] = prototype.cloneBlock(BlocksId.TRIPBLOCK_ID);
		gameMap[1][2] = prototype.cloneBlock(BlocksId.TRIPBLOCK_ID);
		gameMap[3][0] = prototype.cloneBlock(BlocksId.TRIPBLOCK_ID);
		gameMap[3][2] = prototype.cloneBlock(BlocksId.TRIPBLOCK_ID);
	}
	//动态改变地图
	public void DynamicChangeMap() {
		//将地图中的A换成E，C换成F
		for(int i=0;i<gameMap[0].length;i++) {
			gameMap[0][i] = prototype.cloneBlock(BlocksId.EBLOCK_ID);
			gameMap[4][i]= prototype.cloneBlock(BlocksId.EBLOCK_ID);
			gameMap[2][i] = prototype.cloneBlock(BlocksId.FBLOCK_ID);
		}
	}
	public void showMap() {		//将地图打印出来
		for(int i=0;i<gameMap.length;i++) {
			for(int j=0;j<gameMap[i].length;j++) {
				if(gameMap[i][j]!=null) {
					gameMap[i][j].showBlock();
				}
			}
			System.out.println("");
		}
	}
	
	
	
	

}
