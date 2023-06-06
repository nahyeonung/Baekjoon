import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str = br.readLine();
		int loop = Integer.parseInt(br.readLine());
		Stack<String> first = new Stack<>();
		Stack<String> second = new Stack<>();
		String[] spell = str.split("");
		for(String a : spell){
			first.push(a);
		}
		for(int i=0; i<loop; i++){
			String[] arr = br.readLine().split(" ");
			if(arr[0].equals("P")){
				first.push(arr[1]);
			}
			else if(arr[0].equals("L")){
				if(first.empty()){
				}else{
					second.push(first.peek());
					first.pop();
				}
			}
			else if(arr[0].equals("D")){
				if(second.empty()){

				}else{
					first.push(second.peek());
					second.pop();
				}
			}
			else if(arr[0].equals("B")){
				if(first.empty()){

				}else{
					first.pop();
				}
			}
		}
		while(!first.empty()){
			second.push(first.pop());
		}
		while(!second.empty()){
			bw.write(second.pop());
		}
		bw.close();
	}
}
