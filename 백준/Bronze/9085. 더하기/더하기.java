import java.util.Scanner;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int loop = sc.nextInt();
        for(int i=0; i<loop; i++){
            int sum = 0;
            int loop2 = sc.nextInt();
            for(int j=0; j<loop2; j++){
                int num = sc.nextInt();
                sum += num;
            }
            System.out.println(sum);
        }
    }
}