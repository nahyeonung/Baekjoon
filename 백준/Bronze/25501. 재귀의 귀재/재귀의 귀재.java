import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;


public class Main {
	static int cnt = 0;
	public static int recursion(String s, int l, int r){
		cnt++;
        if(l >= r) {
			return 1;
		}
        else if(s.charAt(l) != s.charAt(r)) {
			return 0;
		}
        else return recursion(s, l+1, r-1);
    }
    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		sc.nextLine();
		for(int i=0; i<N; i++){
			String str = sc.nextLine();
			System.out.println(isPalindrome(str) + " " + cnt);
			cnt = 0;
		}
    }
}