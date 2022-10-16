import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,count = 0;
        n = sc.nextInt();
        int a[] = new int[n];
        for(int i=0;i<n;i++) 
        {
            a[i] = sc.nextInt();
            if(a[i]<=0) count++;
        }
    System.out.println(count);
    
    }
}
