package easyProbPractice;

public class IsSorted {

	public static void main(String[] args) {
		int[] a = {2,4,6,8,9};
		assertEquals(isSorted(a), true);
		
		int[] b = {2,4,6,4,8,9};
		assertEquals(isSorted(b), false);
		
		int[] c = {2};
		assertEquals(isSorted(c), true);
		
		int[] d = {};
		assertEquals(isSorted(d), true);
		
		int[] e = {-1, -2, 1};
		assertEquals(isSorted(e), false);
		
		int[] f = {-2, -1, 1};
		assertEquals(isSorted(f), true);
	}

	public static boolean isSorted(int[] a){
		// Code works even if there's a single item or no item in an array
		int i = 1;
		while ( i < a.length){
			if(a[i-1] < a[i]){
				i++;
			}
			else {
				return false;
			}
		}
		return true;
	}
	
	public static void assertEquals(boolean actual, boolean expected){
		if(actual == expected){
			System.out.println("Test passed");
		} else {
			System.out.println("Test failed");
		}
	}
}
