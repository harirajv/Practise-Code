//In a matrix of 0 and 1, count total no of paths from start at top left to dest at bottom rt
import java.util.Scanner;

public class mat_num_paths{
    public static void main(String[] args) {
        System.out.print("Enter dimensions:");
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        int c=sc.nextInt();
        int mat[][]=new int[r][c];
        System.out.println("Enter the matrix:");
        for(int i=0;i<r;i++)for(int j=0;j<c;j++)mat[i][j]=sc.nextInt();
        int paths[][]=new int[r][c];
        paths[0][0]=1;
        //First and col diff from others as less neighbors
        for(int i=1;i<c;i++){
            if(paths[0][i-1]==1 && mat[0][i]==1)//path to curr cell exists and curr cell exists
                paths[0][i]=1;
        }
        for(int i=1;i<r;i++){
            if(paths[i-1][0]==1 && mat[i][0]==1)
                paths[i][0]=1;
        }
        for(int i=1;i<r;i++){
            for(int j=1;j<c;j++){
                if(mat[i][j]==1)
                    paths[i][j]=paths[i][j-1]+paths[i-1][j];//paths from upper and left cells added
            }
        }
        System.out.println("Total no of paths = "+paths[r-1][c-1]);
    }
}