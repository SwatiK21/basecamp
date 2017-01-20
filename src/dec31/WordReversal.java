package dec31;

public class WordReversal {

	public static void main(String[] args){
		String words = "the quick brown fox jumped over the lazy dog";
		System.out.println(words);
		char[] wordsArr = stringtocharArray(words);
		reverse(wordsArr,0,wordsArr.length - 1);
		//reverse(wordsArr,3,7);
		int from = 0;
		int to = 0;
		for(int i = from; i < wordsArr.length;i++){
			if( wordsArr[i] == ' '){
				//System.out.println("space found");
				to = i - 1;
				reverse(wordsArr,from,to);
				from = i + 1;
			}
		}
		reverse(wordsArr,from,wordsArr.length - 1);
		
		//System.out.println(Arrays.toString(wordsArr));
		String reverseWords = charArrayToString(wordsArr);
		System.out.println("Reverse words: " + reverseWords);
		
	}
	
	public static char[] reverse(char[] arr, int from, int to){
		for(int i = from; i <= (to + from) / 2 ; i++){
			char temp = arr[i];
			arr[i] = arr[to - (i - from)];
			arr[to - (i - from)] = temp;	
		}
		return arr;
	}
	
	public static char[] stringtocharArray(String s){
		char[] arr = new char[s.length()];
		for(int i = 0; i < s.length(); i++){
			arr[i] = s.charAt(i);
		}
		return arr;
	}
	
	public static String charArrayToString(char[] arr){
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < arr.length; i++){
			sb.append(arr[i]);
		}
		return sb.toString();
	}
	
	public static String join(String a, String b, String c){
		return a+b+c;
	}
	
	public static String join1(String a, String b, String c){
		StringBuilder sb = new StringBuilder();
		sb.append(a);
		sb.append(b);
		sb.append(c);
		return sb.toString();
	}
}
