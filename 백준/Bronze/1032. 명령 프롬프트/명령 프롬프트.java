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
        
        int T = sc.nextInt();
        sc.nextLine();
        String[] arr = new String[T];
        StringBuffer sb = new StringBuffer();
        for(int i=0; i<T; i++){
            arr[i] = sc.nextLine();
        }
        for(int i=0; i<arr[0].length(); i++){
            int tester = 0;
            for(int j=1; j<T; j++){
                if(arr[0].charAt(i) != arr[j].charAt(i)){
                    tester++;
                    break;
                }
            }
            if(tester == 0){
                sb.append(arr[0].charAt(i));
            }else{
                sb.append('?');
            }
        }
        System.out.println(sb);
        sc.close();
    }
}