package divideConquer;

public class Power {

	public static void main(String[] args) {
		System.out.println(pow(3,4));

	}

	static int pow(int x,int n){
		if(n == 0){
			return 1;
		}
		else if(n == 1){
			return x;
		}
		else {
			int halfpow = pow(x,n/2);
			if( n % 2 != 0 ){
				return halfpow * halfpow * x;
			}else {
				return halfpow * halfpow;
			}
		}
	}
}
