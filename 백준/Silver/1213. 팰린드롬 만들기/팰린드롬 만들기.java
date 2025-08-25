import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) throws IOException {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<String> list = new ArrayList<String>();

        String[] str = br.readLine().split("");

        for(String a : str){
            list.add(a);
        }
        Collections.sort(list);
        int cnt = 0;
        int compare = cnt;
        for(int i=0; i<=list.size() / 2; i++){
            if(cnt != compare){
                i--;
                compare = cnt;
            }
            if(!list.get(i).equals(list.get(list.size() - i - 1))){
                for(int j=i+1; j<list.size()-i; j++){
                    if(list.get(i).equals(list.get(j))){
                        String data = list.get(j);
                        list.remove(j);
                        list.add(list.size() -i, data);
                        break;
                    }
                    else if(j == list.size() -i -1){
                        if(list.size() / 2 == 0){
                            System.out.println("I'm Sorry Hansoo");
                            return;
                        }else{
                            if(cnt > list.size() / 2){ System.out.println("I'm Sorry Hansoo"); return;}
                            String data = list.get(i);
                            list.remove(i);
                            list.add(list.size() / 2, data);
                            cnt++;
                        }

                    }
                }
            }
        }
        for(String rs : list){
            bw.write(rs);
        }
        bw.write("\n");
        bw.flush();
        bw.close();
        
    }
}
