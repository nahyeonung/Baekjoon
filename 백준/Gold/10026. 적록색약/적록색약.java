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
		int[] dx = {0,0,-1,1};
		int[] dy = {1,-1,0,0};
		int size = sc.nextInt();
		int normal = 0;
		int other = 0;
		sc.nextLine();
		String[][] arr = new String[size][size];
		boolean[][] visited = new boolean[size][size];
		boolean[][] visited2 = new boolean[size][size];
		for(int i=0; i<size; i++){
			arr[i] = sc.nextLine().split("");
		}
		for(int i=0; i<size; i++){
			for(int j=0; j<size; j++){
				if((arr[i][j].equals("R") || arr[i][j].equals("G") || arr[i][j].equals("B")) & visited[i][j] == false){
					String str = arr[i][j];
					visited[i][j] = true;
					stack.push(j);
					stack.push(i);
					normal++;
					while(!stack.isEmpty()){
						int x = stack.pop();
						int y = stack.pop();
						for(int k=0; k<4; k++){
							int nx = x + dx[k];
							int ny = y + dy[k];
							if(0 <= nx & nx < size & 0 <= ny & ny < size ){
								if(arr[nx][ny].equals(str) & visited[nx][ny] == false){
									visited[nx][ny] = true;
									stack.push(ny);
									stack.push(nx);
								}
							}
						}
					}
				}
				if((arr[i][j].equals("R") || arr[i][j].equals("G") || arr[i][j].equals("B")) & visited2[i][j] == false){
					String str = arr[i][j];
					visited2[i][j] = true;
					stack.push(j);
					stack.push(i);
					other++;
					while(!stack.isEmpty()){
						int x = stack.pop();
						int y = stack.pop();
						for(int k=0; k<4; k++){
							int nx = x + dx[k];
							int ny = y + dy[k];
							if(0 <= nx & nx < size & 0 <= ny & ny < size ){
								if(str.equals("G") || str.equals("R")){
									if((arr[nx][ny].equals("G") || arr[nx][ny].equals("R")) & visited2[nx][ny] == false){
										visited2[nx][ny] = true;
										stack.push(ny);
										stack.push(nx);
									}
								}
								else{
									if(arr[nx][ny].equals(str) & visited2[nx][ny] == false){
										visited2[nx][ny] = true;
										stack.push(ny);
										stack.push(nx);
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.print(normal + " ");
		System.out.println(other);
	}
}