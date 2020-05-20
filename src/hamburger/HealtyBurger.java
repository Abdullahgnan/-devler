package hamburger;


	public class HealthyBurger extends Hamburger {
	    private String HealtyOgeEkle1;
	    private double HealtyOgeFiyatiEkle1;

	    private String HealtyOgeEkle2;
	    private double HealtyOgeFiyatiEkle2;

	    public HealthyBurger(String et, double fiyat) {
	        super("Kahverengi �avdar Rulo", et, "Healthy", fiyat);
	    }

	    
	    public double hamburgerinFiyati() {
	        double tabanFiyati = super.hamburgerinFiyat�();

	        if (this.HealtyOgeEkle1 != null) {
	        	tabanFiyati += this.HealtyOgeFiyatiEkle1;
	            System.out.println("Eklenen" + this.HealtyOgeEkle1 + "n�n extra i�in fiyat� :" + this.HealtyOgeFiyatiEkle1);
	        }
	        if (this.HealtyOgeEkle2 != null) {
	        	tabanFiyati += this.HealtyOgeFiyatiEkle2;
	            System.out.println("Eklenen" + this.HealtyOgeEkle2 + "n�n extra i�in fiyat� :" + this.HealtyOgeFiyatiEkle2);
	        }

	        return tabanFiyati;
	    }

	    public void HealtyOgeEkle1(String ogeEkle, double fiyat) {
	        this.HealtyOgeEkle1 = ogeEkle;
	        this.HealtyOgeFiyatiEkle1 = fiyat;
	    }

	    public void HealtyOgeEkle2(String ogeEkle1, double fiyat) {
	        this.HealtyOgeEkle2 = ogeEkle1;
	        this.HealtyOgeFiyatiEkle2 = fiyat;
	    }
	}
	


