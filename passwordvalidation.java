import java.util.*;

public class passwordvalidation {
	
	public static String validatepwd(String password) {
		if (!((password.length() >= 8) && (password.length() <= 20))) 
			return "invalid password(length not matched)";
		
		if (password.contains(" "))
			return "invalid(space not allowed)";
		
		 if (true) {
	            int count = 0;
	            for (int i = 0; i <= 9; i++) {
 String str1 = Integer.toString(i);	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	                return "invalid(no digit)";
	            }
	        }
if (!(password.contains("@") || password.contains("#")
	              || password.contains("!") || password.contains("~")
	              || password.contains("$") || password.contains("%")
	              || password.contains("^") || password.contains("&")
	              || password.contains("*") || password.contains("(")
	              || password.contains(")") || password.contains("-")
	              || password.contains("+") || password.contains("/")
	              || password.contains(":") || password.contains(".")
	              || password.contains(", ") || password.contains("<")
	              || password.contains(">") || password.contains("?")
	              || password.contains("|"))) {
	           return "invalid(no special character)";
	        }
	   if (true) {
	            int count = 0;
	            for (int i = 65; i <= 90; i++) {
	                char c = (char)i;
	  
	                String str1 = Character.toString(c);
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	            return "invalid(no uppercase letter)";
	            }
	        }
	   if (true) {
	            int count = 0;
	            for (int i = 97; i <= 122; i++) {
	                char c = (char)i;
	                String str1 = Character.toString(c);
	  
	                if (password.contains(str1)) {
	                    count = 1;
	                }
	            }
	            if (count == 0) {
	               return "invalid(no Lowercase letter)";
	            }
	          
	        }
			return "valid password";
	}
public static void main(String[] args) {
		
		String res;
		Scanner s=new Scanner(System.in);
		String str=s.nextLine();
		res=validatepwd(str);
		System.out.print(res);

	}

}


