package rahaf;

import java.util.Scanner;

public class anton_danik {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int num_of_games = input.nextInt();
        char[] array = new char[num_of_games];
        int anton = 0;
        int danik = 0;
        for (int i = 0; i <num_of_games; i++) {
            array[i] = input.next().charAt(0);
            switch (array[i]) {
                case 'D':
                    danik++;
                    break;
                case 'A':
                    anton++;
                default:
                    break;
            }

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
