import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = Integer.parseInt(st.nextToken());
        int total = Integer.parseInt(st.nextToken());
        
        int[] arr = new int[cnt];
        for(int i=0; i<cnt; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        
        int rs = 0;
        for(int i=cnt - 1; i>=0; i--){
            if(total >= arr[i]){
                rs = rs + (total / arr[i]);
                total = total % arr[i];
            }
        }

        bw.write(rs + "\n");
        bw.flush();
        bw.close();


    }
}
