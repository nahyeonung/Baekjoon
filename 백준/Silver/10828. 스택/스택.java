import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int loop = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i=0; i<loop; i++){
            String[] str = br.readLine().split(" ");
            if(str[0].equals("push")){
                stack.push(Integer.parseInt(str[1]));
            }
            else if(str[0].equals("top")){
                if(stack.isEmpty()){
                    bw.write(-1 + "\n");
                }else{
                    bw.write(stack.peek() + "\n");
                }
            }
            else if(str[0].equals("size")){
                bw.write(stack.size() + "\n");
            }
            else if(str[0].equals("empty")){
                if(stack.isEmpty()){
                    bw.write(1 + "\n");
                }else{
                    bw.write(0 + "\n");
                }
            }
            else if(str[0].equals("pop")){
                if(stack.isEmpty()){
                    bw.write(-1 + "\n");
                }
                else{
                    bw.write(stack.pop() + "\n");
                }
            }
        }
        bw.close();

    }
}