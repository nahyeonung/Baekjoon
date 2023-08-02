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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            if(a == 0 & b == 0 & c == 0){
                break;
            }
            int max = Math.max(a , b);
            int min1 = Math.min(a, b);
            int min2 = Math.min(max, c);
            max = Math.max(max, c);
            if(Math.pow(max, 2) == (Math.pow(min1, 2) + (Math.pow(min2, 2)))){
                System.out.println("right");
            }else{
                System.out.println("wrong");
            }
            
        }
    }
}