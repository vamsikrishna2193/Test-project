package Demo1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.xml.stream.events.Characters;

public class Practice2 
{

//	public static void main(String[] args) {
		
	
	{
/*		//20. How to find first non- repeated character of a given String?	(D)
			String str="aaccbcbee";	
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
			//If there no nonrepeating characters,print results as -1
			 	
			 boolean norepeatfound=false;
				for (int i = 0; i <lengthofstring; i++)
				{
			//Here we check freq of current character is 1 or not		
				
					Character currentcharacter=str.charAt(i);
					int currentfreq=hmap.get(currentcharacter);
					if (currentfreq==1) 
					{
						
					
					System.out.println(currentcharacter);
					norepeatfound=true;
					break;
					
				}	
				}
					if (norepeatfound==false) 
					{
					System.out.println(-1);	
					}	
			}           */
		

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
		 
		  

	//21.Java Program to Count Occurrence of Each Character in a String 
	
	//Let take a string "Hello".. in this string,H-1,e-1,l-2,o-1....
	//   Key   value
//      h      1
//      e      1
//	    l      2
//	    0      1  so,key value concept is used in storing key value pairs,we use Hash-map concept
// Key is character type,value is integer type.. Hashmap is a implementation class for Map Interface
//Firstly,We have to convert string to character array..[char[] chars=input.toCharArray()].
//	After that we have to read characters one by one
//For getting character one by one,	we are using "For-Each loop", as for(char ch: chars)[This logic will
// give each character avaiable in map],so each character has to be stored in the map..1st ch represents
// 'h',so 'h' is stored in map with concept of'1'..we use map.put()..."put" is used to store data in form
// of 'key and value pairs'in the map..[map.put(ch,1).. key is represented as 'ch' and value is '1'..
// Thus h-1 is stored in map[i.e h is stored in key,1 is stored in value]..,same for e..[i.e e -1 is 
//	stored in map]..same for 'L' also..but 'L' is repeating 2times..As L is already avaialble,again we have
// have to store 'L',then it will overeide previous 'L'and value is store as '1'...so,if key is already
// represented in map,then it is going to overwrite[i.e whenever we store duplicate key in map,it is going
// to overwrite previous key,till now also L -1 only,but we want to display L -2..so,we have to check whether
// key is already present in map..for solving this,if key is present in map don't store it '1'...
//Read existing value for that key,then increment existing value and store that in map..Therefore,first we
// need to check whether is key is present or not and we need to get value for the existing key...so,to check
//whether key is present or not,we can go for "Contains key method",to get value of key we can go for "get method"
//so,3methods we are using here..1.Map[which is used to store data in form of key and value
//	                          2.Contains[To check whether key is already present or not]
//	   3.get method[If key is already present,then get existing value from that key,then increment...if key
//  is not presented,then store this key with value '1' only]..we can do it by using 'If condition'
//	if (!map.containsKey(ch)) 
//	{
//		map.put(ch,1) }; The above 'if-condition'	tells that:when we try to store Entry in map,first check 
//key is present or not..if key is not presented,the store that key with value as '1'...If key is already
// present,then get the existing value by using get method,then increment that value and store that value 		
// in map..so we use 'Else statement'..
//	                 else {
//	               int cnt=map.get(ch);[ if key alrdy present,we get value of that key,restore that key by incrementing value]
//	               map.put(ch,cnt+1); finally
//	          system.out.println(map)
	
	
	
/*	String input="system";
	Map<Character,Integer> map=new HashMap();
	char[] chars= input.toCharArray();
	for (char ch : chars)
	{
	if (!map.containsKey(ch)) 
	{
		map.put(ch, 1);
	}	
	
	else 
	{
	int value=map.get(ch);
	map.put(ch, value+1);
	}
	}
	System.out.println(map);
	
	
	
	}
	}  */

//22.java program to find the duplicate words and their number of occurrences in a string(D)->prgrm
//not executed..
		
		public static void main(String[] args)
		{	
	/*	duplicatewords("hi java is as best as java");		
		}					
		public static void duplicatewords(String inputstring)
		{
          
        //split
			 String words[]=inputstring.split("  ");
			 //create hashmap
			 Map<String, Integer> wordcount=new HashMap<String,Integer>();
			  for (String word : words) 
			  {
			//If word is present	
				  if (wordcount.containsKey(word))
				  {
					wordcount.put(word.toLowerCase(), wordcount.get(word)+1);
				}
			  
				  else {
					wordcount.put(word, 1);
			}				  
			}
		
		
	//Extracting all keys of map-wordcount,keyset returns equivalence set of hashmap(D)
			  Set<String> wordsinstring=wordcount.keySet();
 //loop through all the words in wordcount
			  for (String word : wordsinstring) 
			  {	  
				  if (wordcount.get(word)>1) 
				  {
					System.out.println(word+" : "+wordcount.get(word));
				}		
			}		*/
			
			//otherway without occurences
	/*		 String string = "Big black bug bit a big black dog on his big black nose";  
		        int count;  
		          
		        //Converts the string into lowercase  
		        string = string.toLowerCase();  
		          
		        //Split the string into words using built-in function  
		        String words[] = string.split(" ");  
		          
		        System.out.println("Duplicate words in a given string : ");   
		        for(int i = 0; i < words.length; i++) {  
		            count = 1;  
		            for(int j = i+1; j < words.length; j++) {  
		                if(words[i].equals(words[j])) {  
		                    count++;  
		                    //Set words[j] to 0 to avoid printing visited word  
		                    words[j] = "0";  
		                }  
		            }  
		              
		            //Displays the duplicate word if count is greater than 1  
		            if(count > 1 && words[i] != "0")  
		                System.out.println(words[i]);  
		            
		        }  
		        
		    }      */
	
			
			
//23)How to replace a substring inside a string by another one?		
/*			
	String str="I am vamsi krishna";  
	  System.out.println(str.replace('I', 'i'));
	  System.out.println(str.replaceFirst("am", "ma"));
		System.out.println(str.replaceAll("vamsi krishna", "vampi"));	
							}
}
     */
//24) How to convert a string totally into upper case and lower case and also to convert 
//a particular word to upper and lower case?	
 
/*String str= "vamsi krishna";
String str1="VAMSI KRISH";
 System.out.println(str.toUpperCase()); 
  System.out.println(str1.toLowerCase()); */
			
//particular word to lowercase and uppercase
		/*	String x="VAMSI krishna";
			char y[]=x.toCharArray();
			int size=y.length;
	for (int i = 0; i < 5; i++)   
//here y[i]-32 is for converting lower to uppercase,y[i]+32 is for upper to lower[ASCII standards]
	{
	y[i]=(char) (y[i]+32);	
	}
System.out.println(y); */

//Converting 1st letter of each word to uppercase

/* String x="vamsi babai dammalapati";
char[]y=x.toCharArray();
int size=y.length;
y[0]=(char) (y[0]-32);
		int i=1;   //zeroth position is changed to upper case,thats why i=1(doubt)
	while (i!=size)
	{
		if (y[i]==' ') // for blank spaces appear,increment by 1 and continue..
		{
		y[i+1]=(char)(y[i+1]-32);	
		}
		i++; //for incrementing the characters
	}	
		
		System.out.println(x);
		System.out.println(y); */
		
	//25.java program to count the number of words in a string(D)-> about count..	
			
/*		String str="I am vamsi krishna nenu";
		int count=1;
		
		for (int i = 0; i < str.length()-1; i++) 
		{
			if ((str.charAt(i)==' ') && (str.charAt(i+1) !=' ')) 
{
	count++;
				
			}
			}
		System.out.println(count);  */
			
	//26)How to find vowels in a string in java
			//using scanner class
	/*		Scanner sc=new Scanner(System.in);
			System.out.println("Enter string:");
   String str=sc.nextLine();
   int count=0;
   for (int i = 0; i <str.length(); i++) {
   char ch=str.charAt(i);
   if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u')
   {
	count++;
}
   				
   }
   System.out.println(count);  */
			
// without using scanner class			
/* String str="This is vamsi krishna 2 hello";
 int vowels=0, consonants=0, digits=0, spaces=0;
 str=str.toLowerCase();
 
 for (int i = 0; i < str.length(); i++) 
 {
	 char ch=str.charAt(i);
	 if (ch=='a'|| ch=='e'|| ch=='i'|| ch=='o' || ch=='u') 
	 {
		 vowels++;
	 }
		 else 
		 {
		if (ch>='a' && ch<='z' )
		{
			consonants++;
		}	 
		else if( ch >= '0' && ch <= '9')
        {
            ++digits;
        }
			
		else {
			if (ch== ' ') {
				spaces++;
				
				
			}				 
		}
       
	} 			
 }
 System.out.println("Vowels: " + vowels);
 System.out.println("Consonants: " + consonants);
 System.out.println("Digits: " + digits);
 System.out.println("White spaces: " + spaces);    */
			
//27) Write a java program to remove all white spaces from a string
			
		/*	String sentence = "T    his is b  ett     er.";
	        System.out.println("Original sentence: " + sentence);
	        sentence = sentence.replaceAll("\\s", "");
	        System.out.println("After replacement: " + sentence); */
//	29.How do you sort the array elements?(D)		
	/*	//Using sort function	
	    int array[]={2,4,5,1,3};
			Arrays.sort(array);
			//Descending order                           Ascending order
			for (int i = 4; i >=0; i--)             //for(int i=0;i<=array.lenth-1;i++)
				
			{        
				System.out.print(array[i]);
			}     */
			
		//Other method
		/*	String str[]={"one","two","three","four"}; //[Based on Alphabetical order]
			System.out.println("Before sorting:");
			for (String string : str) {
				System.out.println(string);
				
			}
//For Ascending order.....   for descending order we use Arrays.sort(str,collections.reverseOrder())
			Arrays.sort(str);
			System.out.println("After sorting:");
			for (String string : str)
			{
			System.out.println(string);	
			}   */
			
//31(a).How to find Duplicate elements in java array?? [D]--> o/p not coming for else  condition
				
			/*	String names[] = {"java","javascript","python","ruby","php","java","python"};
				//compare Each element
				
				for (int i = 0; i < names.length; i++)
				{
					for (int j = i+1; j < names.length; j++)
					{
						
					
					if (names[i].equals(names[j]))
					{
						System.out.println("duplicate element is:" +names[i]);
					}
					
					else {
						
					System.out.println("no duplicate");
					}
					
					}
					}
				
					}   */
//31.(b) How to and add, multiply, subtract one matrix from other matrix
	//Addition of two matrices
	/*		int rows,columns;
			Scanner sc=new Scanner(System.in);
		System.out.println("Enter no of rows");
		rows=sc.nextInt();	
		System.out.println("Enter no of columns:");
			columns=sc.nextInt();
			int a[][]=new int[rows][columns];
			int b[][]=new int [rows][columns];
			System.out.println("Enter first matrix");
			for (int i = 0; i <rows; i++) {
				for (int j = 0; j <columns; j++) {
					a[i][j]=sc.nextInt();
				}
			}
			System.out.println("Enter second matrix:");
			for (int i = 0; i <rows; i++) {
				for (int j = 0; j < columns; j++) {
					b[i][j]=sc.nextInt();
				}
			} 
	
			  int[][] c = new int[rows][columns];
		       for (int i = 0; i < rows; i++) {
		           for (int j = 0; j < columns; j++) {
		               c[i][j] = a[i][j] + b[i][j]; // " -" for subtraction...
		           }
		       }
		     System.out.println("Sum of two matrices is:");  
		     for (int i = 0; i < rows; i++) {
		           for (int j = 0; j < columns; j++) {
		               System.out.print(c[i][j] + " ");
		           }
		           System.out.println();
		       }
		   } */
		
//32)How to create and print a collection (try using list, set, map)?		
    /*                //LIST      
			//Get array list
			List<Integer> list=new ArrayList<Integer>();
			
		//Populate 	the list
		list.add(22);
		list.add(21);
		list.add(29);
		list.add(30);
		// printing the list
		System.out.println("List is:"+list);
		// getting minimum value using min() method
		int minlist=Collections.min(list);
		System.out.println("min value of list is:"+minlist);
		
		 // getting maximum value  using max() method 
              int maxlist = Collections.max(list); 
              System.out.println("max value of list is:"+maxlist);  */
			
			//Using SET
			// Get the HashSet 
		/*	Set<Integer> set=new HashSet<Integer>();
      		
			// fill the hashSet 
	        set.add(3); 
	        set.add(6); 
	        set.add(2); 
	        set.add(9); 
	     // printing the Set 
	        System.out.println("Set: " + set); 
	  
	        // getting minimum value  using min() method 
	         int minSet = Collections.min(set); 
	  
	        // getting maximum value using max() method 
	         int maxSet = Collections.max(set); 
	  
	        // printing the minimum value 
	        System.out.println("Minimum value of set is: "
	                           + minSet); 
	  
	        // printing the maximum value 
	        System.out.println("Maximum value of set is: "
	                           + maxSet);         */
			//Using MAP
			// Creating hashMap 
	   /*     Map<String, Integer> map 
	            = new HashMap<String, Integer>(); 
	  
	        // Putting key-value pairs in map 
	        map.put("A", 10); 
	        map.put("B", 15); 
	        map.put("C", 20); 
	        map.put("D", 25); 
	  
	        // Print the map 
	        System.out.println("Map: " + map); 
	  
	        // getting minimum value using min() 
	        String minKey = Collections.min(map.keySet()); 
	  
	        // getting maximum value using max() 
	        String maxKey = Collections.max(map.keySet()); 
	  
	        // printing the minimum value 
	        System.out.println("Minimum Key of Map is: "
	                           + minKey); 
	        System.out.println("Value corresponding to "
	                           + "minimum Key of Map is: "
	                           + map.get(minKey)); 
	  
	        // printing the maximum value 
	        System.out.println("Maximum Key of Map is: " + maxKey); 
	        System.out.println("Value corresponding to "
	                           + "maximum Key of Map is: "
	                           + map.get(maxKey));         */
			
	//33)How to convert an array into a collection?	
		
		
		
		
		
		
		}
		
		} 
	

	    		
		   

		
		

		
		
	
	
	
	
	
	
	
	
	
	
	
	
	



	


