package ch02;

public class ArrayUtils {

	
	
		public static double[] intToDouble(int[] intArray){
			
			
			double[] dArrary=new double[intArray.length];
			
			for(int i=0;i<intArray.length;i++){
				
				dArrary[i]=intArray[i];
				
				
			}
			
			return dArrary;
			
			
		}
		
		
	public static int[] doubleToInt(double[] intArray){
			
			
			int[] dArrary=new int[intArray.length];
			
			for(int i=0;i<intArray.length;i++){
				
				dArrary[i]=(int) intArray[i];
				
				
			}
			
			return dArrary;
			
			
		}
	
	
	public static int[] concat(int[] intArray,int[] intArray1){
		
		
		int[] Array=new int[intArray.length+intArray1.length];
		
		//System.out.println(intArray.length);
		//System.out.println(Array.length);
		
		int j=0;
		for(int i=0;i<intArray.length;i++){
			
			Array[i]=intArray[i];
			
			
		}
		for(int i=intArray.length;i<Array.length;i++){
			
			Array[i]=intArray1[j];
			j++;
			
		}
		
		
		return Array;
		
		
	}
	
	
	
	
}
