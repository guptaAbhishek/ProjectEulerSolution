package projecteuler;

/**
 * Each new term in the Fibonacci sequence is 
 * generated by adding the previous two terms. 
 * By starting with 1 and 2, the first 10 terms will be:
 * 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
 * By considering the terms in the Fibonacci sequence 
 * whose values do not exceed four million, find the sum of the even-valued terms.
*/

public class Problem2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=1;
		int sum =0;
		while(fibonacci(i)<4000000){
			if(fibonacci(i)%2==0){
				sum +=fibonacci(i);
			}
			i++;
		}
		System.out.println(sum);
		
	}
	
	public static int digitSum(int number){
		int sum = 0;
		int a=0;
		int i = number;
		while(i!=0){
			a = i%10;
			i = i/10;
			sum+=a;
		}
		return sum;
	}
	
	public static int fibonacci(int n){
		if(n==1 || n==2)
			return 1;
		else
			return fibonacci(n-1)+fibonacci(n-2); 
				
	}
}