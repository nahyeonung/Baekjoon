import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int num = Integer.parseInt(br.readLine());
        int cnt = 1;

        for(int i=0; i<num; i++){
            int num2 = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());

            int s_max = Integer.parseInt(st.nextToken());
            int w_max = Integer.parseInt(st.nextToken());
        
            bw.write("Material Management " + (i+1) + "\n");
            for(int j=0; j<num2; j++){
                st = new StringTokenizer(br.readLine());
                int size = Integer.parseInt(st.nextToken());
                int weight = Integer.parseInt(st.nextToken());

            }
            bw.write("Classification ---- End!" + "\n");
        }
        bw.close();
    }
}
