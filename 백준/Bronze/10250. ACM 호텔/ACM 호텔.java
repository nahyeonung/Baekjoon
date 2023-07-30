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
        StringBuffer sb = new StringBuffer();
        int T = sc.nextInt();
        for(int i=0; i<T; i++){
            int H = sc.nextInt();
            int W = sc.nextInt();
            int N = sc.nextInt();
            int first;
            int end;
            if(N % H == 0){
                first = H;
                end = (N / H);
            }else{
                first = N % H;
                end = (N / H) + 1;
            }
            if(end < 10){
                sb.append(first + "0" + end).append("\n");
            }else{
                sb.append(first + "" + end).append("\n");
            }
        }
        System.out.println(sb);
    }
}