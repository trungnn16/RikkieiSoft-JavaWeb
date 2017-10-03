package Week1_ClassCoBan;

import java.util.Random;
import java.util.Scanner;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GuessingGame {
	int target;
	Vector gueses;
	public GuessingGame(int x) {
		this.target = x;
		this.gueses = new Vector(100,25);
		
		
	}
	public GuessingGame() {
		
	}
	public void startGuessing() {
		Random rand = new Random();
		int x = rand.nextInt(100)+1;
		while(x!=this.target) {
			x = rand.nextInt(100)+1;
			if(x!=this.target) {
				this.gueses.add(x);
			}
			else
				break;
		}
	}
	public void printGuesses() {
		System.out.println("Danh sách Guesse: ");
		for(int i=0;i<this.gueses.size();i++) {
			System.out.print(this.gueses.get(i)+" ");
		}
		System.out.println("\nSize of gueses = "+this.gueses.size());
	}
	public static void main(String [] args) {
		int target = Integer.parseInt(args[0]);
		GuessingGame guess = new GuessingGame(target);
		guess.startGuessing();
		guess.printGuesses();
		
	}
	
}
	