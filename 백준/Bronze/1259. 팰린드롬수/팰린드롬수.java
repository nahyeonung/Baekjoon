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
        while(true){
            String N = sc.nextLine();
            if(N.equals("0")) break;

            String[] arr = N.split("");
            int first = 0;
            int end = arr.length -1;
            while(true){
                if(arr[first].equals(arr[end])){
                    first++;
                    end--;
                }else{
                    System.out.println("no");
                    break;
                }
                if(first > end){
                    System.out.println("yes");
                    break;
                }
            }
        }
    }
}