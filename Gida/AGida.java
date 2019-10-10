package Gida;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import Marka.*;

public abstract class AGida implements IGidaHareketleri {

	// static final degerini sadece buradan degistirebilirsin
	// Kilogrami grama donusturen sabit sayi 'KILOGRAM_GRAM_SABITI'
	public static final int KILOGRAM_GRAM_SABITI = 1000; // constant

	// protected turunden degiskenler
	// sadece package ve extend edilen classlarda kullanilabilir.
	protected int stoktakiKatiGidaSayisi = 350;
	protected int stoktakiSiviGidaSayisi = 200;
	protected double urunFiyati;
	protected double kalori;
	protected SuMarka suMarka;
	protected KolaMarka kolaMarka;
	protected EtMarka etMarka;
	protected SebzeMarka sebzeMarka;
	protected Map<String, Double> urunIcerigi = new HashMap<String, Double>();
	protected Set<String> urunKullanimAlani = new HashSet<String>();
	private String urunTuru;

	// 'urunTuru' abstract metodu
	public abstract String urunTuru();

	// 'toplamUrunFiyati' abstract metodu
	public abstract double toplamUrunFiyati(int gramDegeri);

	// 'kaloriHesapla' abstract metodu
	public abstract double kaloriHesapla(int gram, double kalori);

	// HashMap'e atadigimiz urun icerigini goruntuleyen programi olustur
	public void urunIcerigiGoruntule() {
		System.out.println("\n/*******************************/");
		System.out.println("/*************ICERIK************/");
		System.out.println("/*******************************/");
		for (Map.Entry<String, Double> urunEntry : urunIcerigi.entrySet()) {
			System.out.printf("%s --> %.1f\n", urunEntry.getKey(), urunEntry.getValue());
		}
	}

	// Map turunden, urun icerigine ulasacagin getter_setter
	public Map<String, Double> getUrunIcerigi() {
		return urunIcerigi;
	}

	public void setUrunIcerigi(Map<String, Double> urunIcerigi) {
		this.urunIcerigi = urunIcerigi;
	}

	// String turunden UrunTuru degeri icin getter_setter
	public String getUrunTuru() {
		return urunTuru;
	}

	public void setUrunTuru(String urunTuru) {
		this.urunTuru = urunTuru;

	}

	// Double turunden Urun Fiyati degeri icin getter_setter
	public double getUrunFiyati() {
		return urunFiyati;
	}

	public void setUrunFiyati(double urunFiyati) {
		this.urunFiyati = urunFiyati;
	}

	// Double turunden Kalori degeri icin getter_setter
	public double getKalori() {
		return kalori;
	}

	public void setKalori(double kalori) {
		this.kalori = kalori;
	}

	// UrunKullanimAlani icin getter-setter
	public void setUrunKullanimAlani(Set<String> urunKullanimAlani) {
		this.urunKullanimAlani = urunKullanimAlani;
	}

	public Set<String> getUrunKullanimAlani() {
		return urunKullanimAlani;
	}
}
