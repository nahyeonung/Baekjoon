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
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner sc = new Scanner(System.in);
		Deque<Integer> deque = new ArrayDeque<Integer>();
		StringBuffer sb = new StringBuffer();
		String[] arr = new String[2];
		// int N = sc.nextInt();
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			arr = br.readLine().split(" ");
			if(arr[0].equals("push")){
				deque.add(Integer.parseInt(arr[1]));
			}
			else if(arr[0].equals("front")){
				if(deque.isEmpty()){
					sb.append(-1).append("\n");
				}else{
					sb.append(deque.peekFirst()).append("\n");
				}
			}
			else if(arr[0].equals("back")){
				if(deque.isEmpty()){
					sb.append(-1).append("\n");
				}
				else{
					sb.append(deque.peekLast()).append("\n");
				}
			}
			else if(arr[0].equals("empty")){
				if(deque.isEmpty()){
					sb.append(1).append("\n");
				}else{
					sb.append(0).append("\n");
				}
			}
			else if(arr[0].equals("size")){
				sb.append(deque.size()).append("\n");
			}
			else if(arr[0].equals("pop")){
				if(deque.isEmpty()){
					sb.append(-1).append("\n");
				}else{
					sb.append(deque.pop()).append("\n");
				}
			}
		}
		System.out.println(sb);
	}
}