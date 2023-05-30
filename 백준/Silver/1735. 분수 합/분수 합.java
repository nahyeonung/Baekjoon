import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		long mole1 = sc.nextInt();
		long deno1 = sc.nextInt();
		long mole2 = sc.nextInt();
		long deno2 = sc.nextInt();
		long resDeno = deno1 * deno2;
		long resMole = (mole1 * deno2) + (mole2 * deno1);
		long num1 = Math.max(resDeno, resMole);
		long num2 = Math.min(resDeno, resMole);
		long divide = gcd(num1, num2);
		System.out.println( (resMole / divide) + " " + (resDeno / divide));

	}
	public static long gcd(long num1, long num2){
		while(num2 > 0){
			long tmp = num2;
			num2 = num1 % num2;
			num1 = tmp;
		}
		return num1;
	}
}
