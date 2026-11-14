import java.util.Scanner;
class ATM{ 
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Registration PIN: ");
        int Pin = sc.nextInt();{
        if (Pin== 4589){
            System.out.println("==ATM LOGIN==");
            System.out.println("PIN verified successfully");
            System.out.println("WELCOME TO ABC BANK ATM");
        }
    }
}}