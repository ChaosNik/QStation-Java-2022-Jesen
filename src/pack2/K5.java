package pack2;

public class K5 extends K4{
	public K5(int a, int b, int c, int d, int e, int f) {
		super(a, b, c, d, e);
	}
	
	public int compareTo(K5 other) {
		if(this.getA() > other.getA())
			return 1;
		if(this.getA() < other.getA())
			return -1;
		return 0;
	}
}
