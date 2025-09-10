import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>();

        for(int i=0; i<N; i++){
            queue.add(Integer.parseInt(br.readLine()));
        }
        int result = 0;
        while(true){
            int A = queue.poll();

            if(queue.isEmpty()) break;

            int B = queue.poll();
            
            result = result + A + B;

            queue.add(A+B);

        }

        bw.write(result + "\n");
        bw.flush();bw.close();
    }
}