package qstation.java;

public class Thief extends Person {
	private char name;
	private boolean arrested = false;
	public Thief(int x, int y, char name) {
		super(x, y);
		this.name = name;
		this.arrested = false;
	}
	public Thief(int x, int y) {
		this(x, y, 'L');
	}
	public Thief() {
		this(0, 0);
	}
	public char getName() {
		return name;
	}
	public void arrest() {
		this.arrested = true;
	}
	public String toString() {
//		String result = this.name + "(" + this.getX() + ", " + this.getY() + ")";
//		result += arrested?"A":"F";
//		return result;
		return "" + name;
	}
}
