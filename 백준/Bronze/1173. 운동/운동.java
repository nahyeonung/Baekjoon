import java.util.Arrays;
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
        int minutes = sc.nextInt();
        int min = sc.nextInt();
        int max = sc.nextInt();
        int work = sc.nextInt();
        int rest = sc.nextInt();
        int sum = min;
        int cnt = 0;
        int result = 0;
        while(minutes > cnt){
            if(max < work){
                System.out.println(-1);
                System.exit(0);
            }
            else if(min+work > max){
                System.out.println(-1);
                System.exit(0);   
            }
            else if(max >= sum + work){
                sum += work;
                cnt++;
            }
            else if(max < sum + work){
                sum -= rest;
            }
            if(min > sum){
                sum = min;
            }
            result++;
        }
        System.out.println(result);
    }
}