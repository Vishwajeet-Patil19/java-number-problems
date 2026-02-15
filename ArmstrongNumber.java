package java_number_problems;

public class ArmstrongNumber {
	
	static boolean isArmstrong(int num) {

	    String str = Integer.toString(num);
	    int digits = str.length();
	    int sum = 0;

	    for(char c : str.toCharArray()) {
	        int digit = c - '0';
	        sum += Math.pow(digit, digits);
	    }

	    return sum == num;
	}

	public static void main(String[] args) {

		System.out.println(isArmstrong(121));
	}

}
