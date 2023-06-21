import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Stack<Integer> stack = new Stack<Integer>();
		int m = sc.nextInt();
		int n = sc.nextInt();
		ArrayList<Integer>[] list = new ArrayList[m+1];
		boolean[] visited = new boolean[m+1];
		int cnt = 0;
		for(int i=1; i<=m; i++){
			list[i] = new ArrayList<Integer>();
		}
		for(int i=0; i<n; i++){
			int obj = sc.nextInt();
			int link = sc.nextInt();
			list[obj].add(link);
			list[link].add(obj);
		}
		stack.push(1);
		visited[1] = true;
		while(!stack.isEmpty()){
			int num = stack.pop();
			for(int i : list[num]){
				// int a = list[num].get(i);
				if(visited[i] == false){
					stack.push(i);
					visited[i] = true;
				}
			}	
			if(stack.isEmpty()){
				break;
			}
			
		}
		for(int i=0; i<visited.length; i++){
			if(visited[i] == true){
				cnt++;
			}
		}
		System.out.println(cnt-1);
	}
}