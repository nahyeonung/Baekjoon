import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BigInteger num = sc.nextBigInteger();
        BigInteger result = factorial(num);
        String[] arr = String.valueOf(result).split("");
        int cnt = 0;
        for(int i=arr.length-1; i>=0; i--){
            if(arr[i].equals("0")){
                cnt++;
            }
            if(!(arr[i].equals("0"))){
                break;
            }
        }
        if(arr.length == 1){
           System.out.println(0); 
        }else{
             System.out.println(cnt);
        }
       

    }
    static BigInteger factorial(BigInteger num){
        if(num.equals(new BigInteger("1"))){
            return num;
        }
        else if(num.equals(new BigInteger("0"))){
            return num;
        }
        return num.multiply(factorial(num.subtract(new BigInteger("1"))));
    }
}