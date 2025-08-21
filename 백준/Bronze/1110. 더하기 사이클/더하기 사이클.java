import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String num = br.readLine();
        int rotate = Integer.parseInt(num);
        int cnt=0;
        String[] str = new String[2];
        if(num.length() == 1){
            str[0] = "0";
            str[1] = num;
        }else{
            str = num.split("");
        }

        while(true){
            int sum = 0;
            sum = Integer.parseInt(str[0]) + Integer.parseInt(str[1]);
            str[0] = str[1];
            str[1] = String.valueOf(sum).substring(String.valueOf(sum).length()-1);
            cnt++;

            if(rotate == Integer.parseInt(str[0] + Integer.parseInt(str[1]))) break;
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
        
    }
}
