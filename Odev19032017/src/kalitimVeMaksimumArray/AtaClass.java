package kalitimVeMaksimumArray;

public class AtaClass {

	
	
	public int makDegerBul(int [][][] array){
	
	int	maks = 0; 
	int temp;	
		for(int i = 0 ; i < array.length ; i++ ){
			for(int j = 0 ; j < array[i].length ; j++ ){
				for(int k = 0 ; k < array[i][j].length ; k++){
					temp = array[i][j][k];
					
					if (maks < temp)
						maks = temp;
				}			
			}
		}
		
		
		return maks  ;
	}
}
