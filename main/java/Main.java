import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random r = new Random();
        Scanner s = new Scanner(System.in);

        int userNum = getNumberFromUser(s);
        int random = getRandomNumber(r);
        System.out.println( isNumbersTheSame(random, userNum) );
    }
    public static int getRandomNumber(Random r){
        int myRandom = r.nextInt(10);
        return myRandom;
    }
    public static int getNumberFromUser(Scanner scanner){
        System.out.println("Guess A number");
        int number = scanner.nextInt();
        return number;
    }

    public static boolean isNumbersTheSame(int random, int userNumber){
        if(userNumber == random){
            return true;
        }else {
            return false;
        }
    }
}
