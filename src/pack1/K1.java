package pack1;

public class K1 {
	public int a;
	private int b;
	protected int c;
	int d;
	public K1() {}
	public K1(int a, int b, int c, int d) {
		this.a = a;
		this.b = b;
		this.c = c;
		this.d = d;
	}
	public int getB() {
		return b;
	}
	public void setB(int b) {
		this.b = b;
	}
//	public void setB(int my_b) {
//		b = my_b;
//	}
	public int getC() {
		return c;
	}
	public void setC(int c) {
		this.c = c;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public String toString() {
		return "K1 " + a + " " + b + " " + c + " " + d;
	}
}
