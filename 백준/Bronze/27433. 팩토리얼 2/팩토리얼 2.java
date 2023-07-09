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
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        long num = sc.nextLong();
        if(num == 0){
            System.out.println(1);
        }else{
            System.out.println(factorial(num));
        }
    }
    
    static long factorial(long num){
        if(num <= 1){
            return num;
        }else{
            return num * factorial(num - 1);
        }
    }
}