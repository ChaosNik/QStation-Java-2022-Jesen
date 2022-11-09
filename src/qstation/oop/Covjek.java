package qstation.oop;

public class Covjek {
	private String ime = "NEPOZNATO";
	private String prezime = "NEPOZNATO";
	private int godina_rodjenja = 0;
	private String prebivaliste = "NEPOZNATO";
	private String maticni_broj = "0000000000000";
	private int visina = 0;
	
	public Covjek(String ime, String prezime, int godina_rodjenja, String prebivaliste, String maticni_broj, int visina) {
		this.ime = ime;
		this.prezime = prezime;
		this.godina_rodjenja = godina_rodjenja;
		this.prebivaliste = prebivaliste;
		this.maticni_broj = maticni_broj;
		this.visina = visina;
	}
	public String getIme() {
		return ime;
	}
	public String getPrezime() {
		return prezime;
	}
	public int getGodinaRodjenja() {
		return godina_rodjenja;
	}
	public String getPrebivaliste() {
		return prebivaliste;
	}
	public String getMaticniBroj() {
		return maticni_broj;
	}
	public int getVisina() {
		return visina;
	}
	public String potvrdaOPrebivalistu() {
		return this.ime + " " + this.prezime + " ima prebivaliste u " + prebivaliste;
	}
	public int starost(int trenutna_godina) {
		return trenutna_godina - godina_rodjenja;
	}
	public boolean punoljetan(int trenutna_godina) {
		return this.starost(trenutna_godina) >= 18;
	}
	
}
