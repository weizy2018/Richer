package com.richer.menu;

public class SoundDecorator extends MenuDecorator {

	public SoundDecorator(Menu menu) {
		super(menu);

	}

	@Override
	public boolean process() {
		playSound();
		boolean result = super.process();
		stopSound();
		return result;
	}
	
	private void playSound() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("播放背景音乐...");
	}
	private void stopSound() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("停止背景音乐");
	}
	
	

}
