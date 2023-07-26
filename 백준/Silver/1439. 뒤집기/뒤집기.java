import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s = br.readLine().split("");
        int zero = 0;
        int one = 0;
        for(int i=0; i<s.length; i++){
            if(i == 0){
                if(s[i].equals("0")){
                    zero++;
                }else{
                    one++;
                }
            }else{
                if(s[i].equals(s[i-1])){

                }else{
                    if(s[i].equals("0")){
                        zero++;
                    }else{
                        one++;
                    }
                }
            }
        }
        System.out.println(Math.min(zero, one));
    }
}