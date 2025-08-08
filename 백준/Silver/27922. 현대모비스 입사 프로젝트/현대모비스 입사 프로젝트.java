import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        int[][] arr = new int[3][N];
        
        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine());
            
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            
            arr[0][i] = a + b;
            arr[1][i] = a + c;
            arr[2][i] = b + c;
            
        }
        
        Arrays.sort(arr[0]);
        Arrays.sort(arr[1]);
        Arrays.sort(arr[2]);
        
        int sumA = 0;
        int sumB = 0;
        int sumC = 0;
        for(int i=1; i<=K; i++){
            sumA = sumA + arr[0][N-i];
            sumB = sumB + arr[1][N-i];
            sumC = sumC + arr[2][N-i];
        }
        System.out.println(Math.max(sumA, Math.max(sumB, sumC)));
    }
}