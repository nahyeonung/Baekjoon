import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        long S = Long.parseLong(br.readLine());
        
        long N = 1;
        long cal = S;
        while(cal >= N){
            cal = cal - N;
            N += 1;
        }
        
        System.out.println(N - 1);
    }
}