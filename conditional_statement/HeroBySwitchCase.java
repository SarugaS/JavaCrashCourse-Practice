package com.lao.conditional_statement;

public class HeroBySwitchCase {

	String hero = "Captain Amrica";

	public void HeroOrNot() {
		switch (hero) {
		case "Thor":
			System.out.println("Thor is a super hero");
			break;

		case "Iron man":
			System.out.println("Iron man is a super hero");
			break;

		case "bat man":
			System.out.println("bat man is a super hero");
			break; 

		default:
			System.out.println(hero+" is not a super hero");
			break;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HeroBySwitchCase switchCase=new HeroBySwitchCase();
		switchCase.HeroOrNot();
	}

}
