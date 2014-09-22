package projecteuler;

/**
 * 
 * A palindromic number reads the same both ways. 
 * The largest palindrome made from the product 
 * of two 2-digit numbers is 9009 = 91 × 99.
 * Find the largest palindrome made from the
 * product of two 3-digit numbers.
 *  
 *  @author ironman 
 * */

public class Problem4 {

	/**
	 * @param args
	 */
	
	public static void main(String[] args) {
		long current = System.currentTimeMillis();
		System.out.println(product());
		System.out.println("Execution Time:"+(System.currentTimeMillis()-current)+" milliseconds");
	}
	
	public static int product(){
		int product = 1;
		int max = 1;
		for(int i=100;i<=999;i++){
			for(int j=100;j<=999;j++){
				product = i*j;
				if(isPalindrome(Integer.toString(product))){
					if(product>max){
						max = product;
					}else{
						continue;
					}
				}
			}
		}
		return max;
	}
	
	public static boolean isPalindrome(String number){
		int length = number.length();
		String reverse = "";
		for(int a = length-1;a>=0;a--){
			reverse +=number.charAt(a);
		}
		if(reverse.equals(number)){
			return true;
		}
	  return false;
	}

}
