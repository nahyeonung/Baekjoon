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
		Stack<Integer> stack = new Stack<Integer>();
		int[] dx = {0,1,1,1,0,-1,-1,-1};
		int[] dy = {1,1,0,-1,-1,-1,0,1};
		while(true){
			int w = sc.nextInt();
			int h = sc.nextInt();
			int cnt = 0;
			if(w == 0 & h == 0){
				break;
			}
			int[][] arr = new int[h][w];
			boolean[][] visited = new boolean[h][w];
			for(int i=0; i<arr.length; i++){
				for(int j=0; j<arr[0].length; j++){
					arr[i][j] = sc.nextInt();
				}
			}
			for(int i=0; i<arr.length; i++){
				for(int j=0; j<arr[0].length; j++){
					if(arr[i][j] == 1 & visited[i][j] == false){
						stack.push(j);
						stack.push(i);
						visited[i][j] = true;
						while(!stack.isEmpty()){
							int x = stack.pop();
							int y = stack.pop();
							for(int k=0; k<8; k++){
								int nx = x + dx[k];
								int ny = y + dy[k];
								if(0 <= nx && nx < arr.length && 0 <= ny && ny < arr[0].length){
									if(arr[nx][ny] == 1 && visited[nx][ny] == false){
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
			System.out.println(cnt);
			
		}
	}
}