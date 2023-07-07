package Array2D;
import java.util.*;
public class spiralTraversal {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row");
        int r=sc.nextInt();
        System.out.println("enter column");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int minc=0;
        int minr=0;
        int maxr=arr.length-1;
        int maxc=arr[0].length-1;
        int te=r*c;
        int count=0;
        while(count<te){
            // left wall
            for(int i=minr,j=minc;i<=maxr && count<te;i++){
                System.out.println(arr[i][j]);
                count++;
            }
            minc++;

            // bottom wall
            for(int i=maxr,j=minc;j<=maxc && count<te;j++){
                System.out.println(arr[i][j]);
                count++;
            }
            maxr--;

            // right wall
            for(int i=maxr,j=maxc;i>=minr && count<te;i--){
                System.out.println(arr[i][j]);
                count++;
            }
            maxc--;

            // top wall
            for(int i=minr,j=maxc;j>=minc && count<te;j--){
                System.out.println(arr[i][j]);
            }
            minr++;
        }
    }
}
