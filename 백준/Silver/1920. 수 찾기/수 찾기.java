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
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int M = sc.nextInt();
        for(int i=0; i<M; i++){
            int num = sc.nextInt();
            System.out.println(binary(num, arr));
        }
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // int N = br.readLine());
        // String[] arr = br.readLine().split(" ");
        // Arrays.sort(arr);
        // N = br.readLine());
        // String[] arr2 = br.readLine().split(" ");
        // for(int i=0; i<arr2.length; i++){
        //     int num = arr2[i]);
        //     System.out.println(binary(num, arr));
        // }

        
    }
    static int binary(int num, int[] arr){
            int low = 0; 
            int high = arr.length - 1; 
            int mid;

            while(low <= high){
                mid = (low + high) / 2;
                if(num > arr[mid]) {
                    low = mid + 1;
                }
                else if(num < arr[mid]){
                    high = mid - 1;
                }
                else {
                    return 1;
                }

            }

            return 0;
    }
}