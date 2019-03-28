package experiment;

//找质数程序
public class Prime {

	public static int[] getPrimeNumber(int n) {
		int[] retArr = new int[n];
		boolean isPrime;
		for(int i=2;i<n;i++) {
			isPrime = true;
			for(int j=2;j<i;j++) {
				if(i%j==0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				retArr[i] = i;
			}
		}
		return retArr;
	}
	
	
	
	public static void main(String[] args) {
		
		int[] retArr = getPrimeNumber(100);
		for(int i=0;i<retArr.length;i++) {
			if(retArr[i] != 0) {
				System.out.print(retArr[i]+" ");
			}
		}
		
		
	}
}
