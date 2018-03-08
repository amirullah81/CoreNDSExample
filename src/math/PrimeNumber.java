package math;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 * 
		 */
		int limit = 1000000, count=0;
		for (int i=2; i<limit; i++)
		{
			if(prime(i))
			{
				System.out.println(i);
				count++;
			}
		}
		System.out.println("Total Prime Numbers: " +count);

	}
	public static boolean prime(int n){
		for(int i=2; i<n; i++)
		{
			if (n%i == 0)
				return false;
		}
		return true;
	}


}