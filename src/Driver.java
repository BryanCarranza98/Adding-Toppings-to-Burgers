// this program will make the user input their own condiments to their burger.
// If the user desire to quit, the program they will input the number 2.

import java.util.Scanner;
import java.util.ArrayList;


class Driver
{

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        Hamburger hamburger=new Hamburger();

        ArrayList<String> Condiments = new ArrayList<String>();
        String newCondiments = "";

        hamburger.setAddCondiments(true);

        do
        {
            System.out.printf("Add a condiment to your burger [Up to 6] (1) Add  (2) Quit: ");
            String option = input.next().toLowerCase();

            //if he entered 1 user will input the ingredients
            if(option.equalsIgnoreCase("1"))
            {
                System.out.printf("Enter the name your condiment: ");
                newCondiments=input.next();     //inputting the new condiment
                Condiments.add(newCondiments);//new condiment will add into condiment by calling add()
            }

            // if the user does not input 1 or 2 the will get an invalid input
            if (! (option.equalsIgnoreCase("1") || option.equalsIgnoreCase("2")))
            {
                System.out.println( " Invalid option-- please try again... ");
            }


            if(option.equalsIgnoreCase("2"))
            {
                hamburger.setAddCondiments(false);//switch  the value
            }



        }

        while (hamburger.addCondiments); // is true

        hamburger.display();
        for (int i = 0; i < Condiments.size(); i++)
        {

            String ingredient = Condiments.get(i);
            System.out.println("-- " + ingredient);//print all the condiments one by one
        }



    }
}

