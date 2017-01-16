package divideConquer;

public class AverageSum {
	public static void main(String[] args) {
		int[] myArray = {3,5,4,2,1,3,7,21};
		System.out.println("Result average : " + average(myArray,0,myArray.length-1));
	}
	
	static int average(int[] myArray,int start,int end){
		
		if(start == end){
			return myArray[start];
		}
		else {
			int mid = (start + end)/2;
			int avgA = average(myArray,start,mid);
			int avgB = average(myArray,mid+1,end);
			return (avgA + avgB)/2;
		}
	}
}
