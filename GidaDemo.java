
/**
* GidaDemo programi genel olarak secilecek Kati ve Sivi gida
* türleri icerisindeki Et, Sebze, Kola ve Su'ya ait
* urun, marka bilgisi, fiyat, kalori ve stok bilgileri, stoktan mal cikis
* ve girisi gibi bir takim bilere ulasmamizi saglamaktadir.
* Ayni zamanda try catch kalibiyla hatali deger girisini
* yakalayarak hata mesaji donmektedir.
* 
*
* @yazan Sidar Yuksel
* @tarih   2019-01-04
*/

import Gida.KatiGidalar.KatiGidaTurleri.Et;
import Gida.KatiGidalar.KatiGidaTurleri.Sebze;
import Gida.KatiGidalar.KatiGidalar;
import Gida.SiviGidalar.SiviGidaTurleri.Kola;
import Gida.SiviGidalar.SiviGidaTurleri.Su;
import Gida.SiviGidalar.SiviGidalar;
import java.util.Scanner;

/* 
 * Gidalarin genel kullaniminin testi icin tasarlandi 
 */
public class GidaDemo {

	public static void main(String[] args) throws Exception {

		// Degisken tanimlamalari
		KatiGidalar et = new Et();
		KatiGidalar sebze = new Sebze();
		SiviGidalar kola = new Kola();
		SiviGidalar su = new Su();
		KatiGidalar katiUrunFiyat;
		SiviGidalar siviUrunFiyat;
		int sayi = 0;

		// Giris ekrani
		System.out.println("MERHABA!\n" + "Hangi ürün hakkında bilgi istiyorsunuz?\n1. Et\n2.Sebze\n3.Kola\n4.Su\n"
				+ "Sectiğiniz ürünün sırasını girin");

		// Musterinin ilgilendigi urun bilgisini almak icin scanner tanimla.
		Scanner scanner2 = new Scanner(System.in);

		// Musteri talebi dogru olana kadar while dongusunden cikma.
		while (sayi > 0 || sayi < 5) {
			System.out.println("Lütfen 1-4 arası sayı girin!!!");

			// Ondalik deger girildiginde try catch ile bu hatayi yakala.
			try {
				sayi = scanner2.nextInt();
			} catch (Exception a) {
				System.out.println("Lutfen 1-4 arasi tam sayi giriniz!!!\n");
				break;
			} // exceptionin sonu

			if (0 < sayi && sayi < 5) {
				break;
			}
		}
		scanner2.close();

		// Musteri 1 degerini girdiginde ilk if'e girerek buradaki programi calistir.
		// Et ile ilgili bilgilere ulas.
		if (sayi == 1) {
			System.out.printf("Sectiginiz urun:\t%s\n", (et.urunTuru()));
			System.out.println("Sectiginiz Marka:\t" + et.getEtMarka());
			// Et fiyati goster
			katiUrunFiyat = new Et();
			System.out.println("Etin fiyati:\t\t" + (katiUrunFiyat.getUrunFiyati()) + "TL.");
			// etin kalori miktari
			System.out.println("Etin kg kalorisi:\t" + (et.getKalori()) + " kalori");
			System.out.println("500 gr etin kalorisi " + et.kaloriHesapla(500, et.getKalori()) + ", toplam urun fiyati "
					+ et.toplamUrunFiyati(500) + " liradir.");
			// et stok durumu goster
			System.out.println("Et stok durumu:\t" + (et.getStoktakiKatiGidaSayisi()) + " birimdir");
			// stoktan 50 birim mal sat.
			et.stoktanMalSat(50);
			// stok durumunu ekranda goster.
			System.out.println("Kati gidalar stogundan 50 birim mal satilmistir. Kalan miktar "
					+ et.getStoktakiKatiGidaSayisi() + " birimdir.");
			// stoga 200 birim mal ekle.
			et.stogaMalEkle(200);
			// stok son durumunu goruntule.
			System.out.println("Kati gidalar stoguna 200 birim mal eklenmistir. Son durum "
					+ et.getStoktakiKatiGidaSayisi() + " birimdir.n");
			// Urunun icindekileri ekrana yansit.
			et.urunIcerigiGoruntule();
			System.out.println(
					"/********************************/\n/***??Neler Hazırlayabiliriz??***/\n/********************************/\\n");
			System.out.println(et.getUrunKullanimAlani());
		}

		// Musteri 2 degerini girdiginde asagidaki if'e gir ve buradaki programi
		// calistir
		// Sebze ile ilgili bilgilere ulasacak
		else if (sayi == 2) {
			System.out.printf("Sectiginiz urun:\t%s\n", (sebze.urunTuru()));
			System.out.println("Sectiginiz Marka:\t" + sebze.getSebzeMarka());
			// Sebzenin fiyat gosterimi
			System.out.println("Sebzenin urun fiyati:\t" + (sebze.getUrunFiyati()) + "TL");
			// Sebzenin kalori miktari
			System.out.println("Sebzenin kg kalorisi:\t" + (sebze.getKalori()) + " kalori");
			System.out.println("500 gr Sebzenin kalorisi " + sebze.kaloriHesapla(500, sebze.getKalori())
					+ ", toplam urun fiyati " + sebze.toplamUrunFiyati(500) + " liradir.");
			// Sebze stok durumu
			System.out.println("Sebze stok durumu:\t" + (sebze.getStoktakiKatiGidaSayisi()) + " birimdir");
			// Stoktaki malin satisi icin mal satis fonksiyonun cagirilmasi
			// Istenilen miktar fonksiyona deger olarak girilir
			sebze.stoktanMalSat(100);
			// Stoktaki kalan miktari ekrana bastirdim
			System.out.println(
					"Sebze stogundan 100 birim mal satilmistir. Kalan miktar " + sebze.getStoktakiKatiGidaSayisi());
			// Stoga 200 birim mal ekle.
			sebze.stogaMalEkle(200);
			// Stok son durumunu goster.
			System.out.println("Kati gidalar stoguna 200 birim mal eklenmistir. Son durum "
					+ sebze.getStoktakiKatiGidaSayisi() + " birimdir.");
			// Urunun icindekileri ekrana yansit.
			sebze.urunIcerigiGoruntule();
			System.out.println(
					"/********************************/\n/*****NELER HAZIRLAYABLIRIZ*****/\n/********************************/\\n");
			System.out.println(sebze.getUrunKullanimAlani());
		}

		// Musteri 3 degerini girdiginde asagidaki if'e gir ve buradaki programi
		// calistir
		// Kola ile ilgili bilgilere ulas.
		else if (sayi == 3) {
			System.out.printf("Sectiginiz urun:\t%s\n", (kola.urunTuru()));
			System.out.println("Sectiginiz Marka:\t" + kola.getKolaMarka());
			// Kola fiyati gosterimi
			System.out.println("Kolanin urun fiyati:\t" + (kola.getUrunFiyati()) + "TL");
			// Kolanin kalori miktari
			System.out.println("Kolanin kg kalorisi:\t" + (kola.getKalori()) + " kalori");
			// Kola stok durumu
			System.out.println("500 gr Kolanin kalorisi " + kola.kaloriHesapla(500, kola.getKalori())
					+ ", toplam urun fiyati " + kola.toplamUrunFiyati(500) + " liradir.");
			System.out.println("Kolanin stok durumu:\t" + (kola.getStoktakiSiviGidaSayisi()) + " birimdir");
			// Stoktaki malin satisi icin fonksiyon cagir.
			// Istenilen miktar fonksiyona deger olarak gir.
			kola.stoktanMalSat(50);
			// Stoktaki kalan miktari ekrana bastirdim
			System.out.println("Sivi gidalar stogundan 50 birim mal satilmistir. Kalan miktar "
					+ kola.getStoktakiSiviGidaSayisi());
			kola.stogaMalEkle(200);
			// Stoga mal ekle, son durumu goster.
			System.out.println("Kati gidalar stoguna 200 birim mal eklenmistir. Son durum "
					+ kola.getStoktakiSiviGidaSayisi() + " birimdir.");
			// Urunun icindekileri ekrana yansit
			kola.urunIcerigiGoruntule();
			System.out.println(
					"/********************************/\n/*****NELER HAZIRLAYABLIRIZ*****/\n/********************************/\\n");
			System.out.println(kola.getUrunKullanimAlani());
		}

		// Musteri 4 degerini girdiginde asagidaki if'e gir ve buradaki programi
		// calistir.
		// Su ile ilgili bilgilere ulas.
		else if (sayi == 4) {
			System.out.printf("Sectiginiz urun:\t%s\n", (su.urunTuru()));
			System.out.println("Sectiginiz Marka:\t" + su.getSuMarka());
			// Su fiyati gosterimi
			siviUrunFiyat = new Su();
			System.out.println("Suyun urun fiyati:\t" + (siviUrunFiyat.getUrunFiyati()) + "TL");
			// Suyun kalori miktari
			System.out.println("Suyun kg kalorisi:\t" + (su.getKalori()) + " kalori");
			System.out.println("500 gr Suyun kalorisi " + su.kaloriHesapla(500, su.getKalori())
					+ ", toplam urun fiyati " + su.toplamUrunFiyati(500) + " liradir.");
			System.out.println("Suyun stok durumu:\t" + (su.getStoktakiSiviGidaSayisi()) + " birimdir");
			// Stoktaki malin satisi icin fonksiyon cagir.
			// Istenilen miktar (50 birim) fonksiyona deger olarak gir.
			su.stoktanMalSat(50);
			// Stoktaki kalan miktari ekrana bastir.
			System.out.println("Sivi gidalar stogundan 50 birim mal satilmistir. Kalan miktar "
					+ su.getStoktakiSiviGidaSayisi() + " birimdir");
			su.stogaMalEkle(200);
			// Stok son durumu
			System.out.println("Sivi gidalar stoguna 200 birim mal eklenmistir. Son durum "
					+ su.getStoktakiSiviGidaSayisi() + " birimdir.");
			// Urunun icindekileri ekrana yansit
			su.urunIcerigiGoruntule();
			System.out.println(
					"/********************************/\n/*****NELER HAZIRLAYABLIRIZ*****/\n/********************************/\\n");
			System.out.println(su.getUrunKullanimAlani());

		}

	}
}
