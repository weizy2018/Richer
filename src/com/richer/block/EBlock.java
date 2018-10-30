package com.richer.block;

public class EBlock extends Block {
	public EBlock() {
		this.money = 1;
	}
	public EBlock(int row, int col, int left, int right, int up, int down) {
		super(row,col,left,right,up,down);
		this.money = 1;
	}

	@Override
	public void showBlock() {
		System.out.print("E ");
		
	}

	@Override
	public Block clone() {
		return (EBlock)super.clone();
	}

	@Override
	public char getName() {
		return 'E';
	}

}
