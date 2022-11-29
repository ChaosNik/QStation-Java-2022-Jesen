package pack2;
import pack1.K3;

public class K4 extends K3{
	int f;
	public K4(int a, int b, int c, int d, int e) {
		super(a, b, c, d, e);
		this.f = d + e;
	}
	public int getF() {
		return f;
	}
	public void setC(int c) {
		super.setC(c);
		f = d + super.getC();
	}
}
