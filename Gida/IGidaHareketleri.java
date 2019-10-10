package Gida;

/*
 * Stoktan mal satis ve eklemek icin IGidaHareketleri interface'i
 */
public interface IGidaHareketleri {

	void stoktanMalSat(int satilanMiktar) throws Exception;

	void stogaMalEkle(int eklenenMiktar);
}
