package com.accenture.lkm.client;

import com.accenture.lkm.gadget.SmartPhone;

public class GadgetMain {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone();
		myPhone.playGame();
		myPhone.playMovies();
		myPhone.playMusic();
		myPhone.takePhotos();
		myPhone.takeVideos();
		myPhone.call();
		myPhone.sendMessage();
	}

}
