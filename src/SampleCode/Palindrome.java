package SampleCode;

public class Palindrome{

	public static void main(String[] args){
		
	palindrome(12345);
	palindrome(123454321);
	palindrome(34543);
	palindrome(987);
	
	
		

	}
	
	
	public static void palindrome(int n){
		
		int r,sum=0,temp;    
//		  int n=485584;//It is the number variable to be checked for palindrome  
		  System.out.println("given Number is = "+n);
		  temp=n;    
		  while(n>0){    
		   r=n%10;  //getting remainder  
		   sum=(sum*10)+r;    
		   n=n/10;    
		  }    
		  if(temp==sum)  {  
		   System.out.println("given num is palindrome number ");  
		  System.out.println("the number after palindrome operation is == "+sum+"\n");}
		  else    
		   System.out.println("given num is not a palindrome"+"\n");
		
		
		
	}

}
