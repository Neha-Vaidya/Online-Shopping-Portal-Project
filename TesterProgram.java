package i2.client;
import i2.logic.*;
import java.util.*;

public class TesterProgram {
    public static void main(String args[]){

        Customer list = new Customer();

        System.out.println("\n                                           ****---------------Welcome to DS Mart-----------------****");
        System.out.println();
        Scanner sc = new Scanner(System.in);

        int ch;
        do{
            System.out.println("\n                                                         1.Existing Customer : Sign in");

            System.out.println("\n                                                       2.New Customer : Create an account");

            System.out.println("\n                                                                3.End Shopping");

            //System.out.println("\n 3.Signed In , Start Shopping!!!");

            System.out.println("                                         ****--------------------------------------------------****");
            System.out.println("\n                                                               Enter your choice");
            ch=Integer.parseInt(sc.nextLine());


            switch(ch){

                case 1:


                    String name= list.checkExistingCustomer(list);
                    System.out.println();
                    list.displayCart(list,name);
                    list.displayFullCart(name,list);




                    break;

                case 2 :

                    System.out.println("\n Enter your full name");
                    String name1 = sc.nextLine();


                    System.out.println("\n Enter your phone number");
                    long pN1 = Long.parseLong(sc.nextLine());



                    System.out.println("\n Enter your address");
                    String address1 = sc.nextLine();


                    list.createNewCustomer(list , name1, pN1, address1);


                    System.out.println("\n You are Successfully registered");
                    System.out.println("\n Happy Shopping!!!!!!");
                    System.out.println("To start shopping, kindly sign in");
                    break;


                case 3 :
                    System.out.println("Thank You for shopping at DS Mart , Stay Safe ");
                    System.out.println("Hope you had a great shopping experience, SEE YOU AGAIN!!!  ");
                 break;
                default:
                    System.out.println("\n Enter a valid choice");

            }


        }while(ch!=3);



    }

}
