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
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][M];
        int min = 256;
        int max = 0;
        for(int i=0; i<arr.length; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<arr[0].length; j++){
                arr[i][j] = Integer.parseInt(st.nextToken());
                if(arr[i][j] > max){
                    max = arr[i][j];
                }
                if(arr[i][j] < min){
                    min = arr[i][j];
                }
            }
        }
        int time = Integer.MAX_VALUE;
        int high = 0;
        for(int i=min; i<=max; i++){
            int count = 0;
            int block = B;
            for(int j=0; j<arr.length; j++){
                for(int k=0; k<arr[0].length; k++){
                    if(arr[j][k] > i){
                        count = count + ((arr[j][k] - i) * 2);
                        block = block + (arr[j][k] - i);
                    }
                    else if(arr[j][k] < i){
                        count = count + (i - arr[j][k]);
                        block = block - (i - arr[j][k]);
                    }
                }
            }
            if(block < 0) break;
            if(time >= count) {
				time = count;
				high = i;
			}
        }
        System.out.println(time + " " + high);
        
    }
}