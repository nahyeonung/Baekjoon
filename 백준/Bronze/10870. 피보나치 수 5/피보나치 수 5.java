import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(Math.abs(fibonacci(N)));
	}
	static int fibonacci(int num){
		if(num > 0){
			return fibonacci(num-1) + fibonacci(num-2);
		}else{
			return num;
		}
	}
}