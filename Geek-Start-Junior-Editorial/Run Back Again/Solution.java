import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {   
    int n,r,sum=0,temp;  
        Scanner s = new Scanner(System.in);
    n = s.nextInt();    
    temp=n;    
    while(n>0)    
    {    
    r=n%10;    
    sum=(sum*10)+r;    
    n=n/10;    
    }    
    if(temp==sum)    
    System.out.print("True");    
    else    
    System.out.print("False");   
    }
}
