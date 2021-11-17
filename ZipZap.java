package string_2;

public class ZipZap {

	public static void main(String[] args) {
		
		System.out.println(zipZap("zipXzap"));
		System.out.println(zipZap("zopzop"));
		System.out.println(zipZap("zzzopzop"));
		System.out.println(zipZap("abcppp"));
		System.out.println(zipZap("zi"));
		

	}
	
	
	/*
	 * Look for patterns like "zip" and "zap" in the string -- length-3, starting with 'z' and ending with 'p'. Return a string where for all such words, the middle letter is gone, so "zipXzap" yields "zpXzp".


	zipZap("zipXzap") 	--	"zpXzp"
	zipZap("zopzop") 	-- 	"zpzp"
	zipZap("zzzopzop") 	-- 	"zzzpzp"
	zipZap("abcppp") 	-- 	"abcppp"
	zipZap("zi") 		-- 	"zi"
	 */
	
	
	public static String zipZap(String str) {
		  
		  String result = "";
		  
		  for(int i=0; i<str.length(); i++){
		    
		    if (i<str.length()-2 && str.charAt(i) == 'z' && str.charAt(i+2) == 'p'){
		    	result = result + str.charAt(i) + str.charAt(i+2);
		    	i=i+2;
		    } else
		    	result = result + str.charAt(i);	    
		  }
		  
		  return result;
		  
		}
	
	
	// different solution
//	public static String zipZap(String str) {
//		return str.replaceAll("z.p", "zp");
//		}
	
	
	// different solution
//	public static String zipZap(String str) {
//	
//	  int len = str.length();
//	  String finalString = "";
//	
//	  for (int i = 0; i < len; i++) {
//	    finalString += str.substring(i,i+1);
//	    if (i > 0 && i < len-1) {
//	      if (str.charAt(i-1) == 'z' && str.charAt(i+1) == 'p')
//	        finalString = finalString.substring(0,finalString.length()-1);
//	    }
//	  }
//	  return finalString;
//	}


}
