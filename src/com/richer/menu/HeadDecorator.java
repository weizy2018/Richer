package com.richer.menu;

public class HeadDecorator extends MenuDecorator {

	public HeadDecorator(Menu menu) {
		super(menu);
		
	}
	
	@Override
	public boolean process() {
		showHead();
		boolean result = super.process();
		
		return result;
	}
	
	private void showHead() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("========================================");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("=                                      =");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("========================================");
	}

}
