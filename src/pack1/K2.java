package pack1;

public class K2{
	private int a;
	private int b;
	private int c;
	protected int d;
//	public K2() {
//		this(0, 0, 0, 0);
//	}
	public K2(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public int getA() {
		return a;
	}
	public void setA(int a) {
		this.a = a;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public String toString() {
		return "K2 " + this.a + " " + this.b + " " + this.c + " " + this.d;
	}
}
