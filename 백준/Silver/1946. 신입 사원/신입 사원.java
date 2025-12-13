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
        
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st; 
        
        for(int i=0; i<T; i++){
            int cnt = 1;
            int N = Integer.parseInt(br.readLine());
            ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
            for(int j=0; j<N; j++){
                ArrayList<Integer> list1 = new ArrayList<>();
                st = new StringTokenizer(br.readLine());
                list1.add(Integer.parseInt(st.nextToken()));
                list1.add(Integer.parseInt(st.nextToken()));
                list2.add(list1);
            }
            Collections.sort(list2, (a, b) -> a.get(0) - b.get(0));
            int min = list2.get(0).get(1);
            for(int j=1; j<N; j++){
                if(list2.get(j).get(1) < min){
                    cnt++;
                    min = list2.get(j).get(1);
                }
            }
            bw.write(cnt + "\n");
        }
        bw.flush();
        bw.close();

    
    }
}