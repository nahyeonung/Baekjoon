import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		int num1 = sc.nextInt();
		int num2 = sc.nextInt();
		for(int i=0; i<num1; i++){
			map.put(sc.nextInt(), 1);
		}
		for(int i=0; i<num2; i++){
			int num = sc.nextInt();
			if(map.containsKey(num)){
				map.put(num, map.get(num)+1);
			}else{
				map.put(num, 1);
			}
		}
		int sum = 0;
		for(Map.Entry<Integer, Integer> entry : map.entrySet()){
			if(entry.getValue() == 1){
				sum++;
			}
		}
		System.out.println(sum);
	}
}
