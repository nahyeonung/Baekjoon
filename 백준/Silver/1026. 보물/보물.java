import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        Integer[] B = new Integer[N];

        StringTokenizer st = new StringTokenizer(br.readLine());
        int i=0;
        while(st.hasMoreTokens()){
            A[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        i=0;
        st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            B[i] = Integer.parseInt(st.nextToken());
            i++;
        }
        Arrays.sort(A);
        Arrays.sort(B, Collections.reverseOrder());
        int sum = 0;
        for(int j=0; j<N; j++){
            sum = sum + (A[j] * B[j]);
        }
        bw.write(sum + "\n");
        bw.flush();
        bw.close();



    }
}