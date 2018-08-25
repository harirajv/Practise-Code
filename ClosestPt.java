#Closest points
import java.io.*;
import java.lang.*;
import java.util.*;

class Pt{
    int x;
    int y;

    public Pt(int x,int y){
        this.x=x;
        this.y=y;
    }    
    
    public float dis(Pt p1,Pt p2){
        return Math.sqrt((p1.x-p2.x)*(p1.x-p2.x)-(p1.y-p2.y)*(p1.y-p2.y));
    }

    float bruteForce(Pt arr[]){
        float min=Float.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;i++){
                if(dis(arr[i],arr[j])<min)min=dis(arr[i],arr[j]);
            }
        }
        return min;
    }

    public float stripClosest(Pt strip[],float d){
        float min=d;
        Arrays.sort(strip, new PtYComp());
        for(int i=0;i<strip.length;i++){
            for(int j=i+1;j<strip.length && (strip[i].y-strip[j].y)<min;j++){
                if(dis(strip[i],strip[j])<min)min=dis(strip[i],strip[j]);
            }
        }
        return min;
    }

    public float closestUtil(Pt arr[]){
        if(arr.length<=3)return bruteForce(arr);
        int mid=n/2;
        Pt midpt=arr[mid];
        float dl=closestUtil(arr)
    }
}

public class PtXComp implements Comparator<Pt>{
    public int compare(Pt p1,Pt p2){
        return p1.x-p2.x;
    }
}

public class PtYComp implements Comparator<Pt>{
    public int compare(Pt p1,Pt p2){
        return p1.y-p2.y;
    }
}

public class ClosestPt{
    public static void main(String arg[]){
        Pt arr[]={new Pt(3,5),new Pt(1,10),new Pt(2,1)};
        Arrays.sort(arr);
        for(Pt p:arr)System.out.println(p.x+" "+p.y);
    }
}