import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[M];
        boolean[] visited = new boolean[N];
        int dept = 0;
        backTracking(N, M, arr, dept, visited);
    }
    static void backTracking(int N, int M, int[] arr, int dept, boolean[] visited){
        if(M == dept){
            for(int a : arr){
                System.out.print(a + " ");
            }
            System.out.println();
            return;
        }
        for(int i=0; i<N; i++){
            if (!visited[i]) {
				visited[i] = true;
				arr[dept] = i + 1;
				backTracking(N, M, arr, dept+1, visited);
				visited[i] = false;
			}
        }

    }
    
    
}