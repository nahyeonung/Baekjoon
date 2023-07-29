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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[][] arr1 = new int[N][M];
        for(int i=0; i<N; i++){
            for(int j=0; j<M; j++){
                arr1[i][j] = sc.nextInt();
            }
        }   
        M = sc.nextInt();
        int K = sc.nextInt();
        int[][] arr2 = new int[M][K];
        for(int i=0; i<M; i++){
            for(int j=0; j<K; j++){
                arr2[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N; i++){
            for(int j=0; j<K; j++){
                int sum = 0;
                for(int l=0; l<M; l++){
                    sum = sum + arr1[i][l] * arr2[l][j];
                }
                System.out.print(sum + " ");
            }
            System.out.println();
        }

    }
}