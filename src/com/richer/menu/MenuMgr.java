package com.richer.menu;

public abstract class MenuMgr {
		private static Menu mainMenu = null;
		private static Menu loadMenu = null;
		private static Menu optionMenu = null;
		private static Menu playersMenu = null;
		private static Menu resolutionMenu = null;
		private static Menu saveMenu = null;
		private static Menu volumeMenu = null;
		
		private static MenuMgr menuMgr = null;
		
		private MenuMgr() {
			
		}
		public abstract Menu createMainMenu();
		public abstract Menu createLoadMenu();
		public abstract Menu createOptionMenu();
		public abstract Menu createPlayersMenu();
		public abstract Menu createResolutionMenu();
		public abstract Menu createSaveMenu();
		public abstract Menu createVolumeMenu();
		
		
//		public MenuMgr getMenuMgr() {
//			if(menuMgr==null) {
//				menuMgr = new MenuMgr();
//			}
//			return menuMgr;
//		}
		
		public static Menu getMainMenu() {
			if(mainMenu==null) {
				mainMenu = new MainMenu();
			}
			return mainMenu;
		}
		public static Menu getLoadMenu() {
			if(loadMenu==null) {
				loadMenu = new LoadMenu();
			}
			return loadMenu;
		}
		public static Menu getOptionMenu() {
			if(optionMenu==null) {
				optionMenu = new OptionMenu();
			}
			return optionMenu;
		}
		public static Menu getPlayersMenu() {
			if(playersMenu==null) {
				playersMenu = new PlayersMenu();
			}
			return playersMenu;
		}
		public static Menu getResolutionMenu() {
			if(resolutionMenu==null) {
				resolutionMenu = new ResolutionMenu();
			}
			return resolutionMenu;
		}
		public static Menu getSaveMenu() {
			if(saveMenu==null) {
				saveMenu = new SaveMenu();
			}
			return saveMenu;
		}
		public static Menu getVolumeMenu() {
			if(volumeMenu==null) {
				volumeMenu = new VolumeMenu();
			}
			return volumeMenu;
		}
		
}








