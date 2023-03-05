
package rahaf;

import java.util.Scanner;


public class main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int slo=0;
        int num_f=input.nextInt();
        int h=input.nextInt();
        int[]array=new int[num_f];
        for(int i=0;i<num_f;i++){
            array[i]=input.nextInt();
        }
         for(int i=0;i<num_f;i++){
            if(array[i]<=h){
                slo+=1;}
              else{
                slo+=2;
                        
                        }
            }
         System.out.print(slo);
        }

    }
    
