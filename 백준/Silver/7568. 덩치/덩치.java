import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
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
        int T = sc.nextInt();
        int[] result = new int[T];
        int[][] arr = new int[T][2];
        for(int i=0; i<T; i++){
            arr[i][0] = sc.nextInt();
            arr[i][1] = sc.nextInt();
        }
        for(int i=0; i<arr.length; i++){
            int cnt = 0;
            for(int j=0; j<arr.length; j++){
                if(i != j){
                    if((arr[i][0] < arr[j][0]) & (arr[i][1] < arr[j][1])){
                        cnt++;
                    }
                }
            }
            result[i] = cnt + 1;
        }       
        for(int a : result){
            System.out.print(a + " ");
        }
    }
}