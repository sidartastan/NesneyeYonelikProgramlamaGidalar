import Gida.KatiGidalar.KatiGidaTurleri.Et;
import Gida.KatiGidalar.KatiGidaTurleri.Sebze;
import Gida.KatiGidalar.KatiGidalar;
import Gida.SiviGidalar.SiviGidaTurleri.Kola;
import Gida.SiviGidalar.SiviGidaTurleri.Su;
import Gida.SiviGidalar.SiviGidalar;
import java.util.Scanner;

/*
 * EXCEPTION ve POLYMORPHISM ornekleme
 */

public class GidaDemo2 {

	public static void main(String[] args) {

		/*
		 * 
		 * yerine String bir deðiþken deðer yazýlarak hata oluþmasý saðlanarak Exception
		 * gorulur
		 */
		KatiGidalar yeniUrunFiyati1[] = { new Et(), new Sebze() };
		SiviGidalar yeniUrunFiyati2[] = { new Su(), new Kola() };
		Scanner bilgiGirisi = new Scanner(System.in);

		// Yanlis giris olunca try-catch hatayi yakalar
		try {
			System.out.println("\n*****Ondalik sayi icin `,` yaziniz*****");
			for (int i = 0; i < yeniUrunFiyati1.length; i++) {
				System.out.printf("Yeni %s fiyati girin: ", yeniUrunFiyati1[i].urunTuru());
				yeniUrunFiyati1[i].setUrunFiyati(bilgiGirisi.nextDouble());
				System.out.printf("Yeni " + yeniUrunFiyati1[i].urunTuru() + " fiyatý "
						+ yeniUrunFiyati1[i].getUrunFiyati() + "TL\n");
			}

			try {
				for (int i = 0; i < yeniUrunFiyati2.length; i++) {
					System.out.printf("Yeni %s fiyati girin: ", yeniUrunFiyati2[i].urunTuru());
					yeniUrunFiyati2[i].setUrunFiyati(bilgiGirisi.nextDouble());
					System.out.printf("Yeni " + yeniUrunFiyati2[i].urunTuru() + " fiyatý "
							+ yeniUrunFiyati2[i].getUrunFiyati() + "TL\n");
				}

			}

			catch (Exception e2) {
				System.out.println("Sivigidalar için fiyat bilgisi sayi girilmelidir!!!!");
			}

		}

		catch (Exception e1) {
			System.out.println("KatiGidalar için fiyat bilgisi sayi girilmelidir!!!!");
		}
		bilgiGirisi.close();

	}

}
