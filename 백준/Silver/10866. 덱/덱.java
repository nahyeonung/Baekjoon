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
		Deque<Integer> deque = new ArrayDeque<Integer>();
		StringBuffer sb = new StringBuffer();
		int loop = Integer.parseInt(br.readLine());
		String[] arr = new String[2];
		for(int i=0; i<loop; i++){
			arr = br.readLine().split(" ");
			if(arr[0].equals("push_front")){
				deque.addFirst(Integer.parseInt(arr[1]));
			}
			else if(arr[0].equals("push_back")){
				deque.addLast(Integer.parseInt(arr[1]));
			}
			else if(arr[0].equals("front")){
				if(deque.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(deque.peekFirst());
				}
			}
			else if(arr[0].equals("back")){
				if(deque.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(deque.peekLast());
				}
			}
			else if(arr[0].equals("size")){
				System.out.println(deque.size());
			}
			else if(arr[0].equals("empty")){
				if(deque.isEmpty()){
					System.out.println(1);
				}else{
					System.out.println(0);
				}
			}
			else if(arr[0].equals("pop_front")){
				if(deque.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(deque.pollFirst());
				}
			}
			else if(arr[0].equals("pop_back")){
				if(deque.isEmpty()){
					System.out.println(-1);
				}else{
					System.out.println(deque.pollLast());
				}
			}
		}	
	}
}