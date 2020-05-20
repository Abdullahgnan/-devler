package hamburger;

public class Main {

	public static void main(String[] args) {

		Hamburger myhamburger = new Hamburger("ekmek", "k�fte", "tavuk", 3.00d);
		myhamburger.�gedenEkle1("marul", 0.5d);
		myhamburger.�gedenEkle2("peynir", 1.00d);

		double hamburgerFiyati = myhamburger.hamburgerinFiyati();
		System.out.println("Sipari� edilen hamburger i�in toplam fiyat" + hamburgerFiyati);

		DeluxeBurger begendigim = new DeluxeBurger ("Bu�dayl� rulolu", "Sosis", "sos", 5.0d);
		double begendigimFiyat = begendigim.hamburgerinFiyati();
		System.out.println("Sipari� edilen hamburger i�in toplam fiyat " + begendigimFiyat);

		HealthyBurger bnmhealthy = new HealthyBurger("�ift A�a��", 6.11d);
		bnmhealthy.HealtyOgeEkle1("yumurta", 1.5d);
		bnmhealthy.�gedenEkle1("marul", 1.0d);
		bnmhealthy.�gedenEkle2("domates", 0.7d);
		double HealthyFiyatim = bnmhealthy.hamburgerinFiyati();
		System.out.println("Sipari� edilen hamburger i�in toplam fiyat " + HealthyFiyatim);
	}
}
