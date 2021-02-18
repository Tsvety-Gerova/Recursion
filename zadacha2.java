
public class zadacha2 {

	public static void main(String[] args) {

		 System.out.println(dec2Bin(987));
		
	}

	public static String dec2Bin (int value) {
		if (value == 1) {
			return "1";
		}
		return dec2Bin (value / 2) + value % 2; // purvoto chislo stava posledno
	}
	
}
