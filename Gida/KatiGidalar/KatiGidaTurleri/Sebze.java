package Gida.KatiGidalar.KatiGidaTurleri;

import java.util.Arrays;

import Gida.KatiGidalar.KatiGidalar;
import Marka.SebzeMarka;

public class Sebze extends KatiGidalar {

	public Sebze() {
		// Kalori ve Urun fiyat degerlerini set et
		this.kalori = 65.2;
		this.urunFiyati = 10;
		// Urun turu Sebze olarak set et
		super.setUrunTuru("Sebze");
		this.setSebzeMarka(SebzeMarka.Taze_Pazar);
		// 100gram sebzenin urun icerikleri HashMap turunden nesneye gir
		urunIcerigi.put("A vitamini", 0.13);
		urunIcerigi.put("C vitamini", 0.21);
		urunIcerigi.put("D vitamini", 0.27);
		urunIcerigi.put("E vitamini", 0.07);
		urunIcerigi.put("Kalsiyum", 0.175);
		// HashMap girisi tamamla
		this.urunKullanimAlani.addAll(Arrays.asList(new String[] { "Patlican Musaka", "Brokoli Koftesi",
				"Kereviz Corbasi", "Ispanakli Kek", "Pýrasa Boregi", "Patlican Musaka" }));

	}
}