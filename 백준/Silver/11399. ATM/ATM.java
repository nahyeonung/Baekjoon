import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = Integer.parseInt(br.readLine());
        int[][] list = new int[cnt][2];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0; i<cnt; i++){
            list[i][0] = i+1;
            list[i][1] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(list, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2){
                return o1[1] - o2[1];
            }
        });
        int sum = 0;
        int rs = 0;
        for(int[] i : list){
            sum = sum + i[1];
            rs = rs + sum;
        }
        bw.write(rs + "\n");
        bw.flush();
        bw.close();
    }
}
