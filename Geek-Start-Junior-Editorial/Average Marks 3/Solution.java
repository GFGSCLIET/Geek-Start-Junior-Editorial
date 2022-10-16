import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
 int i;
    Scanner s=new Scanner(System.in);

    int n=s.nextInt();

    int[] a=new int[n];

    double avg=0;

    for( i=0;i<n;i++)
    {
       a[i]=s.nextInt();
    }

    for( i=0;i<n;i++)
    {
      avg=avg+a[i];
    }
    System.out.println(String.format("%.2f",avg/n));
  }
}
