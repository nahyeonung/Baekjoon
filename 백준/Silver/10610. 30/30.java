import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        String N = br.readLine();
        BigInteger[] arr = new BigInteger[N.length()];
        for(int i=0; i<N.length(); i++){
            arr[i] =    new BigInteger(N.substring(i, i+1));
        }
        Arrays.sort(arr, Comparator.reverseOrder());
        String str = "";
        for(int i=0; i<N.length(); i++){
            str = str + arr[i].toString();
        }
        BigInteger rs = new BigInteger(str);
        BigInteger num = new BigInteger("30");
        System.out.println(rs.mod(num).equals(new BigInteger("0")) ? rs : -1);
    
    }
}