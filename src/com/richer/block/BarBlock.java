package com.richer.block;

public class BarBlock  implements Block,Cloneable{

	@Override
	public void showBlock() {
		System.out.print("C ");
		
	}

	@Override
	public Block clone() {
		try {
			return (BarBlock) super.clone();
		} catch (CloneNotSupportedException e) {
			
			e.printStackTrace();
		}
		return null;
	}


}
