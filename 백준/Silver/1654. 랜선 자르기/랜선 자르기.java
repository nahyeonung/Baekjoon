import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int num = sc.nextInt();
		int[] arr = new int[T];
		long max = 0;
		for(int i=0; i<T; i++){
			arr[i] = sc.nextInt();
			max = Math.max(max, arr[i]);
		}
		System.out.println(binarySearch(0, max, num ,arr));
	}

	static long binarySearch(long start, long end, int target, int[] arr){
		long result = 0;
        end++;
		while(start < end){
			long mid = (end + start) / 2;
			long cnt = 0;
			for(int i=0; i<arr.length; i++){
				cnt = cnt + (arr[i] / mid);
			}
			if(cnt < target){
				end = mid;
			}
			else{
				result = mid;
				start = mid + 1;
			}
		}
		return result;

	}
}
