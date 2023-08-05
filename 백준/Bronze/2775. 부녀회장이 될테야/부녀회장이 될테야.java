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
        int[][] arr = new int[15][15];
        for(int i=0; i<15; i++){
            arr[i][1] = 1;
            arr[0][i] = i;
        }

        for(int i=1; i<15; i++){
            for(int j=2; j<15; j++){
                arr[i][j] = arr[i-1][j] + arr[i][j-1];
            }
        }
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int h = sc.nextInt();
            int w = sc.nextInt();
            System.out.println(arr[h][w]);
        }
    }
}