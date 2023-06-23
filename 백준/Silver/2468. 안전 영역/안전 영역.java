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
import java.math.BigInteger;
import java.util.Stack;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		Stack<Integer> stack = new Stack<Integer>();
		int[] dx = {1,-1,0,0};
		int[] dy = {0,0,-1,1};
		int max = 0;
		int result = 0;
		int[][] arr = new int[size][size];
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				int num = sc.nextInt();
				arr[i][j] = num;
				if(max < num){
					max = num;
				}
			}
		}
		
		for(int a=0; a<=max; a++){
			boolean[][] visited = new boolean[size][size]; 
			int cnt = 0;
			for(int i=0; i<size; i++){
				for(int j=0; j<size; j++){
					if(arr[i][j] > a && visited[i][j] == false){
						visited[i][j] = true;
						stack.push(j);
						stack.push(i);
						while(!stack.isEmpty()){
							int x = stack.pop();
							int y = stack.pop();
							for(int k=0; k<4; k++){
								int nx = x + dx[k];
								int ny = y + dy[k];
								if(0 <= nx && 0 <= ny && nx < size && ny < size){
									if(arr[nx][ny] > a && visited[nx][ny] == false){
										visited[nx][ny] = true;
										stack.push(ny);
										stack.push(nx);
									}
								}
							}
						}
						cnt++;
					}
				}	
			}
			if(result < cnt){
				result = cnt;
			}

		}
		System.out.println(result);
		
	}
}