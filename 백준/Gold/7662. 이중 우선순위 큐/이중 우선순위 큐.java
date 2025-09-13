import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class Main {
    
    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st;
        for(int i=0; i<N; i++){
            TreeMap<Integer, Integer> tMap = new TreeMap<>();
            int T = Integer.parseInt(br.readLine());
            for(int j=0; j<T; j++){
                st = new StringTokenizer(br.readLine());
                String str = st.nextToken();
                int num = Integer.parseInt(st.nextToken());
                if("I".equals(str)){
                    tMap.put(num, tMap.getOrDefault(num, 0) + 1);
                }
                else if("D".equals(str)){
                    if(tMap.isEmpty()) continue;
                    int key = num == 1 ? tMap.lastKey() : tMap.firstKey();
                    if(tMap.get(key) == 1){
                        tMap.remove(key);
                    }else{
                        tMap.put(key, tMap.get(key) - 1);
                    }
                }
            }
            bw.write(tMap.isEmpty() ? "EMPTY \n" : tMap.lastKey() + " " + tMap.firstKey() + "\n");
        }
        bw.flush(); bw.close();
    }
    
}
