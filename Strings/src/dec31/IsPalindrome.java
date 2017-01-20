package dec31;

public class IsPalindrome {

	public static void main(String[] args) {
		String str1 = "radar";
		String str2 = " ";
		String str3 = "Hello";
		System.out.println("Is " + str1 + " a palindrome : " + isPalindrome(str1));
		System.out.println("Is " + str2 + " a palindrome : " + isPalindrome(str2));
		System.out.println("Is " + str3 + " a palindrome : " + isPalindrome(str3));
	}
	
	// the method is case sensitive,so uppercase and lowercase are treated differently
	static boolean isPalindrome(String str){
		if( str == null){
			return true;
		}
		else {
			int i = 0;
			while( i < str.length()/2){
				// comparing the ith and the (last index - i)th character
				if( str.charAt(i) == str.charAt(str.length() -1 - i)){
					i++;
				}
				else {
					return false;
				}	
			}
			return true;
		}
	}

}
