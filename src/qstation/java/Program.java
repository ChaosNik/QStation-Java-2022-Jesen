package qstation.java;
import pack1.K1;
import pack1.K3;

public class Program {
	public static void main(String[] args) {
		K1 var1 = new K1();
		System.out.println(var1.a);
		System.out.println(var1.getB());
		System.out.println(var1.getC());
		System.out.println(var1.getD());
		System.out.println(var1);
		K1 var2 = new K1(1, 2, 3, 4);
		System.out.println(var2.a);
		System.out.println(var2.getB());
		System.out.println(var2.getC());
		System.out.println(var2.getD());
		System.out.println(var2);
		K3 var3 = new K3(5, 6, 7, 8, 9);
		System.out.println(var3.getA());
		System.out.println(var3.getB());
		System.out.println(var3.getC());
//		System.out.println(var3.getD());
		System.out.println(var3.getE());
		System.out.println(var3);
		
	}
}
