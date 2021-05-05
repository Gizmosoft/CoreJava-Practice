package com.accenture.lkm.thread.client;

import com.accenture.lkm.thread.sync.SevenTables;
import com.accenture.lkm.thread.sync.ThreeTables;

public class SyncClient {

	public static void main(String[] args) {
		ThreeTables three = new ThreeTables();
		three.start();

		SevenTables seven = new SevenTables();
		seven.start();
	}

}
