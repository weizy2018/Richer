package com.richer.out;

public class TabDecorator extends OutDeviceDecorator {

	public TabDecorator(OutDevice device) {
		super(device);
	}
	
	@Override
	public void draw(String str) {
		drawTab();
		drawTab();
		super.draw(str);
	}
	
	@Override
	public void drawln(String str) {
		drawTab();
		drawTab();
		super.drawln(str);
	}
	
	private void drawTab() {
		System.out.print("\t");
	}

}
