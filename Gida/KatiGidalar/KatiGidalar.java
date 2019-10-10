package Gida.KatiGidalar;

import Gida.AGida;
import Marka.EtMarka;
import Marka.SebzeMarka;

import java.lang.Exception;
//import Gida.IGidaHareketleri;

public class KatiGidalar extends AGida {

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

//	Interface icerisindeki 'stoktanMalSat' metodunu konfigure et
	public void stoktanMalSat(int satilanMiktar) throws Exception {
		if (stoktakiKatiGidaSayisi >= satilanMiktar) {
			stoktakiKatiGidaSayisi -= satilanMiktar;
		} else {
			// satilan urun bulunamadigindan hata ver
			throw new Exception("Kati gidalar stogunda yeterli mal yoktur");
		}
	}

//	@Override
	public void stogaMalEkle(int eklenenMiktar) {
		stoktakiKatiGidaSayisi += eklenenMiktar;
	}

	@Override
	public String urunTuru() {
		return super.getUrunTuru();
	}

	// Et markasina ulasacagin getter_setter
	public EtMarka getEtMarka() {
		return etMarka;
	}

	public void setEtMarka(EtMarka etMarka) {
		this.etMarka = etMarka;
	}

	// Sebze markasina ulasacagin getter_setter
	public SebzeMarka getSebzeMarka() {
		return this.sebzeMarka;
	}

	public void setSebzeMarka(SebzeMarka sebzeMarka) {
		this.sebzeMarka = sebzeMarka;
	}

	// Integer turunden KatiGidalar Stok durumu icin getter_setter
	public int getStoktakiKatiGidaSayisi() {
		return stoktakiKatiGidaSayisi;
	}

	public void setStoktakiKatiGidaSayisi(int stoktakiKatiGidaSayisi) {
		this.stoktakiKatiGidaSayisi = stoktakiKatiGidaSayisi;
	}

}
