package divideConquer;

public class SumProblem {
	
	public static void main(String[] args) {
		int[] myArray = {3,5,7,1,4,12,14,11,12,7,9,5};
		System.out.println("Result sum : " + sum(myArray,0,myArray.length-1));
	}
	
	static int sum(int[] myArray, int start, int end){
		if(start == end){
			return myArray[start];
		}
		int mid = (start + end)/2;
		int sumA = sum(myArray,start,mid);
		int sumB = sum(myArray,mid+1,end);
		return sumA + sumB;
	}
}
