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
		Queue<Integer> queue = new LinkedList<Integer>();
		int N = Integer.parseInt(br.readLine());
		for(int i=0; i<N; i++){
			queue.add(i+1);
		}
		while(queue.size() > 1){
			queue.poll();
			int num = queue.poll();
			queue.add(num);
		}
		System.out.println(queue.poll());
	}
}