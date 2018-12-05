
public class Islem {
	
	public static void main(String[] args) {
		
		Kisiler kisiBir = new Kisiler();
		
		kisiBir.setId(1);
		kisiBir.setDogumYili(1990);
		kisiBir.setIsim("Onur Arýcý");
		
		System.out.println("Kiþi Id: " + kisiBir.getId());
		System.out.println("Kiþi Dogum Yýlý: " + kisiBir.getDogumYili() );
		System.out.println("Kisi Ýsmi: " + kisiBir.getIsim());
		
		kisiBir.yasHesapla();
		
		
		
	}

}
