public class Solution {
	
	public static String reverseString(String s) {
		int len = s.length();
	   	StringBuilder sb = new StringBuilder();
   		for(int i=len; i>0; i--)
   			sb.append(s.charAt(i-1));
    	return sb.toString();
    }
	
	public static void main(String[] args) {
       	System.out.println(reverseString("hello!"));
	}
}
