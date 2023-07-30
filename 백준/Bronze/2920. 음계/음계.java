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
        int num = sc.nextInt();
        int[] arr = {num};
        for(int i=0; i<7; i++){
            int compareNum = sc.nextInt();
            if(arr[0] + 1 == compareNum){
                arr[0] = compareNum;
                if(i == 6){
                    System.out.println("ascending");
                    System.exit(0);
                }
            }
            else if(arr[0] - 1 == compareNum){
                arr[0] = compareNum;
                if(i == 6){
                    System.out.println("descending");
                    System.exit(0);
                }
            }
            else{
                System.out.println("mixed");
                System.exit(0);
            }
        }
    }
}