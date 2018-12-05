
public class Kisiler {
	
	int id;
	String isim;
	int dogumYili;
	
	int getId(){
		return id;
	}
	
	void setId(int gelen){
		this.id = gelen;
	}
	
	String getIsim(){
		return isim;
	}
	
	void setIsim(String gelen){
		this.isim = gelen;
		
	}
	
	int getDogumYili(){
		return dogumYili;
	}
	
	void setDogumYili(int gelen){
		this.dogumYili = gelen;
	}
	
	void yasHesapla(){
		int yas;
		yas = 2017 - dogumYili ;
		System.out.println("Kiþinin yaþý: " + yas);
	}
	
	
	
}
