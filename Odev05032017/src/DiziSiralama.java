import java.util.Arrays;

public class DiziSiralama {

	
	public static void main(String[] args) {
		
		
		int[][] diziIkiBoyutlu = {{15,566,56,911},
								  {66,211,511,44},
								  {65,999,1,95}  ,
								  {88,89,595,63}};
		
		
		int sayacBir = 0 ; 																// olu�turulacak bir boyutlu dizininin eleman say�s�n� bulmak i�in saya�
		
		for (int i = 0 ; i < diziIkiBoyutlu.length ; i++){  							// iki boyutlu dizi elemanlar�n� yazd�rma
			for (int j = 0 ; j < diziIkiBoyutlu[0].length ; j++){
				System.out.print("["+i+"]["+j+"]=" + diziIkiBoyutlu[i][j]  + "\t");
				
				if(diziIkiBoyutlu[i][j] % 2 == 1){ 										// iki boyutlu dizideki tek say�lar� sayma i�lemi
					sayacBir ++;
				}
				
			}//for sonu
			System.out.println("\n");
			
		}//for sonu
		
		
		
		int [] diziBirBoyutlu = new int[sayacBir];																	
		
		int sat�r = diziIkiBoyutlu[0].length;
		
		
		int sayacIki = 0; 																// bir boyutlu dizi elemanlar�na ula�mak i�in saya�
		
		for (int i = 0 ; i < diziIkiBoyutlu.length ; i++){  							
			for (int j = 0 ; j < diziIkiBoyutlu[0].length ; j++){
								
				if(diziIkiBoyutlu[i][j] % 2 == 1){ 										// iki boyutlu dizideki tek say�lar� bir boyutlu diziye atama
					diziBirBoyutlu[sayacIki] = diziIkiBoyutlu[i][j];
					sayacIki ++;
				
				}//if sonu
			}//for sonu
		}//for sonu
				
		
		System.out.println("Tek say�lardan olu�an dizi: \n"  );
		
		for(int i = 0 ; i < diziBirBoyutlu.length ; i++){								// bir boyutlu diziyi yazd�rma
			
			System.out.print(diziBirBoyutlu[i] + " ");
		}//for sonu
		
		/*
		 * dizi elemanlar�n s�ralanmas� java.util paketi i�ierisindeki Arrays s�n�f�ndaki
		 * statik sort() fonksiyonu ile de s�ralanabilir.
		 * 
		 * Arrays.sort(diziBirBoyutlu);
		*/
		
				
		int gecici;																		// dizi s�ralams�nda kullan�lacak ge�i�i degi�ken
				
		for(int i = 0 ; i < diziBirBoyutlu.length ; i++ ){							// dizi elemanlar� s�ralamada b�t�n elemanlar� s�ralamak i�in iki for d�ng�s�
			for(int j = 0 ; j< (diziBirBoyutlu.length - 1) ; j ++){					// S�ralama i�leminde enson eleman kullan�lmaz - "ArrayIndexOutOfBoundsException" hatas� almamak i�in
				
				if(diziBirBoyutlu[j] > diziBirBoyutlu[j+1]){						// **[j+1]** ArrayIndexOutOfBoundsException tehlikesi
					gecici = diziBirBoyutlu[j];
					diziBirBoyutlu[j] = diziBirBoyutlu[j+1];
					diziBirBoyutlu[j+1] = gecici;
				}
				
			
			}// for sonu
		}// for sonu
		
		System.out.println("\n\nTek say�lardan olu�an dizinin s�ralanm�� hali: \n"  );
		
		for(int i = 0 ; i < diziBirBoyutlu.length ; i++){							// S�ral� bir boyutlu diziyi yazd�rma
			
			System.out.print(diziBirBoyutlu[i] + " ");
		}//for sonu
		
	}//main sonu

}
