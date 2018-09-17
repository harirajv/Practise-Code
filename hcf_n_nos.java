import java.io.*;
import java.util.Scanner;

public class hcf_n_nos{
    private static int gcd(int a,int b){
        if(b==0)return a;
        else return gcd(b,a%b);
    }
    public static void main(String[] args) {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter size of array:");
        n=sc.nextInt();
        int arr[]=new int[n];
        System.out.print("Enter array:");
        for(int i=0;i<n;i++)arr[i]=sc.nextInt();

        int hcf=arr[0];
        for(int i=0;i<arr.length;i++)hcf=gcd(arr[i],hcf);

        System.out.println("HCF of array = "+hcf);
        sc.close();
    }
}