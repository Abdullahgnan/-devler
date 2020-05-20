package hamburger;

public class Main {

	public static void main(String[] args) {

		Hamburger myhamburger = new Hamburger("ekmek", "köfte", "tavuk", 3.00d);
		myhamburger.ögedenEkle1("marul", 0.5d);
		myhamburger.ögedenEkle2("peynir", 1.00d);

		double hamburgerFiyati = myhamburger.hamburgerinFiyati();
		System.out.println("Sipariþ edilen hamburger için toplam fiyat" + hamburgerFiyati);

		DeluxeBurger begendigim = new DeluxeBurger ("Buðdaylý rulolu", "Sosis", "sos", 5.0d);
		double begendigimFiyat = begendigim.hamburgerinFiyati();
		System.out.println("Sipariþ edilen hamburger için toplam fiyat " + begendigimFiyat);

		HealthyBurger bnmhealthy = new HealthyBurger("Çift Aþaðý", 6.11d);
		bnmhealthy.HealtyOgeEkle1("yumurta", 1.5d);
		bnmhealthy.ögedenEkle1("marul", 1.0d);
		bnmhealthy.ögedenEkle2("domates", 0.7d);
		double HealthyFiyatim = bnmhealthy.hamburgerinFiyati();
		System.out.println("Sipariþ edilen hamburger için toplam fiyat " + HealthyFiyatim);
	}
}
