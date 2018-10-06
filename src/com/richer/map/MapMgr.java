package com.richer.map;

import com.richer.map.builder.*;
import com.richer.map.director.*;

public class MapMgr {
	private static MapMgr mapMgr = null;
	
	private Map curMap = null;
	
	private MapMgr() {
		
	}
	public static MapMgr getMapMgr() {
		if(mapMgr==null) {
			mapMgr = new MapMgr();
		}
		return mapMgr;
	}
	public void createMap() {
		MapDirector mapDirector = new DiffMapDirector();
		MapBuilder mapBuilder = new DiffMapBuilder();
		mapDirector.setBuilder(mapBuilder);
		mapDirector.buildMap();
		curMap = mapDirector.getMap();
	}
	
	public Map getCurMap() {
		return curMap;
	}
	

}
