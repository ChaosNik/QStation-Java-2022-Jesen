package qstation.java;
import pack1.K1;
import pack1.K3;
import pack2.K5;
import pack2.K6;

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
		K5 var4 = new K5(1, 2, 3, 4, 5, 6);
		K5 var5 = new K5(2, 3, 4, 5, 6, 7);
//		K5 var6 = new K5();
		if(var5.compareTo(var4) == 1)
			System.out.println("var5 je vece!");
		K6 x1 = new K6(1, 2, 3, 4, 5, 6);
		System.out.println(x1.my_index);
		x1 = new K6(1, 2, 3, 6, 5, 6);
		System.out.println(x1.my_index);
		x1 = new K6(1, 2, 3, 1, 5, 6);
		System.out.println(x1.my_index);
		x1 = new K6(1, 5, 3, 4, 5, 6);
		System.out.println(x1.my_index);
		K6 x2 = new K6(5, 6, 2, 8, 9, 0);
		System.out.println(x2.my_index);
		K6 x3 = new K6(0, -1, -5, 7, 6, 2);
		System.out.println(x3.my_index);
		K6.number = 30;
		System.out.println(K6.number);
		K6 x4 = new K6(6, 5, 4, 3, 2, 1);
		System.out.println(x4.my_index);
		System.out.println(K6.number);
	}
}
