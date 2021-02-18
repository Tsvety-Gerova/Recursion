
public class zadacha1 {

	public static void main(String[] args) {

		System.out.println(evenRecursive(18));
		System.out.println(oddRecursive(24));
		
	}
	
	public static boolean evenRecursive (int n) {
	
		if (n == 0) {
			return true;
		} else if (n == 1) {
			return false;
		} else {
			return evenRecursive (n - 2);
		}
	}
	
	public static boolean oddRecursive (int n) {
		
		if (n == 1) {
			return true;
		} else if (n == 0) {
			return false;
		} else {
			return oddRecursive (n - 2);
		}
	}

}
