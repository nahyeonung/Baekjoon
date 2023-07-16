import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

class Main {
	static int[] arr;
	static StringBuffer sb = new StringBuffer();
	public static void main(String args[]) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		int N = 0;
		int M = 0;
		int dept = 0;
		for(int i=0; i<input.length; i++){
			N = Integer.parseInt(input[0]);
			M = Integer.parseInt(input[1]);
		}
		arr = new int[M];
		backTracking(N, M, dept);
		System.out.println(sb);
	}
	public static void backTracking(int N, int M, int dept){
		if(dept == M){
			for(int a : arr){
				sb.append(a).append(" ");
			}
			sb.append("\n");
			return;
		}
		for(int i=0; i<N; i++){
			arr[dept] = i+1;
			backTracking(N, M, dept + 1);
		}
	}
}
