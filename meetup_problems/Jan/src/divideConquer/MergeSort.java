package divideConquer;

import java.util.Arrays;

public class MergeSort {
	
	public static void main(String[] args) {
		/*
		int[] a= {1,5,10,15,21,31};
		int[] b = {16,35,40,45,50};
		int[] c = new int[a.length + b.length];
		combine(a,b,c,0);
		*/
		
		int[] input = {2,21,36,48,19,17,11,47,89,21,76};
		mergeSort(input);
		System.out.println(Arrays.toString(input));
	}
	
	static void mergeSort(int[] myArray){
		mergeSort(myArray, 0, myArray.length-1);
	}
	
	static void mergeSort(int[] myArray, int start,int end){
		if(start == end){
			return;
		}
		int mid = (start + end)/2;
		mergeSort(myArray,start,mid);
		mergeSort(myArray,mid+1,end);
		
		int[] copyA = copy(myArray,start,mid);
		int[] copyB = copy(myArray,mid+1,end);
		
		combine(copyA,copyB,myArray,start);
	}
	
	static int[] copy(int[] a, int start, int end){
		int[] copy = new int[end - start + 1];
		int j = 0;
		for(int i=start;i<=end;i++){
			copy[j] = a[i];
			j++;
		}
		return copy;
	}
	
	static void combine(int[] a,int[] b,int[] c,int start){
		int k = start;
		int i = 0,j = 0;
		while(i < a.length && j < b.length){
			if( a[i] <= b[j]){
				c[k] = a[i];
				i++; 
				k++;
			}
			else {
				c[k] = b[j];
				j++;
				k++;
			}
		}
		if( i == a.length){
			while( j < b.length ){
				c[k] = b[j];
				j++;
				k++;
			}
		}else if( j == b.length){
			while (i < a.length){
				c[k] = a[i];
				i++;
				k++;
			}
		}
	}
}
