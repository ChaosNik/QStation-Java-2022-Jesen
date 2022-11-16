package qstation.java;
import java.util.Scanner;

public class Game {
	private int dimension;
	private int number_of_thieves;
	private Person[] persons;
	
	public Game(int dimension, int number_of_thieves) {
		this.dimension = dimension;
		this.number_of_thieves = number_of_thieves;
		persons = new Person[number_of_thieves + 1];
		persons[0] = new Policeman(0, 0);
		System.out.println(persons);
	}
	
	public int play() {
		Scanner in = new Scanner(System.in);
		int turn = 0;
		while(turn < 10) {
			turn++;
			
			System.out.println("Where do you want to move? (WASD)");
			String option = in.next();
			this.movePoliceman(option);
			
			System.out.println(turn);
			this.printTurn();
		}
		return turn;
	}
	
	private void printLine(int this_dimension) {
		//TODO
		for(int i = 0; i < this.dimension + 2; ++i)
           System.out.print("*");
		System.out.println();
		for(int i = 0; i < this.dimension + 2; ++i)
			System.out.print("*");
		System.out.println();
		}
	
	private void printTurn() {
		for(int i = 0; i < this.dimension + 2; ++i)//printLine(this.dimension);
			
			System.out.print("*");
		System.out.println();
		for(int i = 0; i < this.dimension; ++i) {
			System.out.print("*");
			for(int j = 0; j < this.dimension; ++j) {
//				for(int k = 0; k < persons.length; ++k) {
//					Person trenutna_osoba = persons[k];
//					
//				}
				if(persons[0].getY() == i && persons[0].getX() == j)
					System.out.print(persons[0]);
				else
					System.out.print(" ");
			}
			System.out.println("*");
		}
		for(int i = 0; i < this.dimension + 2; ++i)//printLine(this.dimension);
			
			System.out.print("*");
		System.out.println();
		
	}
	
	private void movePoliceman(String option) {
		Policeman policeman = (Policeman)persons[0];
		if(option.compareTo("S") == 0 || option.compareTo("s") == 0) {
			if(policeman.getY() == this.dimension - 1)
				return;
			policeman.moveDown();
		}
			if(option.compareTo("D") == 0 || option.compareTo("d") == 0) {
							if(policeman.getY() == this.dimension - 1)
								return;
							policeman.moveRight();
					 }
					 if(option.compareTo("A") == 0 || option.compareTo("a") == 0) {
							if(policeman.getY() == this.dimension -1)
								return;
							policeman.moveLeft();
					 }
					 if(option.compareTo("W") == 0 || option.compareTo("w") == 0) {
							if(policeman.getY() == this.dimension -1)
								return;
							policeman.moveUp();
					 }
					 
			
		//TODO A, W, D
	}
	
	public static void main(String[] args) {
		// testPerson();
		// testPoliceman();
		// testThief();
		Game game = new Game(7, 10);
		game.play();

	}
	
	private static void testPerson() {
		Person a = new Person(10, 10);
		Person b = new Person(10, 10);
		if(a == b)
			System.out.println("ISTI");
		else
			System.out.println("NISU ISTI");
		System.out.println(a);
		System.out.println(b);
		Person[] niz_osoba_ab = new Person[2];
		niz_osoba_ab[0] = a;
		niz_osoba_ab[1] = b;
		System.out.println(niz_osoba_ab);
		a.moveLeft();
		System.out.println(a);
		a.moveRight();
		System.out.println(a);
	}
	private static void testPoliceman() {
		Policeman a = new Policeman(10, 10);
		Policeman b = new Policeman();
		System.out.println(a);
		System.out.println(b);
		Person osoba_a = (Person)a;
		System.out.println(a);
	}
	private static void testThief() {
		Thief a = new Thief(10, 10);
		Thief b = new Thief(5, 5, 'X');
		Thief c = new Thief();
		c.arrest();
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}
