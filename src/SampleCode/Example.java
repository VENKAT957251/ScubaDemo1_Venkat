package SampleCode;

public class Example {


	
	
	public void reverseWordInMyString(String str)
	   {
	         
	                String[] words = str.split(" ");
	                String reversedString = "";
	               // Fix #1: pls complete the code here
	                
//	                System.out.println(m);
//	                for(int i=m-1;i>=0;i--)
	                int m = words.length;
	                for(int i=0;i<m;i++)
	                {
	           String word = words[i];
	           String reverseWord = "";
	           
	          // Fix #2: pls complete the code here
	           int y = word.length();
	           for(int j=y-1;j>=0;j--)
	                   {
	                              
	                                reverseWord = reverseWord + word.charAt(j);
	                   }
	                   reversedString = reversedString + reverseWord + " ";
	                }
	                System.out.println(str);
	                System.out.println(reversedString);
//	                System.out.println(reversedString.length());
	   }
	
	
	public static void main(String[] args) {
		 Example obj = new Example();
        obj.reverseWordInMyString("dlogfogniwsanognigniwsnosdnargreheesotstnawrehtomym");

	}
	
	

}
