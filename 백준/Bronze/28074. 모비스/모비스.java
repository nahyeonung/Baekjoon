import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String str = br.readLine();
        for(int i=0; i<str.length(); i++){
            if(!str.contains("M")){
                System.out.println("NO");
                break;
            }
            if(!str.contains("O")){
                System.out.println("NO");
                break;
            }
            if(!str.contains("B")){
                System.out.println("NO");
                break;
            }
            if(!str.contains("I")){
                System.out.println("NO");
                break;
            }
            if(!str.contains("S")){
                System.out.println("NO");
                break;
            }
            if(i == str.length()-1){
                System.out.println("YES");
            }
        }
    }

}
