import java.util.Scanner;
import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack();
		StringBuffer sb = new StringBuffer();
		int first =	0;
		Scanner sc = new Scanner(System.in);
		int loop = sc.nextInt();
		for(int i=0; i<loop; i++) {
			int num = sc.nextInt();
			if(num > first) {
				for(int j=first+1; j<=num; j++) {
					stack.push(j);
					sb.append("+" + "\n");
				}
				first = num;
			}
			else if(stack.peek() != num) {
				System.out.println("NO");
				System.exit(0);
			}
			stack.pop();
			sb.append("-" + "\n");
		}
		System.out.println(sb);
	}
}
