package com.tech.ninzaz.enums;

public class EnumEx1 {

	public static void main(String[] args) {
		System.out.println(MobileBrands.APPLE);
		System.out.println(MobileBrands.SAMSUNG);
		System.out.println(MobileBrands.HTC);
		System.out.println(MobileBrands.XIAOMI);
		System.out.println(MobileBrands.ONEPLUS);
		System.out.println("--------------------------");
		
		
		MobileBrands[] mob = MobileBrands.values();		// values() method is provided by JVM
		
		for(MobileBrands m : mob)
			System.out.println(m + " : " + m.getPrice());
	}

}
