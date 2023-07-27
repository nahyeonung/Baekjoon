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
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int max1 = 0;
        int max2 = 0;
        for(int i=0; i<4; i++){
            int num = sc.nextInt();
            max1 += num;
        }
        for(int i=0; i<4; i++){
            int num = sc.nextInt();
            max2 += num;
        }
        System.out.println(Math.max(max1, max2));
    }
}