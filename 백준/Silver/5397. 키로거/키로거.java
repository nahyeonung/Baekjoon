import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int loop = Integer.parseInt(br.readLine());
        for(int i=0; i<loop; i++){
            Stack<String> leftStack = new Stack<>();
            Stack<String> rightStack = new Stack<>();
            String[] str = br.readLine().split("");
            for(int j=0; j<str.length; j++){
                if(str[j].equals("<")){
                    if(leftStack.empty()){

                    }
                    else{
                        rightStack.push(leftStack.pop());
                    }
                }
                else if(str[j].equals(">")){
                    if(rightStack.empty()){

                    }else{
                        leftStack.push(rightStack.pop());
                    }
                }
                else if(str[j].equals("-")){
                    if(leftStack.empty()){
                    
                    }
                    else{
                        leftStack.pop();
                    }
                }
                else{
                    leftStack.push(str[j]);
                }
            }
            while(!leftStack.empty()){
                rightStack.push(leftStack.pop());
            }
            while(!rightStack.empty()){
                sb.append(rightStack.pop());
            }
            sb.append("\n");
        }
        System.out.println(sb);

    }
}