import java.util.Random;
import java.util.Scanner;
public class guess {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("welcome to the guessing game ");

        Random ran = new Random();
        int x = ran.nextInt(1,100);

        for (int i = 1; i <= 3; i++){
            System.out.println("you have total 3 chance to guess the correct no ");
            System.out.println("enter your guess no between (1-100) :");
            int guess = sc.nextInt();

            if (guess == x ){
                System.out.println("yes you got the right no");
            } else if (guess<x) {
                System.out.println("your guess answer is too low ");

            } else  {
                System.out.println("your answer is Too high ");

            }
            int remamingxhances = 3-i;
            if (remamingxhances>0){
                System.out.println("you have "+remamingxhances+ " chances left");
            }else
                System.out.println("no chnaces left the correct answer was " +x+ ".");
        }


    }

}