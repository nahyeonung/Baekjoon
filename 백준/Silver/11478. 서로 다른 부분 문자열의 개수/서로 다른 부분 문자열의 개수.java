import java.io.IOException;
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
		Map<String,Integer> map = new HashMap<String,Integer>();
		String str = sc.nextLine();
		for(int i=0; i<str.length(); i++){
			for(int j=i+1; j<=str.length(); j++){
				String data = str.substring(i, j); 
				map.put(data,0);
			}
		}
		System.out.println(map.size());
	}
}
