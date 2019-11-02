package Demo1;

import java.util.Scanner;

import org.testng.reporters.jq.Main;

public class Practice1
{
 public static void main(String[] args) 
 
 {
	

//1.program for pattern
  /* 1*****
	 12****
	 123***
	 1234**
	 12345*
	 123456 */

 /* 
	
for (int i =1; i <=6; i++)
{	
	for (int j =1; j <=i; j++) 
	{
		
	
System.out.print(j);	
	
}	
for (int k =6; k>i; k--)
{
System.out.print("*");	
}	
System.out.println();
} */

	//2.program for pattern
/*	 12345&
	 1234&&
	 123&&&
	 12&&&&
	 1&&&&&
	 &&&&&& */
	 
    
/* for (int i=6; i>=1; i--)
	 {
		 
		for (int j=1; j<i; j++) 
		{
			System.out.print(j);
		
		}
		for (int k=6; k>=i; k--)
		{
		System.out.print("&");
		
		}
		System.out.println();
	} */
	
	//3. program for pattern
/*	 @
	 @ @
	 @  @
	 @   @
	 @    @
	 @     @
	 @ @ @ @ @   */
	 
	 
	 
 /*	 System.out.println("@");
	 for (int i =5; i>=1; i--) 
	 {
		System.out.print("@");
		for (int j =5; j>=i; j--)
		{
		System.out.print(" ");
		
		}
		System.out.println("@");
	
	}
	for (int j = 5; j>0; j--)
	 {
	System.out.print("@ ");	
	}
	 
	 */
	 
	//4. program to print
/*	 1  10  11  20  21  30  
	 2  9  12  19  22  29  
	 3  8  13  18  23  28  
	 4  7  14  17  24  27  
	 5  6  15  16  25  26  
	 6  5  16  15  26  25  
	 7  4  17  14  27  24  
	 8  3  18  13  28  23  
	 9  2  19  12  29  22  
	 10  1  20  11  30  21  */ 

	/* System.out.println();
	 for (int a = 1,b=10,c=11,d=20,e=21,f=30;a<=10;a++,b--,c++,d--,e++,f--) 
	 {
	System.out.println(a+"  "+b+"  "+c+"  "+d+"  "+e+"  "+f+"  ");	
	} */
	 
// 5.write a program that takes the height and width of a square and print height and width with 
//   alphabet'B'.ex:If user presses 5 for height and 8 for width,your program should print the followi-
//   ng.(Restrict the user such that height or width should not be equal to zero).
	 
/*	Scanner sc=new Scanner(System.in);
	System.out.println("Enter rows:");
	int rows=sc.nextInt();
	System.out.println("Enter columns:");
	int columns=sc.nextInt();
	if (rows<=0||columns<=0) {
		
	}
	else {
		for (int i =1; i <=rows; i++)
		{
			for (int j =1; j <=columns; j++)
			{
			System.out.print("B");	
			}
			System.out.println();
		}
	} */
	 
	// 6.Develop a program that inputs 10 different integers within a while loop and displays largest
	//   and smallest(Repetition of numbers are not allowed)
	 
/*	Scanner sc=new Scanner(System.in); 
	int i=2,small=0,large=0;
	System.out.println("Num 1: ");
	int a=sc.nextInt();
	small=a;
	large=a;
	 while (i<=10)
	 {
	System.out.print("Num"+i+":");	
	int b=sc.nextInt();
	if (b<small)
	{
	small=b;	
	}
	if (b>large)
	{
	large=b;
	}
	i++;
	}
	System.out.println("Larger:"+large+" 	Smaller:"+small);
	}  */
/*	Scanner sc=new Scanner(System.in);
	
	int i=2,small=0,large=0;
	System.out.println("Num 1:");
	int a=sc.nextInt();
	small=a;
	large=a;
	while (i<=10)
	{
		System.out.print("Num"+i+":");
	 int b=sc.nextInt();
	 
	if (b<small)
	{
		small=b;
	}	
	if (b>small) 
	{
		large=b;
	}
	i++;
	}	
	 System.out.println("Larger:"+large+"smaller:"+small);
	} */
 //7. program for base and power
Scanner sc=new Scanner(System.in);
System.out.println("Enter base:");
int b=sc.nextInt();
System.out.println("Enter power");
int e=sc.nextInt();
int result=1,i=1;
do {
	result=result*b;
	i++;	
}
while (i<=e);
System.out.println("Result:"+result);


 


}
}



	







	
