import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int cost = 1000 - Integer.parseInt(br.readLine());
        
        int[] change = {500, 100, 50, 10, 5, 1};

        int rs = 0;

        for(int i=0; i<change.length; i++){
            if(cost >= change[i]){
                int a = cost / change[i];
                cost = cost - change[i] * a;
                rs = rs + (1 * a);
            }
        }
        bw.write(rs + "\n");
        bw.flush();
        bw.close();
    }
}