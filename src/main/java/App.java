import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;





public class App {
    public static  void main (String[] args) {
        Boolean programRunning = true;
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to portland Event planning app");
        System.out.println("Enter your food course type: full-course or light-snacks");


        try {

            Party party = new Party(guests, food, beverage, entertainment);
        }
        catch (IOException e){
            e.printStackTrace();
        }



        boolean foodType = true;
        while (foodType) {

            if (food.equals("full-course") || food.equals("light snacks")){
                foodType = false;
            } else {
                System.out.println("Input not recognized");
            }

        }

    }
}
