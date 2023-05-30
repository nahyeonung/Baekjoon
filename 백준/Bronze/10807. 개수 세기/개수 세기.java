import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int loop = Integer.parseInt(bf.readLine());
        String arr[] = bf.readLine().split(" ");
        String str = bf.readLine();
        int cnt = 0;
        for(int i=0; i<loop; i++){
            if(str.equals(arr[i])){
                cnt++;
            }
        }
        System.out.println(cnt);
    }
}
