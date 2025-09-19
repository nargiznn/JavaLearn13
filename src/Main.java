import java.time.chrono.IsoChronology;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static boolean isPalindromik(String str){
        int i=0;
        int k=str.length()-1;
        while (i<k){
            if (str.charAt(i) != str.charAt(k)) {
                return false;
            }
            i++;
            k--;
        }
        return  true;
    }
    static boolean isPalindromik2(String str){
        String reverse="";
        for (int i=str.length()-1;i>=0;i--){
            reverse+=str.charAt(i);
        }
        if (reverse.equals(str)) return true;
        return  false;
    }
    public static void main(String[] args) {
//        System.out.print("Number Guessing Game : ");
//        Random random = new Random();
//        Scanner input = new Scanner(System.in);
//
//        int number = random.nextInt(100);
//        int attempts = 0;
//        int[] wrongGuesses = new int[5];
//        boolean isWin = false;
//        boolean isWrong = false;
//        System.out.println(number);
//        int guess;
//
//        while (attempts < 5) {
//            System.out.println("Enter your guess: ");
//            guess = input.nextInt();
//
//            if (guess < 0 || guess > 99) {
//                System.out.print("Your guess must be between 0 and 100. ");
//                if (isWrong) {
//                    attempts++;
//                    System.out.print("Too many invalid entries. Remaining attempts: " + (5 - attempts));
//                } else {
//                    isWrong = true;
//                    System.out.print("Next invalid entry will reduce your attempts.");
//                }
//                continue;
//            }
//
//            if (guess == number) {
//                System.out.print("Congratulations! You guessed correctly. The number was: " + number);
//                isWin = true;
//                break;
//            } else {
//                System.out.print("Wrong guess! ");
//                if (guess > number) {
//                    System.out.print("Your guess is greater than the hidden number. ");
//                } else {
//                    System.out.print("Your guess is smaller than the hidden number. ");
//                }
//                wrongGuesses[attempts++] = guess;
//                System.out.println("Remaining attempts: " + (5 - attempts));
//            }
//        }
//
//        if (!isWin) {
//            System.out.println("You lost!");
//            if (!isWrong) {
//                System.out.println("Your guesses: " + Arrays.toString(wrongGuesses));
//            }
//        }

        //Palindromik kelime
        System.out.println(isPalindromik("abba"));
        System.out.println(isPalindromik2("abba"));


    }
}