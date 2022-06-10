package com.chainsys.springproject.beans;

public abstract class Desert {
	public String name;
}

class Icecream extends Desert {
	public Icecream() {
		name = "Chocolate";
	}
}

class Sweets extends Desert {
	public Sweets() {
		name = "Rasagulla";
	}
}

class Cakes extends Desert {
	public Cakes() {
		name = "Russianvelvet";
	}

	public Cakes(String name) {
		this.name = name;
	}
}
