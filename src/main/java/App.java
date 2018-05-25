import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public class App {
    public static  void main(String[] args, Object beverages, Object foods, Object entertainments, Object food, Object beverage, Object entertainment) {
        Boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to portland Event planning app");
            Party party = new Party(int guests int String food, String beverage, String entertainment);
            try {
                System.out.println("Enter your food course type: full-course or light-snacks");
                String userInput = bufferedReader.readLine();
                if(userInput.equals("book a party")) {
                    System.out.println("How many people will be partying?");


            }
            }
            catch (IOException e) {
                e.printStackTrace();


//        boolean foodType = true;
//        while (foodType) {
//
//            if (food.equals("full-course") || food.equals("light snacks")){
//                foodType = false;
//            } else {
//                System.out.println("Input not recognized");
//            }
//
//        }

        }
    }
}
}
