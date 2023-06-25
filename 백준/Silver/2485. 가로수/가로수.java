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
        int loop = sc.nextInt();
        int[] arr = new int[loop];
        int max_gcd = 0;
        for(int i=0; i<arr.length; i++){
            int num = sc.nextInt();
            arr[i] = num;
            if(i > 0){
                max_gcd = gcd(arr[i] - arr[i-1], max_gcd);
            }
        }
        int result2 = (arr[loop-1] - arr[0]) / max_gcd + 1 - (arr.length);
        System.out.println(result2);
        
    }
    
    public static int gcd(int a, int b){
        while(b > 0){
            int temp = a;
            a = b;
            b = temp % b;

        }
        return a;
    }
}