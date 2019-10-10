package Gida.SiviGidalar;

import Gida.AGida;
import Marka.KolaMarka;
import Marka.SuMarka;

public class SiviGidalar extends AGida {

	// Parent classtaki 'toplamUrunFiyati' abstract metodu override et.
	@Override
	public double toplamUrunFiyati(int gramDegeri) {
		return gramDegeri * urunFiyati / KILOGRAM_GRAM_SABITI;
	}

	// Parent classtaki 'kaloriHesapla' abstract metodu override et.
	@Override
	public double kaloriHesapla(int gram, double kalori) {
		return gram * kalori / KILOGRAM_GRAM_SABITI;
	}

	// IGidaHareketleri'ndeki 'stoktanMalSat' metodu konfigurasyonu
	public void stoktanMalSat(int satilanMiktar) throws Exception {
		if (stoktakiSiviGidaSayisi >= satilanMiktar) {
			stoktakiSiviGidaSayisi -= satilanMiktar;
		} else {
			// satilan urun bulunamadigindan hata verilir
			throw new Exception("Sivi gidalar stogunda yeterli mal yoktur");
		}
	}

//	IGidaHareketleri'ndeki 'stogaMalEkle' metodu konfigurasyonu
	public void stogaMalEkle(int eklenenMiktar) {
		stoktakiSiviGidaSayisi += eklenenMiktar;
	}

	public String urunTuru() {
		return super.getUrunTuru();
	}

	// Kola markasina ulasacagin getter_setter
	public KolaMarka getKolaMarka() {
		return kolaMarka;
	}

	public void setKolaMarka(KolaMarka kolaMarka) {
		this.kolaMarka = kolaMarka;
	}

	// Su markasina ulasacagin getter_setter
	public SuMarka getSuMarka() {
		return suMarka;
	}

	public void setSuMarka(SuMarka suMarka) {
		this.suMarka = suMarka;
	}

	// Stoktaki Sivi gida sayisi icin kullanacagin getter_setter
	public int getStoktakiSiviGidaSayisi() {
		return stoktakiSiviGidaSayisi;
	}

	public void setStoktakiSiviGidaSayisi(int stoktakiSiviGidaSayisi) {
		this.stoktakiSiviGidaSayisi = stoktakiSiviGidaSayisi;
	}

}
