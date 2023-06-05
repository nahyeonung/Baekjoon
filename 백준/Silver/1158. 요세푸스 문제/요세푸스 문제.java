import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int target = sc.nextInt() - 1;
        int cnt = target;
        ArrayList<Integer> list = new ArrayList<Integer>();
        ArrayList<Integer> result = new ArrayList<Integer>();
        
        for(int i=0; i<size; i++){
            list.add(i+1);
        }
        while(true){
            result.add(list.get(cnt));
            list.remove(cnt);
            // System.out.println("result : " + result + "list : " + list + "cnt : " + cnt);
            if(list.size() == 0){
                break;
            }else{
                cnt = (cnt + target) % list.size();
            }
        }
        System.out.print("<");
        for(int i=0; i<result.size(); i++){
            if(i == result.size()-1){
                System.out.print(result.get(i));
            }else{
                System.out.print(result.get(i) + ", ");
            }
        }
        System.out.print(">");

    }
}