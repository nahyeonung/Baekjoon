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
		String str = sc.nextLine();
		int[] result = new int[26];
		for(int i=0; i<str.length(); i++){
			result[str.charAt(i) - 97]++;
		}
		for(int i=0; i<result.length; i++){
			if(i == result.length - 1){
				System.out.print(result[i]);
			}else{
				System.out.print(result[i] + " ");
			}
		}

	}
}
