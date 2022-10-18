package Practice;

public class arrayexmple {

	public static void main(String[] args) 
	{
		int a[] = {21,52,63,54,35,46};
		
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			 if(min>a[i])  
				  min=a[i];  
		}
		int max=a[0];
		for(int i=0;i<a.length;i++)
		{
			 if(max<a[i])  
				  max=a[i];  
		}
		System.out.println("Maximum :"+max);
		System.out.println("Minimum :"+min);

	}

}
