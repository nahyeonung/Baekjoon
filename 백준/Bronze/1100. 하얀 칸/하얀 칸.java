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
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] arr = new String[8][8];
        int cnt = 0;
        for(int i=0; i<8; i++){
            arr[i] = sc.nextLine().split("");
            for(int j=0; j<8; j++){
                if(arr[i][j].equals("F")){
                    if(i % 2 == 0 & j % 2 == 0){
                        cnt++;
                    }
                    else if(i % 2 == 1 & j % 2 == 1){
                        cnt++;
                    }
                }               
            }
        }
        System.out.println(cnt);
    }
}