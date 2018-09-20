package com.richer.block;

public class MoneyBlock implements Block,Cloneable {

	@Override
	public void showBlock() {
		System.out.print("A ");
		
	}

	@Override
	public Block clone(){
		
		try {
			return (MoneyBlock) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return null;
	}
	
}
