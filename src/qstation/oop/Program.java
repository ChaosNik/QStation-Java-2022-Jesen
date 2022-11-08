package qstation.oop;

public class Program {

	public static void main(String[] args) {
		Covjek a = new Covjek("MILAN", "MILINKOVIC", 1980, "Banja Luka", "1234123412345");
		Covjek b = new Covjek("MARKO", "MARKOVIC", 1989, "Trebinje", "5432167894356");
		Covjek c = new Covjek("IVAN", "IVANOVIC", 1985, "Mostar", "4639214567890");
		System.out.println(a.getIme() + " " + a.getPrezime() + " " + a.getGodinaRodjenja());
		System.out.println(b.getIme() + " " + b.getPrezime() + " " + b.getGodinaRodjenja());
		System.out.println(c.getIme() + " " + c.getPrezime() + " " + c.getGodinaRodjenja());
		System.out.println(a.punoljetan(2022)?"PUNOLJETAN":"MALOLJETAN");
		if(a.punoljetan(2022) == true) {
			System.out.println("PUNOLJETAN");
		}
		else {
			System.out.println("MALOLJETAN");
		}
		System.out.println(a.potvrdaOPrebivalistu());
		System.out.println(b.potvrdaOPrebivalistu());
		System.out.println(c.potvrdaOPrebivalistu());
	}

}
