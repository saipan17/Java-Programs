import java.util.Scanner;
import java.util.Arrays;
public class AnagramStrings {
	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter First String");
		String str1 = sc.nextLine();
		
		System.out.println("Enter Second String");
		String str2 = sc.nextLine();
		
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
	   if(str1.length() != str2.length()) {
		   
		     System.out.println("Strings are not Anagram");
	   }
	   else {
		   
		   char ch3[] = str1.toCharArray();
		   char ch4[] = str2.toCharArray();
		   
		   
		   Arrays.sort(ch3);
		   Arrays.sort(ch4);
		   
		   if(Arrays.equals(ch3, ch4)) {
			   
			   System.out.println("Both Strings are anagram");
		   }
		   else {
			   
			   System.out.println("Strings are not anagram");
		   }
	   }
	        
	}

}