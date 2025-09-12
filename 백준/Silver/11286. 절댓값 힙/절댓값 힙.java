import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collection;
import java.util.PriorityQueue;

public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> pQueue = new PriorityQueue<Integer>((o1, o2) -> {
            if(Math.abs(o1) == Math.abs(o2)){
                return o1 - o2;
            }else{
                return Math.abs(o1) - Math.abs(o2);
            }
        });

        for(int i=0; i<N; i++){
            int X = Integer.parseInt(br.readLine());
            if(X == 0){
                if(pQueue.isEmpty()) bw.write(0 + "\n");
                else{
                    int num = pQueue.poll();
                    bw.write(num + "\n");
                }
            }else{
                pQueue.add(X);
            }
        }
        bw.flush(); bw.close();
    }
}
