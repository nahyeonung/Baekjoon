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
        int y = 0;
        int m = 0;
        for(int i=0; i<loop; i++){
            int second = sc.nextInt();
            int a = 10 * ((second / 30) + 1);
            int b = 15 * ((second / 60) + 1);
            y = y + a;
            m = m + b;
        }
        if(y > m){
            System.out.println("M " + m);
        }
        else if(y < m){
            System.out.println("Y " + y);
        }
        else{
            System.out.println("Y M " + y);
        }
    }
}