package Gida.KatiGidalar.KatiGidaTurleri;

import java.util.Arrays;
//import java.util.Collection;

import Gida.KatiGidalar.KatiGidalar;
import Marka.EtMarka;

public class Et extends KatiGidalar {

	public Et() {
		// Kalori ve Urun fiyat degerlerini set et
		this.kalori = 143.4;
		this.urunFiyati = 70;
		// Urun turu Et olarak set et
		super.setUrunTuru("Et");
		// Et marka bilgisini gir
		this.setEtMarka(EtMarka.Coskun);
		// 100gram etin urun icerikleri HashMap turunden nesneye gir
		urunIcerigi.put("Protein", 0.225);
		urunIcerigi.put("Niasin_B3", 0.247);
		urunIcerigi.put("Kobalamin", 0.37);
		urunIcerigi.put("Pridoksinin_B6", 0.18);
		urunIcerigi.put("Demir", 0.12);
		urunIcerigi.put("Çinko", 0.32);
		urunIcerigi.put("Selenyum", 0.24);		// HashMap girisi tamamla
		this.urunKullanimAlani.addAll(Arrays.asList(
				new String[] { "Kulbasti", "Et Sote", "Hunkar Begendi", "Kulbasti", "Et Sote", "Kuzu Cevirme" }));

	}
}
