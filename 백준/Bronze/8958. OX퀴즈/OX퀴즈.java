import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<loop; i++){
			String[] arr = sc.nextLine().split("");
			int[] arr2 = new int[arr.length];
			int cnt = 0;
			for(int j=0; j<arr.length; j++){
				if(j == 0){
					if(arr[j].equals("O")){
						arr2[j] = 1;
					}
				}else{
					if(arr[j].equals("O")){
						arr2[j] = arr2[j-1] + 1;
					}
				}
			}
			for(int j=0; j<arr.length; j++){
				cnt += arr2[j];
			}
			System.out.println(cnt);
		}
	}
}
