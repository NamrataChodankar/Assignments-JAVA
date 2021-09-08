/*1.  Replace a character a with e in following string without using inbuilt method.
  Halo
  Replace character at 3rd index pos in upper case.*/

public class ReplaceCharacter {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 String s = "Hayylo";
		 char oldChar='a';
		 char newChar='e';
		 StringBuilder builder = new StringBuilder();
	     System.out.println("The given string is: "+s);    
	       
	        for(int i=0;i<s.length();i++)
	        {
	            char ch = s.charAt(i);
	            if(ch==oldChar)
	            {
	                builder.append(newChar);
	            }
	            else if(ch==Character.toUpperCase(oldChar)){
	                builder.append(Character.toUpperCase(newChar));
	            }
	            else if(i==3){
	                builder.append(Character.toUpperCase(ch));
	            }
	            else{
	                builder.append(ch);
	            }
	        }
	        System.out.println("Modified string is :" +builder.toString());
	    }



		    
}