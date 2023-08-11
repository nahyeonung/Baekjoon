import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;


public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder result = new StringBuilder();
        for(int i=0; i<str.length(); i++){
            if(Character.isUpperCase(str.charAt(i))){
                String a = String.valueOf(str.charAt(i));
                
                result.append(a.toLowerCase());
            }
            else{
                String a = String.valueOf(str.charAt(i));
              
                
                result.append(a.toUpperCase());
            }
        }
        System.out.println(result);
        
    }
}