package rahaf;

import java.util.Scanner;

public class Main2 {

    public static void main(String[] args) {
           Scanner input=new Scanner(System.in);
    int num=input.nextInt();
    int sum=0;
    if ((num >=1)&&(num <=100)){
        for(int i=1;i<=num;i++){
            sum+=i;
        }
               System.out.println(sum);

    
}
    }}