import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		int max = sc.nextInt();
		int cnt = 0;
		int[] man = new int[6];
		int[] woman = new int[6];
		for(int i=0; i<total; i++){
			int sex = sc.nextInt();
			int grade = sc.nextInt();
			if(sex == 0){
				woman[grade-1]++;
			}else{
				man[grade-1]++;
			}
		}
		for(int i=0; i<6; i++){
			int a = man[i] / max;
			int b = woman[i] / max;
			cnt = cnt + a + b;
			if(man[i] % max > 0){
				cnt++;
			}
			if(woman[i] % max > 0){
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
