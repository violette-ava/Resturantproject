import java.util.Scanner;
import java.util.ArrayList;

public class Resturant {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args){

        System.out.print("Welcome To My Resturant");
        
        int choice = 1;
        while(choice >0){
            System.out.println();
            System.out.println();
            System.out.println("Where will you being dining tonight?");
            System.out.println("1) Dine-In");
            System.out.println("2) Takeout");
            System.out.println("3) Delievery");
            System.out.println("4) Exit");
            System.out.println();
           
            choice = sc.nextInt();
            sc.nextLine();

            if(choice == 1){
                optionOne();
            }
            else if(choice == 2){
                optionTwo();
            }
            else if(choice == 3){
                optionThree();
            }
            else if(choice == 4){
                optionFour();
            }

            private static void optionOne(){

            }

        }
        










    }

    
}
