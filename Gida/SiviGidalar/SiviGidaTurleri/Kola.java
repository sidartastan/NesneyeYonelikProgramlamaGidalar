package Gida.SiviGidalar.SiviGidaTurleri;

import java.util.Arrays;

import Gida.SiviGidalar.SiviGidalar;
import Marka.KolaMarka;;

public class Kola extends SiviGidalar {

	public Kola() {
		// Kalori ve Urun fiyat degerlerini set et
		this.kalori = 37.5;
		this.urunFiyati = 5;
		// Urun turu Kola olarak set et
		super.setUrunTuru("Kola");
		this.setKolaMarka(KolaMarka.CocaCola);
		// 100gram kolanin urun icerikleri HashMap turunden nesneye girilir
		urunIcerigi.put("Karbonhidrat", 11.2);
		urunIcerigi.put("Enerji", 45.0);
		urunIcerigi.put("Su", 90.0);
		urunIcerigi.put("Kafein", 15.0);
		urunIcerigi.put("Kalsiyum", 17.5); // HashMap girisi tamamla
		this.urunKullanimAlani.addAll(Arrays.asList(new String[] { "Kolali Jole Tatlisi", "Kola Toplari",
				"Kola Soslu Pilav", "Kolali Sosis", "Kolali Jole Tatlisi" }));
	}
}
