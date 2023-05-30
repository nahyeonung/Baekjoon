import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		String[] arr = sc.nextLine().split("");
		int[] numArr = new int[10];
		for(int i=0; i<arr.length; i++){
			if(Integer.parseInt(arr[i]) == 6){
				numArr[9]++;
			}else{
				numArr[Integer.parseInt(arr[i])]++;
			}
		}
		int result = 0;
		for(int i=0; i<numArr.length; i++){
			if(i == 9){
				int num = (int)Math.ceil(numArr[i] / 2);
				if(numArr[i] % 2 > 0){
					num++;
				}
				result = Math.max(num, result);
			}else{
				result = Math.max(numArr[i], result);
			}
		}
		System.out.println(result);
	}
}
