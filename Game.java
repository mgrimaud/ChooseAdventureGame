import java.util.Scanner;


public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("You wake up as a citizen from England and have the urge to travel around the world.\nYou end up walking to the train station and are asked...");
        System.out.println("Do you want to get on Train A or Train B?");
        String firstTrain = sc.nextLine();;
        while(!firstTrain.equals("A")){
            firstTrain = sc.nextLine();
            System.out.println("This train fell of the face of the earth pls try again.");
        }
        
        System.out.println("This train heads in two directions East and South in Europe,\nWhat direction do you want to go to?");
        String directDest = sc.nextLine();
        if(directDest.equals("South")) {
            System.out.println("The Train starts to head south. ");
        }
        else if (directDest.equals("East")) {
            System.out.println("The Train starts to head east. ");
        }
        else {
            System.out.println("The train isn't heading there...");
        }
    



    }
}