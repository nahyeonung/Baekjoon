import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        
        boolean isVisited[][] = new boolean[M][N];
        
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int rs = 0;
        int sum = 1;
        int idx = 0;
        int nowX = 0;
        int nowY = 0;
        while(idx < 4){
            if(sum == M * N){
                System.out.println(rs);
                return;
            }
            isVisited[nowX][nowY] = true;
            int x = nowX + dx[idx];
            int y = nowY + dy[idx];
            if(x >= 0 && y >= 0 && x < M && y < N && isVisited[x][y] == false ){
                sum++;
                nowX = x;
                nowY = y;
            }
            else{
                idx++;
                rs++;
            }
            if(idx >= 4){
                idx = 0;
            }
        }

    }

}
