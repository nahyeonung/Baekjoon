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
		int[] arr = new int[loop];
		for(int i=0; i<loop; i++){
			arr[i] = sc.nextInt();
		}
		int result = sc.nextInt();
		int idxTop = loop - 1;
		int idxBottom = 0;
		int cnt = 0;
		Arrays.sort(arr);
		while(idxBottom < idxTop){
			if(arr[idxBottom] + arr[idxTop] == result){
				cnt++;
				idxBottom++;
				idxTop--;
			}
			else if(arr[idxBottom] + arr[idxTop] < result){
				idxBottom++;
			}
			else if(arr[idxBottom] + arr[idxTop] > result){
				idxTop--;
			}
		}
		System.out.println(cnt);
	}
}
