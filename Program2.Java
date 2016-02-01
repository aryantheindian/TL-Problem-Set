public class DeDup 
{
    public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
                                   20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
                                   13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};   
    
	public static int[] uniqueArray(int []inputRandomIntegers)
	{
			ArrayList<Integer> uniqueIntegers = new ArrayList<Integer>();

			boolean isDups = false;
			
			for(int i=0; i<inputRandomIntegers.length; i++)
			{
				
				for(int j=0; j<uniqueIntegers.size(); j++)
				{
					if(uniqueIntegers.get(j) == inputRandomIntegers[i])
					isDups = true;
				}

				if(!isDups)
					uniqueIntegers.add(inputRandomIntegers[i]);
				
				isDups = false;
			}
			int newLength;
			
			newLength = uniqueIntegers.size();
			
			public int[] resultArray = new int[newLength]; 
			
			for(int i=0; i< newLength; i++)
			{
				resultArray[i] = uniqueIntegers.get(i);
			}
			
			return resultArray;
	}
	
	public static void main(String [] args) 
	{
			uniqueArray(randomIntegers);
	
	}
}
