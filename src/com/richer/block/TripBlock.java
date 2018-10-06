package com.richer.block;

public class TripBlock extends Block {
	public TripBlock() {
		
	}
	public TripBlock(int row, int col, int left, int right, int up, int down) {
		super(row,col,left,right,up,down);
	}

	@Override
	public void showBlock() {
		System.out.print("B ");
		
	}
	@Override
	public Block clone(){
		return (TripBlock) super.clone();
		
	}
	@Override
	public char getName() {
		return 'B';
	}

}
