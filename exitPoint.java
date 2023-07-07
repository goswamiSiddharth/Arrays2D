package Array2D;
import java.util.*;
public class exitPoint {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter rows");
        int r=sc.nextInt();
        System.out.println("enter columns");
        int c=sc.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                arr[i][j]=sc.nextInt();
            }
        }

        int i=0;
        int j=0;
        int dir=0;
        while(true){
            dir=(dir + arr[i][j])%4;
            if(dir==0){ //east right
                j++;
            }else if(dir==1){ //south down
                i++;
            }else if(dir==2){ //west left
                j--;
            }else if(dir==3){ //north up
                i--;
            }

            if(i<0){
                i++;
                break;
            }else if(j<0){
                j++;
                break;
            }else if(i==arr.length){
                i--;
                break;
            }else if(j==arr[0].length){
                j--;
                break;
            }
        }
        System.out.print("("+i+","+j+")");
        
    }
}
