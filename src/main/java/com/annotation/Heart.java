package com.annotation;

public class Heart {

	private String animalName;
	private int noOfHearts;

	public void heartRate() {
		System.out.println(animalName
				+ " is Alive  his heart start pumping  having " + noOfHearts
				+ " hearts");

	}

	public void setAnimalName(String animalName) {
		this.animalName = animalName;
	}

	public void setNoOfHearts(int noOfHearts) {
		this.noOfHearts = noOfHearts;
	}

}
