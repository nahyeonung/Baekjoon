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
		int loop = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<loop; i++){
			String[] arr = sc.next().split("");
			String[] arr2 = sc.next().split("");
			Arrays.sort(arr);
			Arrays.sort(arr2);
			int cnt = 0;
			for(int j=0; j<arr.length; j++){
				if(!arr[j].equals(arr2[j])){
					System.out.println("Impossible");
					cnt++;
					break;
				}
			}
			if(cnt==0){
				System.out.println("Possible");
			}
		}

	}
}
