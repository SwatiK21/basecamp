package dec31;

public class StringReversal {
	
	
	public static String reverse(String str){
		if(str == null){
			return null;
		}
		else {
		String res = "";
		for(int i = str.length(); i > 0 ; i--){
			res = res + str.charAt(i);
		}
		return res;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "abc dggfd";
		String result = reverse(str);
		
		System.out.println("Reverse : " + result);
		
	}

}
