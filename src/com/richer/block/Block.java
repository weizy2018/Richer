package com.richer.block;

public abstract class Block implements Cloneable {
	
	protected int row;
	protected int col;
	
	protected int left;
	protected int right;
	protected int up;
	protected int down;
	
	protected int money = 0;
	
	public Block() {
		
	}
	public Block(int row, int col, int left, int right, int up, int down) {
		this.row = row;
		this.col = col;
		this.left = left;
		this.right = right;
		this.up = up;
		this.down = down;
	}
	
	
	public abstract void showBlock();
	public abstract char getName();
	
	public Block clone() {
		Block block = null;
		try {
			block = (Block)super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return block;
	}
	
		
	public void setPosition(int row,int col) {
		this.row = row;
		this.col = col;
	}
	
	public void setRow(int row) {
		this.row = row;
	}
	public int getRow() {
		return row;
	}
	public void setCol(int col) {
		this.col = col;
	}
	public int getCol() {
		return col;
	}
	public int getLeft() {
		return left;
	}
	public void setLeft(int left) {
		this.left = left;
	}
	public int getRight() {
		return right;
	}
	public void setRight(int right) {
		this.right = right;
	}
	public int getUp() {
		return up;
	}
	public void setUp(int up) {
		this.up = up;
	}
	public int getDown() {
		return down;
	}
	public void setDown(int down) {
		this.down = down;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	
}
