package com.bridgelabz.game;

public class Game {

	public static void main(String[] args) {

		int dice = (int) ((Math.random() * 10) % 6) + 1;
		System.out.println("Dice is rolled " + dice);

	}
}
