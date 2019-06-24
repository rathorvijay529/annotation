package com.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Human {

	@Autowired
	@Qualifier("heartofOcto")
	private Heart heart;

	Human() {

		System.out.println("Default Constructor calling");
	}
//   // @Autowired
//	Human(Heart heart) {
//		this.heart = heart;
//		System.out.println("Parameterized Construtor calling");
//
//	}
//  // @Autowired
//   //@Qualifier("heartofOcto")
//	public void setHeart(Heart heart) {
//	   System.out.println("Human Setter Calling!!");
//		this.heart = heart;
//	}

	public void pumping() {
          heart.heartRate();
		//System.out.println("You are alive!!!HAHAHA");

	}
}
