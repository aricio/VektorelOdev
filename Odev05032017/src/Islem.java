
public class Islem {
	
	public static void main(String[] args) {
		
		Kisiler kisiBir = new Kisiler();
		
		kisiBir.setId(1);
		kisiBir.setDogumYili(1990);
		kisiBir.setIsim("Onur Ar�c�");
		
		System.out.println("Ki�i Id: " + kisiBir.getId());
		System.out.println("Ki�i Dogum Y�l�: " + kisiBir.getDogumYili() );
		System.out.println("Kisi �smi: " + kisiBir.getIsim());
		
		kisiBir.yasHesapla();
		
		
		
	}

}
