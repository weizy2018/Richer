package com.richer.strategy;

import com.richer.block.BarBlock;
import com.richer.block.Block;
import com.richer.iterator.AbsJavaIterator;
import com.richer.main.Game;
import com.richer.map.MapMgr;
import com.richer.menu.MenuId;
import com.richer.menu.MenuMgr;
import com.richer.player.Direction;
import com.richer.player.HumanPlayer;
import com.richer.player.Player;
import com.richer.player.Players;
import com.richer.player.state.State;

public class AverageStrategy extends Strategy {

	@Override
	public void play() {
		int dir[][] = { { 0, 1 }, { 1, 0 }, { 0, -1 }, { -1, 0 } };
		for (AbsJavaIterator it = Players.getPlayersIns().createJavaIterator(); it.hasNext();) {
			Player player = it.next();
			boolean[] direction = new boolean[4];
			// 计算连通数
			int count = 0;
			for (int i = 0; i < 4; ++i) {
				Block block = MapMgr.getMapMgr().getCurMap().existBlock(player.getX() + dir[i][0], player.getY() + dir[i][1]);
				if (block != null) {
					count++;
					direction[i] = true;
				}
			}
			int d[] = new int[4];
			int n = 0;
			for (int i = 0; i < 4; i++) {
				if (direction[i]) {
					d[n++] = i;
				}
			}
			int nextDir = player.getDirection();

			if (count == 4) {
				nextDir = (int) (Math.random() * 10) % 4; // 等概率
			} else if (count == 3) {
				double ran = Math.random();
				if (ran <= 0.33d) {
					nextDir = d[0];
				} else if (ran > 0.33 && ran <= 0.66) {
					nextDir = d[1];
				} else {
					nextDir = d[2];
				}
			} else if (count == 2) {
				double ran = Math.random();
				if (ran <= 0.5d) {
					nextDir = d[0];
				} else {
					nextDir = d[1];
				}
			} else if (count == 1) {
				nextDir = player.getDirection();
			}

			player.setDirection((nextDir + 2) % 4); // 重新设置player来的方向

			if (nextDir == Direction.EAST) {
				for (int j = 1; j <= player.getStepSize(); ++j) {
					Block block = MapMgr.getMapMgr().getCurMap().existBlock(player.getX(), player.getY() + 1);
					if (block != null) {
						if ((block instanceof BarBlock) && player.getState() != State.EXFLYCARD_STATE) {
							break;
						} else {
							player.setMoney(player.getMoney() + block.getMoney());
						}
						player.setY(player.getY() + 1);
					} else {
						break;
					}
				}
			} else if (nextDir == Direction.SOUTH) {
				for (int j = 1; j <= player.getStepSize(); ++j) {
					Block block = MapMgr.getMapMgr().getCurMap().existBlock(player.getX() + 1, player.getY());
					if (block != null) {
						if ((block instanceof BarBlock) && player.getState() != State.EXFLYCARD_STATE) {
							break;
						} else {
							player.setMoney(player.getMoney() + block.getMoney());
						}
						player.setX(player.getX() + 1);
					}
				}
			} else if (nextDir == Direction.WEST) {
				for (int j = 1; j <= player.getStepSize(); ++j) {
					Block block = MapMgr.getMapMgr().getCurMap().existBlock(player.getX(), player.getY() - 1);
					if (block != null) {
						if ((block instanceof BarBlock) && player.getState() != State.EXFLYCARD_STATE) {
							break;
						} else {
							player.setMoney(player.getMoney() + block.getMoney());
						}
						player.setY(player.getY() - 1);
					}
				}
			} else if (nextDir == Direction.NORTH) {
				for (int j = 1; j <= player.getStepSize(); ++j) {
					Block block = MapMgr.getMapMgr().getCurMap().existBlock(player.getX() - 1, player.getY());
					if (block != null) {
						if ((block instanceof BarBlock) && player.getState() != State.EXFLYCARD_STATE) {
							break;
						} else {
							player.setMoney(player.getMoney() + block.getMoney());
						}
						player.setX(player.getX() - 1);
					} else {
						break;
					}
				}
			}
			player.execute();
			player.setMoney(player.getMoney() + player.getAddedMoney());
			
			MenuMgr.getMenuMgr().getDeviceDecorator().drawln("");
			MenuMgr.getMenuMgr().getDeviceDecorator()
					.drawln("玩家 " + player.getPlayerName() + " 金钱：" + player.getMoney());
			
			if (player.getMoney() < 0) {
				if (player instanceof HumanPlayer) {
					MenuMgr.getMenuMgr().getDeviceDecorator().drawln("您已经破产，游戏结束！");
					Game.getInstance().setCurMenu(MenuId.MAIN_MENU);
					return;
				} else {
					MenuMgr.getMenuMgr().getDeviceDecorator().drawln("玩家 " + player.getPlayerName() + " 已经破产！");
					Players.getPlayersIns().getPlayerList().remove(player);
					MapMgr.getMapMgr().getCurMap().setTripBlockMoney();
					
					if (Players.getPlayersIns().getPlayerList().size() == 1) {
						MenuMgr.getMenuMgr().getDeviceDecorator().drawln("胜利");
						Game.getInstance().setCurMenu(MenuId.MAIN_MENU);
						return;
					}
				}
			}
			
			if (player.getLoop() > 1) {
				player.setLoop(player.getLoop() - 1);
			} else {
				player.setStepSize(player.getDefaultStepSize());
				player.setAddedMoney(0);
				player.setState(State.NORMAL_STATE);
			}
		}
	}
}
