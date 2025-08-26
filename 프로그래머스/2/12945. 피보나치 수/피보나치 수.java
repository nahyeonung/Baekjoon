import java.util.*;
import java.io.*;

class Solution {
    public int solution(int n) {

        
        int f1 = 0;
        int f2 = 1;
        int tmp = 0;
        for(int i=2; i<=n; i++){
            f1 = f1 % 1234567;
            f2 = f2 % 1234567;
            tmp = (f1 + f2) % 1234567;
            f1 = f2;
            f2 = tmp;
        }
        return tmp;
    }
}