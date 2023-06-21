import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		BigInteger a = sc.nextBigInteger();
		BigInteger b = sc.nextBigInteger();
		System.out.println(a.add(b));
		System.out.println(a.subtract(b));
		System.out.println(a.multiply(b));
	}
}