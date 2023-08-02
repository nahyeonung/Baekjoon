import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        int a = sc.nextInt();
        int b = sc.nextInt();
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        System.out.println(lcd(max, min));
        
    }
    static int gcd(int a, int b){
        while(b > 0){
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        System.out.println(a);
        return a;
    }

    static int lcd(int a, int b){
        return a * b / gcd(a, b);
    }
}