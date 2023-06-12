import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int up = num1;
        int down = num2;
        for(int i=1; i<num2; i++){
            up *= num1 - i;
        }
        for(int i=1; i<num2; i++){
            down *= num2 - i;
        }
        if(down == 0){
          System.out.println(1);
        }else{
          System.out.println(up / down);  
        }
        
    }
}