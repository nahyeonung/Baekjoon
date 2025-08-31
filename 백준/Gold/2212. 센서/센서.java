import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        ArrayList<Integer> list = new ArrayList<Integer>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        while(st.hasMoreTokens()){
            list.add(Integer.parseInt(st.nextToken()));
        }
        
        Collections.sort(list);

        ArrayList<ArrayList<Integer>> list2 = new ArrayList<>();
        for(int i=0; i<list.size() -1; i++){
            ArrayList<Integer> data = new ArrayList<>();
            data.add(list.get(i));
            data.add(list.get(i+1) - list.get(i));
            list2.add(data);
        }
        
        Collections.sort(list2, new Comparator<ArrayList<Integer>>() {

            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                // TODO Auto-generated method stub
                return o1.get(1) - o2.get(1);
            }
        });
        
        int rs = 0;
        for(int i=0; i<N - K; i++){
            rs =  rs + list2.get(i).get(1);
        }
        
        bw.write(rs + "\n");
        bw.flush();bw.close();

    }
}