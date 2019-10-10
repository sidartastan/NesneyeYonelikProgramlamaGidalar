package Gida.SiviGidalar.SiviGidaTurleri;

import Marka.SuMarka;

import java.util.Arrays;

import Gida.SiviGidalar.SiviGidalar;

public class Su extends SiviGidalar {

	public Su() {
		// Kalori ve Urun fiyat degerlerini set et
		this.kalori = 1;
		this.urunFiyati = 2;
		// Urun turu Su olarak set et
		super.setUrunTuru("Su");
		this.setSuMarka(SuMarka.Erikli);
		// 100gram suyun urun icerikleri HashMap turunden nesneye girilir
		urunIcerigi.put("Kalsiyum", 1.5);
		urunIcerigi.put("Potasyum", 0.4);
		urunIcerigi.put("Magnezyum", 0.2);
		urunIcerigi.put("Sodyum", 2.3);
		urunIcerigi.put("Klorür", 2.4); // HashMap girisi tamamla

		this.urunKullanimAlani.addAll(Arrays
				.asList(new String[] { "Ayran", "Limonata", "Visne Suyu", "Elma Suyu", "Buz", "Ayran", "Limonata" }));

	}

}
