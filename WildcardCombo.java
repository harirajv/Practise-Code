// i/p:bianry string with wildcard character ?
// o/p:print all possible combinations by replacing ? with 0 and 1
import java.io.*;
import java.util.*;
import java.lang.*;


public class WildcardCombo{
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter binary string:");
        String input=sc.nextLine();        
        replace(input);
    }

    public static void replace(String str){
        List<String> queue=new ArrayList<String>();
        queue.add(str);

        while(!queue.empty()){
            String s=queue.poll();
            //int index=s.find('?');
            int index;
            for(int i=0;i<s.length();i++)
                if(s.charAt(i)=='?')
                    {index=i;
                    break;}
                    
            if(index!=-1){
                s[index]='0';
                queue.add(s);

                s[index]='1';
                queue.add(s);
            }
            else System.out.println(s);
            
        }
    }
}