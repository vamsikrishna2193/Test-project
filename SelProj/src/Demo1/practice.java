package Demo1;

import java.util.HashMap;
import java.util.Scanner;

import org.openqa.selenium.chrome.ChromeDriver;

public class practice {
	public static void main(String[] args) {
		
	
	
/*int p;
int q;

	
		  public static void main(String args[])
		   {
			  practice obj=new practice();
			  int x=10;
			  int y=20;
			  obj.m1(x,y);
			  obj.p=50;
			  obj.q=60;
			  obj.swap(obj);
			  System.out.println(obj.p);
			     System.out.println(obj.q);
		   }
				
			 public int m1(int a,int b)
			 {
				  
				 int c=a+b;
				 return c;
			 
			 }
			 public void swap(practice t)
			 {
		     int temp;
		     temp=t.p;
		     t.p=t.q;
		     t.q=temp;
		     System.out.println(t.p);
		     System.out.println(t.q);
			 }*/
	
//1.a swap two numbers without using temp
/*		{
	int x=20;
	int y=10;
	 System.out.println("Before Swapping");
	  System.out.println("Value of x is :" + x);
	  System.out.println("Value of y is :" + y);

	x=x-y;
			
	y=x+y;
	System.out.println("After Swapping");
	  System.out.println("Value of x is :" + x);
	  System.out.println("Value of y is :" + y);
	 }
	
	

}*/
	//1.b. swapping of two numbers using temp variable
	/*	int x,y,temp;
		 x=20;
		 y=10;
		 System.out.println("Before Swapping");
		  System.out.println("Value of x is :" + x);
		  System.out.println("Value of y is :" + y);
		  temp=x;
		  x=y;
		  y=temp;
		  System.out.println("After Swapping");
		  System.out.println("Value of x is :" + x);
		  System.out.println("Value of y is :" + y); */
		
		
	//2. program to check even or odd
		
	/*	int num;
		System.out.println("enter a integer number");
		Scanner input=new Scanner(System.in);
		num=input.nextInt();
		if (num%2==0) 
		{
		System.out.println("no is even");	
		}
		else {
			System.out.println("no is odd");
		} */
		
	//3. Write a program to find all prime number up to a given numbers?
		
	/*	for (int i = 2; i <=30; i++)
		{
		for (int j = 2; j <=i; j++)
		{
		if (j==i)
		{
		System.out.println(i);	
		}	
		else {
			if (i%j==0)
			{
			break;
			
			}
		}
		}	
			
	} */
		
	//4.code to check whether an integer is Armstrong number or not?
		
/*	int c=0,a,temp;
	int n=153;
	temp=n;
	
while (n>0) 
{
 a=n%10;
 n=n/10;
 c=c+(a*a*a);
}
	if (temp==c)
	{
	System.out.println("armstrong number");	
	}	
	else {
		System.out.println("Not armstrong number");
	} */
		 
	//5.  program to check whether a number is palindrome or not?
	
	/*	int num,rem,original,rev=0;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		num=scan.nextInt();
		original=num;
		while (num!=0)
		{
		rem=num%10;
		rev=rev*10+rem;
		num=num/10;
		}
		if (rev==original)
		{
			System.out.println("palindrome");
		}
		else {
			System.out.println("Not palindrome");
		} */
		
	//6.fibnocci series of nth number recursive and iterative
		
	//7.program to find largest of three integers in Java
		 
	/*	int x,y,z;
		 System.out.println("Enter three integers");
		    Scanner in = new Scanner(System.in);
		 
		    x = in.nextInt();
		    y = in.nextInt();
		    z = in.nextInt();
		if (x>y && x>z) {
			System.out.println("first number is large");
			}
		
		else if (y>x && y>z) 
				System.out.println("second number is large");
			
		
			else if (z>x && z>y)
		
			System.out.println("third number is large");
			else
			      System.out.println("The numbers are not distinct."); */
		
		 // 8.Write a program to find sum of all integers greater than 100 and less than 200 that are divisible by 7?     
	/*	int result=1;
		for (int i = 100; i <=200; i++) 
		{
		if (i%7==0) 
		{
		result= +i;
		System.out.println("output:"+ result); 
		
		}	
		}   */
		
	//9.Write a program to convert given no. of days into months and days.	
	/* int m,month,week,day;
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter no.of days:");
	 m=sc.nextInt();
	 month=m/30;
	 m=m%30;
	 System.out.println("no.of.months:"+month);
	 week=m/7;
	 m=m%7;
	 System.out.println("no.of.weeks:"+week);
	 day=m;
	 System.out.println("no.of.days:"+day);  */
	
	//10.Find sum of N numbers(D)
	
	//	int num=50,sum=0;
	//	System.out.println("enter sum of values:");
		
	//	for (int i = 1; i <=num; ++i)
	//	{
	//	sum=sum+i;
	
//		}
		
		
		//while loop
	/*	int num=50,i=1,sum=0;
		while (i<=num) {
			sum=sum+i;
			i++;
			System.out.println(sum); 
			
			
		} */
	// 11. Write a Java program which finds if a given year is leap year or not?	
	/*	int year = 2000;
		
        boolean leap = false;
        if(year % 4 == 0)
        {
            if( year % 100 == 0)
            {
                // year is divisible by 400, hence the year is a leap year
                if ( year % 400 == 0)
                    leap = true;
                else
                    leap = false;
            }
            
        if(leap)
            System.out.println(year + " is a leap year.");
        else
            System.out.println(year + " is not a leap year.");
    
} */
		
	/*	int year;
	      System.out.println("Enter an Year :: ");
	      Scanner sc = new Scanner(System.in);
	      year = sc.nextInt();

	      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
	         System.out.println("Specified year is a leap year");
	      else
	         System.out.println("Specified year is not a leap year");
	   }
	}	         */
		
		

// 12.)  Java Program To print Numbers in Below pattern: 

 //       *                        *  *  *  *  *
 //      * *                          * * * * 
 //     * * *                          * * * 
 //    * * * *                          * *
 //  *  *  *  *  *                       *            */     

		//16. Write code to check a String is palindrome or not?(D)
	/*	 String a,b="";
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter String:");
		 a=sc.nextLine();
		 int n=a.length();
		 for (int i = n-1; i>=0; i--)
		 {
		b=b+a.charAt(i);	
		}
		if (a.equalsIgnoreCase(b))
		{
		System.out.println("palindrome");	
		}
		else
			System.out.println("not palindrome");
	} 
}
	
	//17.Write a method which will remove any given character from a String,replace in string?
/*	// Removing a character or charcters from a string
		String str="I am vamsi";
	//StringBuilder build=new StringBuilder(str);
	//build.deleteCharAt(8);
	//build.deleteCharAt(7-1);
	//System.out.println(build);
	//Replacing in a string
	StringBuffer buffer = new StringBuffer(str);
    buffer.replace(1, 2, "hi"); // Shift the positions front.
    buffer.replace(7, 8, "bi");
    System.out.println(buffer); */
		
 //18.Write a program to concatenate string using for Loop?
	//methods to concatenate strings	
		//String str1 = "Vamsi";
		//String str2 = "Krishna";
  //        First method
	//	StringBuilder sb = new StringBuilder(); 
	//	sb.append(firstname).append(" ").append(lastname);
	//	System.out.println(sb.toString());
		// second method
		//String name = firstname + " " + lastname; 
		//System.out.println(name);
    // Third method
	//	StringBuffer sBuffer = new StringBuffer(15); 
	//	sBuffer.append(firstname).append(" ").append(lastname);
	//	System.out.println(sBuffer.toString());
 
		//using Forloop
		
		
		
		
		
		
		
//Find factorial of a number using recursion,Non-recursive?(D)
		//	non	-recursive
/*	int num;
		System.out.println("Enter number:");
		Scanner sc=new  Scanner(System.in);
		
		int i;
		int fact=1;
		num=sc.nextInt();
	
		i=1;
		while (i<=num) 
		{
			fact=fact *i;
			i++;
								
		}
			
		System.out.println("factorial is:"+fact);
		
		}      */
		

				
	//19.Revering a string
	//As String is immutable class,reverse option will not be available in string class
	//	String str="vamsi";
	/*	int len=str.length();
		String rev="";
		for (int i = 5; i <=len-1; i--)
		{
			rev=rev+str.charAt(i);
			System.out.println(rev);
			} */
		//using string buffer class
	//	StringBuffer sb=new StringBuffer(str);
	// System.out.println(sb.reverse());
		
	//20. How to find first non- repeated character of a given String?	
		//using hashmap
	/*	String str="aagcbcbef";	
		HashMap<Character, Integer> hmap=new HashMap<Character,Integer>();
		int lengthofstring=str.length();
		for (int i = 0; i <lengthofstring; i++)
		{
			Character currentcharacter=str.charAt(i);
			//If the character is present or not in hashmap will be checked
	if (hmap.containsKey(currentcharacter)==false) //giving false means character is not present 
			{
	//If character is not present in hashmap,then insert character with frequency 1,if character
	// is present,control will go to else statement
				hmap.put(currentcharacter, 1);		
			}
			
//If character is present in hashmap,then increase frequency by 1
			else {
				
			//This statement gives freq of current character which we are accessing
				int currentfreq=hmap.get(currentcharacter);
				currentfreq++;
				hmap.put(currentcharacter, currentfreq);
			}
			}
	//Again we have to traverse the string,for that again we are repating loop
		
		for (int i = 0; i <lengthofstring; i++)
		{
	//Here we check freq of current character is 1 or not		
		
			Character currentcharacter=str.charAt(i);
			int currentfreq=hmap.get(currentcharacter);
			System.out.println(currentfreq);
			
		}	
				
	}
}             */
		
		
		
		 String str1 = "gibblegabbler";
		  System.out.println("The given string is: " + str1);
		  for(int i = 0; i < str1.length(); i++)
		  {
		   boolean unique = true;
		   for (int j = 0; j < str1.length(); j++) {
		    if (i != j && str1.charAt(i) == str1.charAt(j)) {
		     unique = false;
		     break;
		    }
		   }
		   if (unique) {
		    System.out.println("The first non repeated character in String is: " + str1.charAt(i));
		    break;
		   }
		  }
	}

		
	}

	    








 
 



	
	

		
	 
	
	
		
			

		  





		      
		
	    
	        
	 


	
	


