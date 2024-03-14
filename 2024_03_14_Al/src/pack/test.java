
package pack;
import java.util.ArrayList;
public class test

{
	public static void main(String[] args)
	{

		// 여기다가 이제 추가 할 것은 배열 안에 있는 수를 입력받아서
		// 실행해보는것을 추가 해 봐야겠다.
		
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
		
//		else
//		{	int sumArr[] = new int[origin.length/2];
//			
//		
//			for ( int i = 0; i < origin.length/2; i++)
//			{
//			
//			}
//		}
			
		
			
//		for ( int i = 0; i < origin.length; i++)
//		{
//			 copyArr[i] = origin[i];
//			 
//			 firstResult = copyArr[i];
//			 copyArr[i] = origin[(origin.length-1)-i];
//			 secondResult = copyArr[i];
//			 //System.out.print(copyArr[i]+ ",");
//			 
//			 System.out.print(firstResult + secondResult);
//			 
//		}
//		for ( int i = origin.length; i > 0; i++)
//		{
//			 copyArr[i] = origin[i];
//			 System.out.print(copyArr[i]);
//			 
//		}
//		for ( int i = 0; i <origin.length ; i++)
//		{
//			 copyArr[i] = origin[(origin.length-1)-i];
//			 System.out.print(copyArr[i]);
//			 
//		}
//		int a = 1;
//		int b = 1;
//				
//		int x = 0;
//		int y = 0;
//		
//		String name;
//		name = "박 지 수";
						
//		System.out.println(++a);
//		System.out.println(--b);	
//		System.out.println(a++);
//		System.out.println(a++);
//		System.out.println(b--);
//		System.out.println(b--);
		
//		System.out.println(5/3);
//		System.out.println(5%3);
//		System.out.println(30 - 2 * (5 + 4));
//		System.out.println(++x * y--);
				
//		System.out.println("안녕하세요~ 반갑습니다! 제 이름은,");
//		System.out.print(name);
//		System.out.println("입니다. 잘 부탁드립니다.");
		
		
		

		
//		String origin = "asd";
//		
//		String copy = origin;
//		
//		origin = "asdd";
//		System.out.println(copy);
//		System.out.println(origin);
//		System.out.println(copy);
//		
//		
//		String n1 = "ABC";
//		String n2 = n1;
//		
//		String n3 = "ABC";
//		
//		
//		
//		
//		System.out.println(n1 == n2);
//		System.out.println(n3 == n2);
//		System.out.println(n1.equals(n3));
		

		
	}
		
}
