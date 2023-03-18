package com.lao.conditional_statement;

public class WhoIsTheHero {

	String SuperHero = "Iron man";

	public void superheroGuesser() {

		if(SuperHero.equals("Captain America")) {
			System.out.println("your super hero is Captain america");
		}
		else if(SuperHero.equalsIgnoreCase("Iron Man")) {
			System.out.println("your super hero is Iron man");
		}
		else if (SuperHero.equalsIgnoreCase("Thor")) {
			System.out.println("your super hero is Thor");
		}
		else {
			System.out.println("Sorry I can't guess");
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WhoIsTheHero hero= new WhoIsTheHero();
		hero.superheroGuesser();
		
	}

}
