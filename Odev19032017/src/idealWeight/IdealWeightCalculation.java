package idealWeight;

public class IdealWeightCalculation {

	
	/***   Ýdeal kilo hesaplama ödevi 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 * 
	 */
	public String sex;
	public int height;
	public int weight;
	
	
	public IdealWeightCalculation(String sexType, int valueOfWeight, int valueOfHeight){
		sex = sexType;
		weight = valueOfWeight;
		height = valueOfHeight;
		
	}
	
	public void calculateIdealWeight(){
		
		

	    String heightInString = Integer.toString(this.height);
	    int modifiedHeight = Integer.parseInt(heightInString.substring(1));
	    
	    if (sex.equals("male")){
	    	if(weight <= modifiedHeight + 10 && weight >= modifiedHeight - 10 ){
	    		System.out.println("You are at the ideal weight.");
	    	}else if(weight < modifiedHeight - 10 ){
	    		System.out.println("You are weak.");
	    	}else{
	    		System.out.println("You are overweight.");
	    	}
	    }
	    if(sex.equals("female")){
	    	if(weight <= modifiedHeight + 5 && weight >= modifiedHeight - 5 ){
	    		System.out.println("You are at the ideal weight.");
	    	}else if(weight < modifiedHeight - 5 ){
	    		System.out.println("You are weak.");
	    	}else{
	    		System.out.println("You are overweight.");
	    	}
	    	
	    }
	    
	    
	    
	    
		
	}
	
	public static void main(String[] args) {
		
		IdealWeightCalculation reference = new IdealWeightCalculation("female",80,176);
		reference.calculateIdealWeight();
		
	}
}
