import java.util.Arrays;

public class DiziSiralama {

	
	public static void main(String[] args) {
		
		
		int[][] diziIkiBoyutlu = {{15,566,56,911},
								  {66,211,511,44},
								  {65,999,1,95}  ,
								  {88,89,595,63}};
		
		
		int sayacBir = 0 ; 																// oluþturulacak bir boyutlu dizininin eleman sayýsýný bulmak için sayaç
		
		for (int i = 0 ; i < diziIkiBoyutlu.length ; i++){  							// iki boyutlu dizi elemanlarýný yazdýrma
			for (int j = 0 ; j < diziIkiBoyutlu[0].length ; j++){
				System.out.print("["+i+"]["+j+"]=" + diziIkiBoyutlu[i][j]  + "\t");
				
				if(diziIkiBoyutlu[i][j] % 2 == 1){ 										// iki boyutlu dizideki tek sayýlarý sayma iþlemi
					sayacBir ++;
				}
				
			}//for sonu
			System.out.println("\n");
			
		}//for sonu
		
		
		
		int [] diziBirBoyutlu = new int[sayacBir];																	
		
		int satýr = diziIkiBoyutlu[0].length;
		
		
		int sayacIki = 0; 																// bir boyutlu dizi elemanlarýna ulaþmak için sayaç
		
		for (int i = 0 ; i < diziIkiBoyutlu.length ; i++){  							
			for (int j = 0 ; j < diziIkiBoyutlu[0].length ; j++){
								
				if(diziIkiBoyutlu[i][j] % 2 == 1){ 										// iki boyutlu dizideki tek sayýlarý bir boyutlu diziye atama
					diziBirBoyutlu[sayacIki] = diziIkiBoyutlu[i][j];
					sayacIki ++;
				
				}//if sonu
			}//for sonu
		}//for sonu
				
		
		System.out.println("Tek sayýlardan oluþan dizi: \n"  );
		
		for(int i = 0 ; i < diziBirBoyutlu.length ; i++){								// bir boyutlu diziyi yazdýrma
			
			System.out.print(diziBirBoyutlu[i] + " ");
		}//for sonu
		
		/*
		 * dizi elemanlarýn sýralanmasý java.util paketi içierisindeki Arrays sýnýfýndaki
		 * statik sort() fonksiyonu ile de sýralanabilir.
		 * 
		 * Arrays.sort(diziBirBoyutlu);
		*/
		
				
		int gecici;																		// dizi sýralamsýnda kullanýlacak geçiçi degiþken
				
		for(int i = 0 ; i < diziBirBoyutlu.length ; i++ ){							// dizi elemanlarý sýralamada bütün elemanlarý sýralamak için iki for döngüsü
			for(int j = 0 ; j< (diziBirBoyutlu.length - 1) ; j ++){					// Sýralama iþleminde enson eleman kullanýlmaz - "ArrayIndexOutOfBoundsException" hatasý almamak için
				
				if(diziBirBoyutlu[j] > diziBirBoyutlu[j+1]){						// **[j+1]** ArrayIndexOutOfBoundsException tehlikesi
					gecici = diziBirBoyutlu[j];
					diziBirBoyutlu[j] = diziBirBoyutlu[j+1];
					diziBirBoyutlu[j+1] = gecici;
				}
				
			
			}// for sonu
		}// for sonu
		
		System.out.println("\n\nTek sayýlardan oluþan dizinin sýralanmýþ hali: \n"  );
		
		for(int i = 0 ; i < diziBirBoyutlu.length ; i++){							// Sýralý bir boyutlu diziyi yazdýrma
			
			System.out.print(diziBirBoyutlu[i] + " ");
		}//for sonu
		
	}//main sonu

}
