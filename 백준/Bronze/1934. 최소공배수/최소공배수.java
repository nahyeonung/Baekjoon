import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		for(int i=0; i<loop; i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			int num1 = Math.max(a, b);
			int num2 = Math.min(a, b);
			int result = lcm(num1, num2);
			System.out.println(result);
		}
	}
	public static int gcd(int num1, int num2){
		while (num2 > 0){
			int tmp = num2;
			num2 = num1 % num2;
			num1 = tmp;
		}
		return num1;
	}

	public static int lcm(int num1, int num2){
		return num1 * num2 / gcd(num1, num2);
	}
}
