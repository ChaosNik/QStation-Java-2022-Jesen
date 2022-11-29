package pack1;

public class K3 extends K2{
	int e;
//	public K3() {
//		super(); //K2()
//	}
	public K3(int a, int b, int c, int d, int e) {
//		super(); //K2()
		super(a, b, c, d);
		this.e = e;
	}
//	public K3(int a, int b, int c, int d) {
//		super(a, b, c, d);
//		this.e = c + d;
//	}
	public int getE() {
		return e;
	}
	public void setE(int e) {
		this.e = e;
	}
	public String toString() {
		return "K3 " + super.toString() + " " + getE();
	}
}
