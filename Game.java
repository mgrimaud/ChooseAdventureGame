/*
Authors: Micah Grimaud && Evan Armitage
Title: 1.3 ChooseYourOwnPath Game
Date: 10/10/22
Course: APSCA, Tri 1, Woldseth
Description: Choose Your Own Path, Choose your own adventure game works, is themed, and has at least nine paths. 
For each conditional, display a new statement and a new set of choices.
*/


import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        boolean easterEgg = false;
        int easterEggCounter = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("You wake up as a citizen from England and have the urge to travel around the world.\nYou end up walking to the train station and are asked...");
        System.out.println("Do you want to get on Train A or Train B?");
        String firstTrain = "";

        while(!firstTrain.equals("A") && !(easterEgg)) {
            firstTrain = sc.nextLine();
            if (firstTrain.equals("B")) {
                System.out.println("This train is out of order.");
            }
            easterEggCounter++;

            if (easterEggCounter >= 5) {
                easterEgg = true;
            }

        }
        
        if (easterEgg) {
            System.out.println("A train derails and crashes into you because of your stubborness.");
        }
        
        else {
            System.out.println("This train heads in two directions East and South in Europe,\nWhat direction do you want to go to?");
            String directDest = sc.nextLine();

            if (directDest.equals("South")) {
                System.out.println("The Train starts to head south. ");

                System.out.println("Do you want to get off at Portugual, Spain, Italy, or Sicily?");
                String countryDest = sc.nextLine();

                if (countryDest.equals("Portugal")) {
                    System.out.println("You get off in Portugal. ");
                }
                else if (countryDest.equals("Spain")) {
                    System.out.println("You get off in Spain. ");
                }
                else if (countryDest.equals("Italy")) {
                    System.out.println("You get off in Italy. ");
                }
                else if (countryDest.equals("Sicily")) {
                    System.out.println("You get off in Sicily. ");
                }
                else {
                    System.out.println("That's an invalid destination.");
                }

            
            }
            else if (directDest.equals("East")) {
                System.out.println("The Train starts to head east. ");

                System.out.println("Do you want to get off in Germany, Switzerland, Finland, or Turkey?");
                String countryDest = sc.nextLine();

                if (countryDest.equals("Germany")) {
                    System.out.println("You get off in Germany. ");
                }
                else if (countryDest.equals("Switzerland")) {
                    System.out.println("You get off in Switzerland. ");
                }
                else if (countryDest.equals("Finland")) {
                    System.out.println("You get off in Finland. 🤮");
                }
                else if (countryDest.equals("Turkey")) {
                    System.out.println("You get off in Turkey. ");
                }
                else {
                    System.out.println("That's an invalid destination.");
                }
            }

            else {
                System.out.println("The train isn't heading there...");
            }
        }

        System.out.println("The End.");
        sc.close();
    }
}