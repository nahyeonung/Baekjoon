import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        long[] distance = new long[N-1];
        int cnt = 0;
        while(st.hasMoreTokens()){
            distance[cnt] = Integer.parseInt(st.nextToken());
            cnt++;
        }

        cnt=0;
        long[] region = new long[N];
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            region[cnt] = Integer.parseInt(st.nextToken());
            cnt++;
        }
        cnt=0;
        long sum = 0;
        long cal = 0;
        for(int i=0; i<N-1; i++){
            if(i == 0){
                cal = region[i] * distance[i];
                sum = sum + cal;
            }
            else{
                long min = Integer.MAX_VALUE;
                for(int j=0; j<=i; j++){
                    min = Math.min(min, region[j]);
                }
                cal = min * distance[i];
                sum = sum + cal;
            }
        }
        System.out.println(sum);
        
    }
}
