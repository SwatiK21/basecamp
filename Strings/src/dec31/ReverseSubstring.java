package dec31;

public class ReverseSubstring {

	public static void main(String[] args) {
		String input = "abcde";
		String input1 = null;
		System.out.println("Reverse Words : " + reverse(input,-10,30));
		System.out.println("Reverse Words : " + reverse("abc",2,-2));
		System.out.println("Reverse Words : " + reverse("",0,0));
		System.out.println("Reverse Words : " + reverse(input1,-3,0));
	}
	
	static String reverse(String str, int start,int end){
		// To check if string is null
		if(str == null){
			return null;
		}
		// Converting string to char array
		char[] arr = new char[str.length()];
		for(int i = 0; i < str.length(); i++){
			arr[i] = str.charAt(i);
		}
		
		// Checking if the start index is less than 0 
		if(start < 0 && ((start + end) > arr.length)) {
			end = arr.length-1;
			start = 0;
			reverse(arr,start,end);
		}
		else {
			reverse(arr,start,end);
		}
		// Converting char to String
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++){
			sb.append(arr[i]);
		}
		return sb.toString();
	}
	
	// Reversing the char array
	static char[] reverse(char[] arr,int start,int end){
		for(int i=start; i < (start + end)/2; i++){
			char temp = arr[i];
			arr[i] = arr[(start + end) - i];
			arr[(start + end) - i] = temp;
		}
		return arr;
	}
}
