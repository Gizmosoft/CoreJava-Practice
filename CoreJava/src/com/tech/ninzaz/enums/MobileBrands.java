package com.tech.ninzaz.enums;

public enum MobileBrands {
	APPLE(100000), SAMSUNG(50000), HTC(30000), XIAOMI(15000), ONEPLUS(40000);
	
	int price;
	
	MobileBrands(int price){			//enums can have variables, constructors and methods
		this.price = price;
	}
	
	public int getPrice(){
		return price;
	}
}



// What is happening behind the scenes?

/*
class MobileBrands{
	static final MobileBrands APPLE = new MobileBrands();
	static final MobileBrands SAMSUNG = new MobileBrands();		// Individual objects are being
	static final MobileBrands HTC = new MobileBrands();			// created for each enums
	static final MobileBrands XIAOMI = new MobileBrands();
	static final MobileBrands ONEPLUS = new MobileBrands();
}
*/