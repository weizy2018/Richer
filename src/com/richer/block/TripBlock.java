package com.richer.block;

public class TripBlock implements Block,Cloneable {

	@Override
	public void showBlock() {
		System.out.print("B ");
		
	}
	@Override
	public Block clone(){
		try {
			return (TripBlock) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return null;
		
	}

}
