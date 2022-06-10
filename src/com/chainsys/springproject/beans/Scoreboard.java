package com.chainsys.springproject.beans;

public class Scoreboard {
	public int targetScore;

	private Scoreboard() {
		System.out.println("Scoreboard object is created");
	}
	private Scoreboard(int runs) {
		targetScore=runs;
		System.out.println("Scoreboard object is created " + runs);
	}
// factory method - the methods are static here
	public static Scoreboard createObject() {
		return new Scoreboard();
	}
	public static Scoreboard createObject(int runs) {
		return new Scoreboard(runs);
	}
}
