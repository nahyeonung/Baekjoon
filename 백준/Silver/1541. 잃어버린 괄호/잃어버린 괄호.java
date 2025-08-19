import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    
        String str = br.readLine();

        String[] num = str.split("\\+|-");
        String[] carculator = str.split("\\d+");

        int sum=0;
        int erase=0;
        boolean flag = false;
        for(int i=0; i<num.length; i++){
            if(i == 0){
                sum = sum + Integer.parseInt(num[i]);
            }
            else if(carculator[i].equals("-")){
                erase = erase + Integer.parseInt(num[i]);
                flag = true;
            }
            else if(carculator[i].equals("+")){
                if(flag == true){
                    erase = erase + Integer.parseInt(num[i]);
                }else{
                    sum = sum + Integer.parseInt(num[i]);
                }
            }
        }
        bw.write((sum - erase) + "\n");
        bw.flush();
        bw.close();

    }
}