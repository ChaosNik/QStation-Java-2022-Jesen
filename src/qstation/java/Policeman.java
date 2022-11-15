package qstation.java;

public class Policeman extends Person{
	public Policeman() {
		this(0, 0);
	}
	public Policeman(int x, int y) {
		super(x, y);
	}
	public String toString() {
		//return "P" + "(" + this.getX() + ", " + this.getY() + ")";
		return "P";
	}
}
