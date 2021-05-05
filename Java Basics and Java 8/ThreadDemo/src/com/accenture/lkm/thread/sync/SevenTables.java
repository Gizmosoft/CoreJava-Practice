package com.accenture.lkm.thread.sync;

public class SevenTables extends Thread {

	@Override
	public synchronized void start() {
		// TODO Auto-generated method stub
		TableCreater table = new TableCreater();
		table.createTable(7);
	}
}
