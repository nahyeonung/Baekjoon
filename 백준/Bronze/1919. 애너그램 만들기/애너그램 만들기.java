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
		String[] arr = sc.nextLine().split("");
		String[] arr2 = sc.nextLine().split("");
		int cnt = 0;
		for(int i=0; i<arr.length; i++){
			for(int j=0; j<arr2.length; j++){
				if(arr[i].equals(arr2[j])){
					arr[i] = "";
					arr2[j] = "";
					cnt++;
					break;
				}
			}
		}
		System.out.println((arr.length + arr2.length) - (cnt * 2));
	}
}
