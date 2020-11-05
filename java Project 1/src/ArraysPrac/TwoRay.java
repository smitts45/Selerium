package ArraysPrac;

public class TwoRay {
	

	public static void main(String[] args)
	{
		int []a = new int[4];
		a[0]= 100;
		a[1]=200;
		a[2]=300;
		a[3]=400;
		
		System.out.println(" length of array " +a.length);
		System.out.println(" Assigning the number " +a[3]);
		
		/*for(int i=0; i<a.length; i++)
		{ 
			System.out.println(" for loop values" +a[i]);
			
		}*/
		
		for(int i:a)
		{
			System.out.println(i);
		}
			
	}

}
