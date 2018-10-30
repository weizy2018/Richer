package com.richer.menu;

import com.richer.main.Game;
import com.richer.player.Players;
import com.richer.player.command.*;
import com.richer.player.state.*;

public class PlayMenu extends Menu {

	@Override
	public void show() {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("\t Play Menu");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("1. Go...");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("2. ApplyRobCard");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("3. ApplyMeanCard");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("4. ApplyReturnSpell");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("5. ApplyFlyCard");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("6. ApplyFreezeSpell");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("7. ApplyHurtSpell");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("8. ApplyLuckCard");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("9. ApplyExFlyCard");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("10. ApplySuperCard");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("11. Load");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("12. Save");
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("0. Back to MainMenu");
		MenuMgr.getMenuMgr().getDeviceDecorator().draw("Your selected : ");

	}

	@Override
	public boolean doChoice(int choice) {
		MenuMgr.getMenuMgr().getDeviceDecorator().drawln("choice = " + choice);
		switch (choice) {
		case 1:
			Players.getPlayersIns().play();
			break;
		case 2:
			Command command1 = new ApplyRobCardCommand(Players.getPlayersIns().getApplyPlayer());
			command1.execute();
			break;
		case 3:
			Command command2 = new ApplyMeanCardCommand(Players.getPlayersIns().getApplyPlayer());
			command2.execute();
			break;
		case 4:
			Command command3 = new ApplyReturnSpellCommand(Players.getPlayersIns().getApplyPlayer());
			command3.execute();
			break;
		case 5:
			State state1 = new ApplyFlyCardState(Players.getPlayersIns().getApplyPlayer());
			state1.handle();
			break;
		case 6:
			State state2 = new ApplyFreezeSpellState(Players.getPlayersIns().getApplyPlayer());
			state2.handle();
			break;
		case 7:
			State state3 = new ApplyHurtSpellState(Players.getPlayersIns().getApplyPlayer());
			state3.handle();
			break;
		case 8:
			State state4 = new ApplyLuckCardState(Players.getPlayersIns().getApplyPlayer());
			state4.handle();
			break;
		case 9:
			State state5 = new ApplyExFlyCardState(Players.getPlayersIns().getApplyPlayer());
			state5.handle();
			break;
		case 10:
			State state6 = new ApplySuperCardState(Players.getPlayersIns().getApplyPlayer());
			state6.handle();
			break;
		case 11:
			Game.getInstance().setCurMenu(MenuId.LOAD_MENU);
			break;
		case 12:
			Game.getInstance().setCurMenu(MenuId.SAVE_MENU);
			break;
		case 0:
			Game.getInstance().setCurMenu(MenuId.MAIN_MENU);
			break;
			
		default:
			Game.getInstance().setCurMenu(MenuId.PLAY_MENU);
		}
		return true;
	}

	@Override
	public boolean process() {
		show();
		int choice = getChoice();
		return doChoice(choice);
	}

}
