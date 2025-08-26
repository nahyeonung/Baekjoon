import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main{
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int N = Integer.parseInt(br.readLine());
        
        for(int i=0; i<N; i++){
           List<Integer> list = new ArrayList<Integer>();
            List<Integer> result = new ArrayList<Integer>();
            int T = Integer.parseInt(br.readLine());
            list.add(0);
            list.add(1);
            fibonacci(list, T);
            extract(list, result, T);
            for(int rs : result){
                bw.write(rs + " ");
            } 
            bw.write("\n");
        }
        
        bw.flush();
        bw.close();
    }
    
    public static void fibonacci(List<Integer> list, Integer T){
        
        int i = 2;
        while(true){
            int data = list.get(i-2) + list.get(i-1);
            list.add(data);
            if(data == T){
                break;
            }
            else if(data > T){
                list.remove(Integer.valueOf(data));
                break;
            }
            i++;
        }
        
        sort(list);
    }
    
    public static void sort(List<Integer> list){
        Collections.sort(list, new Comparator<Integer>(){
            @Override
            public int compare(Integer o1, Integer o2){
                return o2 - o1;
            }
        });
    }
    
    public static void extract(List<Integer> list, List<Integer> result, int T){
        
        for(int i=0; i<list.size(); i++){
            if(T >= list.get(i)){
                result.add(list.get(i));
                T = T - list.get(i);
            }
            if(T == 0) break;
        }
        
        Collections.sort(result);
    }
}