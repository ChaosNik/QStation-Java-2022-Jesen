package qstation.java;

public class Person {
	private int x;
	private int y;
	public Person(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public Person() {
		this(0, 0);
		//this.x = 0;
		//this.y = 0;
	}
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	private void move(int dx, int dy) {
		this.x += dx;
		this.y += dy;
	}
	public void moveLeft() {
		move(-1, 0);
	}
	public void moveUp() {
		move(0, -1);
	}
	public void moveRight() {
		move(1, 0);
	}
	public void moveDown() {
		move(0, 1);
	}
	public String toString() {
		//return "(" + this.x + ", " + this.y + ")";
		return "O";
	}
}
