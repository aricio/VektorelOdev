package arraysAndOOPBasics;

public class SuperClass {

	public SuperClass(){
		System.out.println("Running SuperClass constructor");
	}
	
	public int findMaxValueInThreeDimArray(int[][][] array) {

		int maxValue = 0;
		int temp;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				for (int k = 0; k < array[i][j].length; k++) {
					temp = array[i][j][k];

					if (maxValue < temp)
						maxValue = temp;
				}
			}
		}

		return maxValue;
	}
}
