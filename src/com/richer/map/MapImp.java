package com.richer.map;

import java.util.List;
import java.util.ArrayList;

import com.richer.block.Block;
import com.richer.block.TripBlock;
import com.richer.menu.MenuMgr;
import com.richer.player.Players;

public class MapImp {
	protected List<Block> blocks;
	
	public MapImp() {
		blocks = new ArrayList<Block>();
	}
	
	public void addBlock(Block block) {
		blocks.add(block);
	}
	public Block getBlock(int index) {
		return blocks.get(index);
	}
	public void showMap() {
		MenuMgr.getMenuMgr().getDeviceDecorator().draw("");
		for(int i=0;i<blocks.size();i++) {
			Block block = blocks.get(i);
			if (!Players.getPlayersIns().position(block)) {
				MenuMgr.getMenuMgr().getDevice().draw(" " + block.getName() + " ");
			}
			
			int n = i+1;
			if(n<blocks.size()) {
				if(blocks.get(n).getRow()!=block.getRow()) {//行尾
					MenuMgr.getMenuMgr().getDevice().drawln("");
					MenuMgr.getMenuMgr().getDeviceDecorator().draw("");
				}else {
					//输出空格
					int m = blocks.get(n).getCol() - block.getCol() - 1;
					while(m>0) {
						MenuMgr.getMenuMgr().getDevice().draw("   ");
						m--;
					}
				}
			}else {
				MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
			}
		}
	}
	public Block existBlock(int x, int y) {
		for (int i = 0; i < blocks.size(); ++i) {
			Block block = blocks.get(i);
			if (x == block.getRow() && y == block.getCol()) {
				return block;
			}
		}
		return null;
	}
	public void setTripBlockMoney() {
		for (Block block : blocks) {
			if (block instanceof TripBlock) {
				block.setMoney(-200);
			}
		}
	}
}
