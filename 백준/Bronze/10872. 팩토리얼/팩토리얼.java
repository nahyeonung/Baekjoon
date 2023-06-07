import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int factorial = sc.nextInt();
        int sum = 1;
        for(int i=1; i<=factorial; i++){
            sum = sum * i;
        }
        System.out.println(sum);
    }
}