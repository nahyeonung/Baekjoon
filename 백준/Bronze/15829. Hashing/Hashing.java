import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		sc.nextLine();
		int sum = 0;
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++){
			sum += (str.charAt(i) - 96) * (int)Math.pow(31, i);
		}
		System.out.println(sum);
	}
	
}
