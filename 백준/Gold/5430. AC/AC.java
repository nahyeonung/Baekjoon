import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static StringBuffer sb = new StringBuffer();
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        for(int i=0; i<N; i++){
            ArrayDeque<String> queue = new ArrayDeque<>();
            String str = br.readLine();
            int size = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine(),"[],");
            for(int j=0; j<size; j++){
                queue.add(st.nextToken());
            }   
            AC(str, queue);

        }
        System.out.println(sb);
    }
	public static void AC(String command, ArrayDeque<String> deque) {
		
		boolean isRight = true;
		
		for(char cmd : command.toCharArray()) {
			
			if(cmd == 'R') {
				isRight = !isRight;	
				continue;
			}
			if(isRight) {
				if(deque.pollFirst() == null) {
					sb.append("error\n");
					return;
				}
				
			}
			else {
				if(deque.pollLast() == null) {
					sb.append("error\n");
					return;
				}	
			}
		}
		
		// 모든 함수들이 정상적으로 작동했다면 덱의 남은 요소들을 출력문으로 만들어준다.
		makePrintString(deque, isRight);
		
	}
	
	public static void makePrintString(ArrayDeque<String> deque, boolean isRight) {
		
		sb.append('[');	
		
		if(deque.size() > 0) {
			
			if(isRight) {	
				
				sb.append(deque.pollFirst());	
				while(!deque.isEmpty()) {
					sb.append(',').append(deque.pollFirst());
				}
			}
			else {	
				sb.append(deque.pollLast());	
				
 
				while(!deque.isEmpty()) {
					sb.append(',').append(deque.pollLast());
				}
			}
		}
		
		sb.append(']').append('\n');	
	}
   
}