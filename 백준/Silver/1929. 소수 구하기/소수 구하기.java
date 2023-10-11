import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int max = sc.nextInt();
		int[] arr = new int[max+1];
		
		for(int i=2; i<=(int)Math.sqrt(max); i++){
			if(arr[i] == 1) continue;
			for(int j=i+i; j<=max; j=j+i){
				arr[j] = 1;
			}
		}
		
		for(int i=min; i<arr.length; i++){
			if(arr[i] == 0){
				if(i > 1){
					System.out.println(i);
				}
			}
		}
	}

}
