package ru.itx.EveAssets.production.blueprint;

import ru.itx.EveAssets.production.Blueprint;

public abstract class BlueprintI extends Blueprint {

	public static int DEFAULT_ME=10;
	public static int DEFAULT_TE=20;
	public static int DEFAULT_RUNS=10;

	
	public BlueprintI() {
		me=DEFAULT_ME;
		te=DEFAULT_TE;
		runs=DEFAULT_RUNS;
	}

}
