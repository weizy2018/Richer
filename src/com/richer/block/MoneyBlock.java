package com.richer.block;

public class MoneyBlock extends Block {
	public MoneyBlock() {
		this.money = 5; 
	}
	public MoneyBlock(int row, int col, int left, int right, int up, int down) {
		super(row,col,left,right,up,down);
		this.money = 5;
	}

	@Override
	public void showBlock() {
		System.out.print("A ");
		
	}

	@Override
	public Block clone(){
		return (MoneyBlock) super.clone();
	}

	@Override
	public char getName() {
		return 'A';
	}
	
}
