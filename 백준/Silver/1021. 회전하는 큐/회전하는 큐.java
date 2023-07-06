import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		ArrayList<Integer> deque = new ArrayList<Integer>();
		int N = sc.nextInt();
		int cnt = 0;
		for(int i=0; i<size; i++) {
			deque.add(i+1);
		}
		for(int i=0; i<N; i++) {
			int num = sc.nextInt();
			int idx = 0;
			for(int j=0; j<deque.size(); j++) {
				if(num == deque.get(j)) {
					idx = j;
				}
			}
			if(num == deque.get(0)) {
				deque.remove(0);
			}
			else if(idx < deque.size() - idx) {
				while(true) {
					int tmp = deque.remove(0);
					deque.add(tmp);
					cnt++;
					if(num == deque.get(0)) {
						deque.remove(0);
						break;
					}
				}
			}
			else{
				while(true) {
					int tmp = deque.remove(deque.size() - 1);
					deque.add(0, tmp);
					cnt++;
					if(num == deque.get(0)) {
						deque.remove(0);
						break;
					}
				}
			}
		}
		System.out.println(cnt);
		
		
		
	}
}
