import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i=0; i<N; i++) {
			int size = sc.nextInt();
			int seq = sc.nextInt();
			Queue<Integer> queue = new LinkedList<Integer>();
			List<Integer> arr = new ArrayList<Integer>();
			for(int j=0; j<size; j++) {
				queue.add(j);
				arr.add(sc.nextInt());
			}
			int sum = 0;
			while(true) {
				int cnt = 0;
				for(int j=0; j< arr.size(); j++) {
					if(arr.get(0) < arr.get(j)) {
						cnt++;
					}
				}
				if(cnt > 0) {
					int num = queue.poll();
					queue.add(num);
					int num2 = arr.remove(0);
					arr.add(num2);
				}else {
					int num = queue.poll();
					arr.remove(0);
					sum++;
					if(num == seq) {
						break;
					}
				}
			}
			System.out.println(sum);
		}
		
	}
}
