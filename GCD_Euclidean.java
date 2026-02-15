package java_number_problems;

public class GCD_Euclidean {

	static int gcd(int a, int b) {
		while (b != 0) {
			int temp = b;
			b = a % b;
			a = temp;
		}
		return a;
	}
	
	public static void main(String[] args) {
		System.out.println(gcd(48, 18));
	}
}
