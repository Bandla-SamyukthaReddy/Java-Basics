import java.util.Scanner;
public class CozaLozaWozaA{
public static void main(String[]args){
    Scanner sc  = new Scanner(System.in);
     int lowerbound = 1;
     int upperbound = 110;
     for(int num = lowerbound;num<=upperbound;num++)
    {
        if(num%3==0){
            System.out.print("Coza");
        }
         if(num%5==0){
            System.out.print("Loza");
        }
        if(num%7==0){
            System.out.print("Woza");
        }
        if(num%3!=0&&num%5!=0&&num%7!=0);
        {
            System.out.print(num);
        }
        if(num%11==0){
                System.out.println();
        }
        else {
            System.out.print(' ');
        }
     }
}
}