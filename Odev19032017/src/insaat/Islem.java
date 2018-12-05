package insaat;

public class Islem {

	public static void main(String[] args) {
		
		Cirak cirak = new Cirak();
		cirak.setName("ali");
		cirak.setTcid(123);
		
		Muhendis muhendis = new Muhendis();
		muhendis.setTcid(234);
		muhendis.setName("veli");
		
		Sef sef = new Sef();
		sef.setName("hasan");
		sef.setTcid(345);
		
		Usta usta = new Usta();
		usta.setName("mehmet");
		usta.setTcid(456);
		
		Cirak[] cirakArray = new Cirak[3];
		
		Cirak cirakIki = new Cirak();
		cirakIki.setName("asd");
		cirakIki.setTcid(567);
		
		Cirak cirakUc = new Cirak();
		cirakUc.setName("ert");
		cirakUc.setTcid(678);
		
		cirakArray[0] = cirak;
		cirakArray[1] = cirakIki;
		cirakArray[2] = cirakUc;
		
		CalisanBilgileri calisanBilgileri = new CalisanBilgileri();
		
		calisanBilgileri.bilgileriGetir(cirak);
		calisanBilgileri.bilgileriGetir(cirak, muhendis);
		calisanBilgileri.bilgileriGetir(cirak, muhendis, sef);
		calisanBilgileri.bilgileriGetir(cirak, muhendis, sef, usta);
		calisanBilgileri.bilgileriGetir(cirakArray);
		
		
		
	}
}
