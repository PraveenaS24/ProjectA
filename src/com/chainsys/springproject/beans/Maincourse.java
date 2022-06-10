package com.chainsys.springproject.beans;

public abstract class Maincourse {
	public String name;
}

class SouthIndian extends Maincourse {
	public SouthIndian() {
		name = "Rice";
	}
}

class NorthIndian extends Maincourse {
	public NorthIndian() {
		name = "Chapatti";
	}
}

class Chinese extends Maincourse {
	public Chinese() {
		name = "Noodels";
	}
}
