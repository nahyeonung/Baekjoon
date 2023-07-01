import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.ArrayDeque;
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
        int num1 = (int)Math.pow(sc.nextInt(),2);
        int num2 = (int)Math.pow(sc.nextInt(),2);
        int num3 = (int)Math.pow(sc.nextInt(),2);
        int num4 = (int)Math.pow(sc.nextInt(),2);
        int num5 = (int)Math.pow(sc.nextInt(),2);
        System.out.println((num1 + num2 + num3 + num4 + num5) % 10);
    }
}