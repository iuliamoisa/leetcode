import java.util.*;
import java.lang.*;
import java.io.*;
import java.math.*;
public class Main {
    
    public static void main (String[] args) throws java.lang.Exception {
        Scanner kb = new Scanner(System.in);
        int test_cases = kb.nextInt();
        for(int cs = 1; cs <= test_cases; cs++){
            int n = kb.nextInt();
             int a[] = new int[n];
            for(int i = 0; i < n; i++){
                a[i] = kb.nextInt();
            }
            findZigZagSequence(a, n);
        }
   }
   
    public static void findZigZagSequence(int [] a, int n){
        Arrays.sort(a); // 1 2 3 4 5 6 7
        int mid = n/2;
        int temp = a[mid];
        a[mid] = a[n - 1];
        a[n - 1] = temp; // mid value should be the biggest value in the array
      // 1 2 3 7 5 6 4
        int st = mid + 1; // 1 2 3 7 [5 6] 4
        int ed = n - 2; // last value is correct - the lowest value from the right side (4 5 6 7) 
        while(st <= ed){ // interchanging the values between the middle and the last 
            temp = a[st];
            a[st] = a[ed];
            a[ed] = temp;
            st = st + 1;
            ed = ed - 1;
        }
        for(int i = 0; i < n; i++){
            if(i > 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }
}



