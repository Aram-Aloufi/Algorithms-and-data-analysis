package rahaf;

import java.util.Scanner;

public class anton_danik {

    public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
        int num_of_games = input.nextInt();
        String winner = input.next();
        int anton = 0;
        int danik = 0;
        
        for (int i = 0; i < num_of_games; i++) {
            if (winner.charAt(i) == 'D') 
                danik++;
             else 
                anton++;
            }
        

        if (danik > anton) {
            System.out.print("Danik");
        } else if (danik < anton) {
            System.out.print("Anton");
        } else {
            System.out.print("Friendship");

        }

    }

}

