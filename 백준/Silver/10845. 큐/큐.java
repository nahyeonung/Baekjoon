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
        StringBuffer sb = new StringBuffer();
        Deque<Integer> queue = new ArrayDeque<Integer>();
        int N = sc.nextInt();
        sc.nextLine();
        for(int i=0; i<N; i++){
            String[] arr = sc.nextLine().split(" ");
            if(arr[0].equals("push")){
                queue.add(Integer.parseInt(arr[1]));
            }
            else if(arr[0].equals("pop")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(queue.poll()).append("\n");
                }
            }
            else if(arr[0].equals("size")){
                sb.append(queue.size()).append("\n");
            }
            else if(arr[0].equals("empty")){
                if(queue.isEmpty()){
                    sb.append(1).append("\n");
                }else{
                    sb.append(0).append("\n");
                }
            }
            else if(arr[0].equals("front")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(queue.peekFirst()).append("\n");
                }
            }
            else if(arr[0].equals("back")){
                if(queue.isEmpty()){
                    sb.append(-1).append("\n");
                }else{
                    sb.append(queue.peekLast()).append("\n");
                }
            }
        }
        System.out.println(sb);
    }
}