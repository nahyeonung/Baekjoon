import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
        
        StringTokenizer st;
        
        for(int i=0; i<N; i++){
            ArrayList<Integer> subList = new ArrayList<Integer>();
            st = new StringTokenizer(br.readLine());
            subList.add(Integer.parseInt(st.nextToken()));
            subList.add(Integer.parseInt(st.nextToken()));
            list.add(subList);
        }
        
        sort(list);
        int cnt = 0;
        int start = list.get(0).get(0);
        int end = list.get(0).get(1);
        cnt++;
        for(int i=1; i<N; i++){
            if(end <= list.get(i).get(0)){
                start = list.get(i).get(0);
                end = list.get(i).get(1);
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.flush();
        bw.close();
    }
    
    public static void sort(ArrayList<ArrayList<Integer>> list){
        Collections.sort(list, new Comparator<ArrayList<Integer>>(){
            @Override
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2){
                if(!(o1.get(1) == o2.get(1))){
                    return o1.get(1) - o2.get(1); //종료시간 기준 오름차순
                }else{
                    return o1.get(0) - o2.get(0); //시작시간 기준 오름차순
                }
            }
        });
    }
}