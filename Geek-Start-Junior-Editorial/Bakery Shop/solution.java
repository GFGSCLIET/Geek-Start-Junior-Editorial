import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        int r;
        double
            pi = 3.14;
        double area;
        Scanner s = new Scanner(System.in);
        r = s.nextInt();
        area = pi * r * r;
        System.out.println(String.format("%.2f", area));
    }
}
    
