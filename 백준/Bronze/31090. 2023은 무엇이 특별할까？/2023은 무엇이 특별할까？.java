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

        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.nextLine();

        for(int i=0; i<num; i++){
            String str = sc.nextLine();
            int data = Integer.parseInt(str) + 1;
            str = str.substring(str.length()-2, str.length());
            if(data % (Integer.parseInt(str)) == 0) {
                System.out.println("Good");
            }else{
                System.out.println("Bye");
            }

        }
        

        
        
    }
}
