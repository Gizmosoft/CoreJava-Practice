package com.accenture.lkm.gadget;

public class SmartPhone extends BasicPhone implements Computer, Camera {

	@Override
	public void playGame() {
		System.out.println("Launched turbo mode");
	}

	@Override
	public void playMusic() {
		System.out.println("Choose App");
	}

	@Override
	public void playMovies() {
		System.out.println("Launched google play");
	}

	@Override
	public void takePhotos() {
		System.out.println("Saved to gallery");
	}

	@Override
	public void takeVideos() {
		System.out.println("choose app to share");
	}

	@Override
	public void sendMessage() {
		System.out.println("Choose messanger app");
	}

}
