import java.util.Arrays;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.equals("SONGDO")){
            System.out.println("HIGHSCHOOL");
        }
        else if(str.equals("CODE")){
            System.out.println("MASTER");
        }
        else if(str.equals("2023")){
            System.out.println("0611");
        }
        else{
            System.out.println("CONTEST");
        }
    }
}