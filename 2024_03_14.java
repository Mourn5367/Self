package pack;
import java.util.ArrayList;
public class test

{
	public static void main(String[] args)
	{
		int origin[] = {0,1,2,3,4};
		
		int copyArr[] = new int[origin.length]; 
		
		int firstResult = 0;
		int secondResult = 0;
		int finalResult = 0;
		
		//System.out.print(origin.length +"\n");
		//System.out.print(origin.length%2);
		System.out.print(origin.length/2);
		//int a = origin.length%2;
		//System.out.print(a);
		if (origin.length%2 > 0 )
		{
			int sumArr[] = new int[origin.length/2 +1 ];
			for ( int i = 0; i <= origin.length/2; i++)
			{
				if( i == origin.length/2)
				{
				sumArr[i] = origin[i];
					for (int j = 0; j <sumArr.length; j++)
						{
							System.out.print(sumArr[j]);
							finalResult = finalResult + sumArr[j];
						}
				}
				else 
				{
				copyArr[i] = origin[i];
				
				firstResult = copyArr[i];
				
				copyArr[i] = origin[origin.length-i -1];
				secondResult = copyArr[i];
				
				sumArr[i] = firstResult + secondResult;
				}
			}
		}
		else if (origin.length%2 == 0 )
		{
				int sumArr[] = new int[origin.length/2];
				for ( int i = 0; i <= origin.length/2; i++)
			{

					{
						if (i == origin.length/2)
						{
							break;
						}
						copyArr[i] = origin[i];					
						firstResult = copyArr[i];
						copyArr[i] = origin[origin.length-i -1];
						secondResult = copyArr[i];
						
						sumArr[i] = firstResult + secondResult;	
						finalResult = finalResult + sumArr[i];
					}
			}
		}
		
		System.out.println(" 무려 "+ finalResult + " 이다.");
  }
}
