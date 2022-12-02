package pack2;

public class K6 extends K4{
	public static int number;
	public int my_index;
	private K7 k;
	public K6(int a, int b, int c, int d, int e, int f) {
		super(a, b, c, d, e);
		my_index = number;
		k = new K7(number);
		number++;
	}
//	public static int method() {
//		this.getA();
//		this.my_index = 5;
//		return 0;
//	}
	
	public class K7{
		int x;
		public K7(int x) {
			this.x = x;
		}
	}
}
