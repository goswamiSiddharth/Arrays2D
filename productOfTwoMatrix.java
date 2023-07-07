package Array2D;
import java.util.*;
public class productOfTwoMatrix {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter row 1");
        int r1=sc.nextInt();
        System.out.println("enter column 1");
        int c1=sc.nextInt();
        int arr1[][]=new int[r1][c1];
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++){
                arr1[i][j]=sc.nextInt();
            }
        }

        System.out.println("enter row 2");
        int r2=sc.nextInt();
        System.out.println("enter column 2");
        int c2=sc.nextInt();
        int arr2[][]=new int[r2][c2];
        for(int i=0;i<arr2.length;i++){
            for(int j=0;j<arr2[i].length;j++){
                arr2[i][j]=sc.nextInt();
            }
        }

        if(c1!=r2){
            System.out.println("invalid");
            return;
        }

        int prd[][]=new int[r1][c2];
        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[i].length;j++){
                for(int k=0;k<c1;k++){
                    prd[i][j]+=arr1[i][k]*arr2[k][i];
                }
            }
        }

        for(int i=0;i<prd.length;i++){
            for(int j=0;j<prd[i].length;j++){
                System.out.print(prd[i][j]+" ");
            }
            System.out.println();
        }
    }
}
