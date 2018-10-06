package com.richer.block;

public class BlockFactory {
	public Block createBlock(int blockId) {
		
		switch(blockId) {
		case BlocksId.MONEY_BLOCK:return new MoneyBlock();
		case BlocksId.TRIP_BLOCK:return new TripBlock();
		case BlocksId.SLIDE_BLOCK:return new SlideBlock();
		case BlocksId.BAR_BLOCK:return new BarBlock();
		case BlocksId.E_BLOCK:return new EBlock();
		case BlocksId.F_BLOCK:return new FBlock();
		default:return null;
		}
	}
	public Block createBlock(int blockId,int row,int col,int left,int right,int up,int down) {
		Block block = null;
		switch(blockId) {
		case BlocksId.MONEY_BLOCK:
			block = new MoneyBlock(row,col,left,right,up,down);
			break;
		case BlocksId.TRIP_BLOCK:
			block = new TripBlock(row,col,left,right,up,down);
			break;
		case BlocksId.SLIDE_BLOCK:
			block = new TripBlock(row,col,left,right,up,down);
			break;
		case BlocksId.BAR_BLOCK:
			block = new TripBlock(row,col,left,right,up,down);
			break;
		case BlocksId.E_BLOCK:
				block = new TripBlock(row,col,left,right,up,down);
		break;
		case BlocksId.F_BLOCK:
			block = new TripBlock(row,col,left,right,up,down);
			break;
			
		}
		return block;
	}
}
