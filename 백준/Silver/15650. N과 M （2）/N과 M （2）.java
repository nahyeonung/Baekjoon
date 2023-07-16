import java.util.Arrays;
import java.util.Scanner;

class Main {
	static int[] arr;
	static boolean[] visited;
	public static void main(String args[]) throws Exception {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int dept = 0;
		arr = new int[M];
		visited = new boolean[N];
		backTracking(N, M, dept, 0);
	}
	public static void backTracking(int N, int M, int dept, int k){
		if(dept == M){
			for(int a : arr){
				System.out.print(a + " ");
			}
			System.out.println();
			return;
		}
		for(int i=k; i<N; i++){
			if(!visited[i]){
				arr[dept] = i+1;
				visited[i] = true;
				backTracking(N, M, dept + 1, i + 1);
				visited[i] = false;
			}
		}
	}
}
