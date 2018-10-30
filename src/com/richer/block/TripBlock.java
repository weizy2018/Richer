package com.richer.block;

public class TripBlock extends Block {
	public TripBlock() {
		this.money = -1;
	}
	public TripBlock(int row, int col, int left, int right, int up, int down) {
		super(row,col,left,right,up,down);
		this.money = -1;
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
