package qstation.java;
import java.util.Random;
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
		for(int i = 0; i < this.number_of_thieves; ++i) {
			Random rand = new Random();
			int x = rand.nextInt(this.dimension);
			int y = rand.nextInt(this.dimension);
			if(isFieldFree(x, y))
				persons[i + 1] = new Thief(x, y, (char)('A' + i));
			else
				--i;
		}
	}
	
	private boolean isFieldFree(int x, int y) {
//		for(int i = 0; i < persons.length; ++i) {
//			Person person = persons[i];
//		}
		for(Person person : persons)
			if(person != null && person.getX() == x && person.getY() == y)
				return false;
		return true;
	}
	
	public int play() {
		Scanner in = new Scanner(System.in);
		int turn = 0;
		this.printTurn();
		while(turn < 20) {//number_of_thieves > 0
			turn++;
			
			System.out.println("Where do you want to move? (WASD)");
			String option = in.next();
			//moveThieves() -- moveThief(randOption)
			this.moveThieves();
			this.movePoliceman(option);
			
			System.out.println(turn);
			this.printTurn();
		}
		System.out.println("Game finished in " + turn + " turns!!!");
		return turn;
	}
	
	private void moveThieves() {
		for(Person person : persons) {
			if(person instanceof Thief){
				Thief thief = (Thief)person;
				Random rand = new Random();
				int option = rand.nextInt(4);
				moveThief(thief, 4);
			}
		}
	}
	
	private void moveThief(Thief thief, int option) {
		// TASK: CHECK IF THIEF CAN MOVE IN CERTAIN DIRECTION AND IF IT CAN, MOVE HIM
		if (option == 1) {
			if (thief.getY() == this.dimension - 1 && isFieldFree(thief.getX(), thief.getY()+1))
				return;
			thief.moveDown();
			
		}
		else if(option == 2) {
			if (thief.getY() == 0 && isFieldFree(thief.getX(), thief.getY()-1))
				return;
			thief.moveUp();
		}
		else if(option == 3) {
			if(thief.getX() == this.dimension-1 && isFieldFree(thief.getX()+1, thief.getY()))
				return;
			thief.moveRight();
		}
		else if(option == 4) {
			if(thief.getX() == 0 && isFieldFree(thief.getX()-1, thief.getY()))
				return;
			thief.moveLeft();
		}
	}
	
	private static void printLine(int length) {
		for(int i = 0; i < length; ++i)
			System.out.print("*");
		System.out.println();
	}
	
	private void printTurn() {
		printLine(this.dimension + 2);
		for(int i = 0; i < this.dimension; ++i) {
			System.out.print("*");
			for(int j = 0; j < this.dimension; ++j) {
				Person person = null;
				for(int k = 0; k < persons.length; ++k) {
					if(persons[k].getY() == i && persons[k].getX() == j) {
						person = persons[k];
						k = persons.length;
					}
				}
				if(person != null)
					System.out.print(person);
				else
					System.out.print(" ");
			}
			System.out.println("*");
		}
		printLine(this.dimension + 2);
	}
	
	private void movePoliceman(String option) {
		Policeman policeman = (Policeman)persons[0];
		if(option.toLowerCase().compareTo("s") == 0) {
			if(policeman.getY() == this.dimension - 1)
				return;
			policeman.moveDown();
		}
		else if(option.toLowerCase().compareTo("w") == 0) {
			if(policeman.getY() == 0)
				return;
			policeman.moveUp();
		}
		else if(option.toLowerCase().compareTo("d") == 0) {
			if(policeman.getX() == this.dimension - 1)
				return;
			policeman.moveRight();
		}
		else if(option.toLowerCase().compareTo("a") == 0) {
			if(policeman.getX() == 0)
				return;
			policeman.moveLeft();
		}
		
	}
	
	public static void main(String[] args) {
		// testPerson();
		// testPoliceman();
		// testThief();
//		Scanner in = new Scanner(System.in);
//		System.out.println("Enter size of the field: ");
//		int dimension = in.nextInt();
//		System.out.println("Enter the number of thieves: ");
//		int number_of_thieves = in.nextInt();
//		Game game = new Game(dimension, number_of_thieves);
		Game game = new Game(7, 7);
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
