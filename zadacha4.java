import java.util.Scanner;

public class zadacha4 {

	public static void main(String[] args) {

		System.out.println(nPowerRecursive(3, 4));
		
	}
	

	public static long nPowerInterative (int n, int x) {
		long result = 1;
		for (int i = 0; i < n; i ++) {
			result *= x;
		}
		return result;
	}
	
	public static long nPowerRecursive (int n, int x) {
		if (n == 0) {
			return 1;
		} else {
			return (long) (x * nPowerRecursive(n - 1, x));
		}
	}

}
