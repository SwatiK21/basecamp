package easyProbPractice;

public class Maximum {
	
	

	public static void main(String[] args) {
		int[] a = {2,5,7,54,4,9,1,6,8,12,21,23};
		int[] b = {-3,-1};
		System.out.println("Max : " + maximum(b));
	}
	
	static int maximum(int[] a){
		if(a.length == 0){
			return -1;
		}
		int max = a[0];
		for(int i = 0; i < a.length-1; i++){
			if( a[i+1] > max){
				max = a[i+1];
			}
		}
		return max;
	}

}
