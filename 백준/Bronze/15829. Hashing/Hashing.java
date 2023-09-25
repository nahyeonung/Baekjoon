import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
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
		BigInteger sum = new BigInteger("0");
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++){
			sum = sum.add((BigInteger.valueOf(str.charAt(i) - 96)).multiply((BigInteger.valueOf(31).pow(i))));

		}
		System.out.println(sum.remainder(BigInteger.valueOf(1234567891)));
		
	}
	
}
