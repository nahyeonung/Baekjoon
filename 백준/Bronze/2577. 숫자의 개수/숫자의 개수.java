import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
import java.util.ArrayList;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		int num3 = sc.nextInt();

		String str = String.valueOf(num1 * num2 * num3);
		int[] arr = new int[10];
		for(int i=0; i<10; i++){
			for(int j=0; j<str.length(); j++){
				if(i == str.charAt(j) - 48){
					arr[i]++;
				}
			}
			System.out.println(arr[i]);
		}
	}
}
