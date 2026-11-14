import java.util.Scanner;
public class NumberGuess{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = 1 + (int)(100*Math.random());
        int guesses = 7;
        for(int i = 0;i<guesses;i++){
            System.out.println("Enter Your Guess:");
            int n = sc.nextInt();
            if(n==x){
                System.out.println("Congratulations!! your guesses number is correct");
                return;
            }
            else if(n<x){
                System.out.println("The Number is greater than "+n);
            }
            else if(n>x){
                System.out.println("The number is less than "+n);
            }
           
        }
        System.out.println("YOU HAVE EXHAUSTED ALL ATTEMPTS,THE CORRECT NUMBER IS "+x);
    }
}