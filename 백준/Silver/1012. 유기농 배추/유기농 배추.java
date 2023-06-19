import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for(int i=0; i<loop; i++){
            int w = sc.nextInt();
            int h = sc.nextInt();
            int loop2 = sc.nextInt();
            int[][] arr = new int[h][w];
            boolean[][] visited = new boolean[h][w];
            int[] dx = {-1,1,0,0};
            int[] dy = {0,0,-1,1};
            int cnt = 0;
            Stack<Integer> stack = new Stack<>();
            for(int j = 0; j<loop2; j++){
                w = sc.nextInt();
                h = sc.nextInt();
                arr[h][w] = 1;
            }
            for(int j=0; j<arr.length; j++){
                for(int k=0; k<arr[0].length; k++){
                    if(arr[j][k] == 1 & !visited[j][k]){
                        visited[j][k] = true;
                        stack.push(k);   
                        stack.push(j);
                        cnt++;
                        while(!stack.isEmpty()){
                            int x = stack.pop();
                            int y = stack.pop();
                            for(int l=0; l<4; l++){
                                int nx = x + dx[l];
                                int ny = y + dy[l];
                                if((0 <= nx & nx < arr.length) & (0 <= ny & ny < arr[0].length)){
                                    if((!visited[nx][ny]) & (arr[nx][ny] == 1)){
                                        visited[nx][ny] = true;
                                        stack.push(ny);
                                        stack.push(nx);
                                    }
                                }
                            }
                        }   

                    }
                }
            }
            System.out.println(cnt);
        }

        
        
    }
}