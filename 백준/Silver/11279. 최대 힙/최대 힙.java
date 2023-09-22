import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer str = new StringBuffer();
		int T = Integer.parseInt(br.readLine());
		PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());
		for(int i=0; i<T; i++){
			int num = Integer.parseInt(br.readLine());
			if(num != 0){
				priorityQueue.add(num);
			}
			else{
				if(priorityQueue.isEmpty()){
					str.append(0).append("\n");
				}else{
					str.append(priorityQueue.poll()).append("\n");
				}
			}
		}
		System.out.println(str);
	}
}
