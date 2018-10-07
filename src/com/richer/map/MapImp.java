package com.richer.map;

import java.util.List;
import java.util.ArrayList;

import com.richer.block.Block;

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
//		int count = 0;
//		for(int r=0;r<BlocksId.MAP_ROWS;r++) {
//			for(int c=0;c<BlocksId.MAP_COLS;c++) {
//				Block block = blocks.get(count);
//				if(block!=null) {
//					System.out.print(block.getName() + " ");
//				}else {
//					System.out.print("  ");
//				}
//				count++;
//				
//			}
//			System.out.println("");
//		}
		for(int i=0;i<blocks.size();i++) {
			Block block = blocks.get(i);
			System.out.print(block.getName());
			int n = i+1;
			if(n<blocks.size()) {
				if(blocks.get(n).getRow()!=block.getRow()) {//行尾
					System.out.println("");
				}else {
					//输出空格
					int m = blocks.get(n).getCol() - block.getCol() - 1;
					while(m>0) {
						System.out.print(" ");
						m--;
					}
				}
			}else {
				System.out.println("");
			}
		}

		
	}

}
