import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        int guests = 0;
        String food = "";
        String beverages = "";
        String entertainment = "";
        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to portland party planner app");
            Party newParty = new Party();
            try {
                System.out.println("Please make a selection: book an event or exit ");
                String userEntry = bufferedReader.readLine();
                if (userEntry.equals("book an event")) {
                    System.out.println("How many people will be attending the event?");
                    String numberOfguests  = bufferedReader.readLine();
                    guests = Integer.parseInt(numberOfguests);
                    System.out.println("Please choose a food courses: full-course or light snacks");

                    boolean foodCheck = true;
                    while (foodCheck){
                        String inputFood = bufferedReader.readLine();
                        food = inputFood;
                        if (food.equals("full-course") || food.equals("light snacks")) {
                            foodCheck = false;

                        } else {
                            System.out.println("Sorry but, Input not recognized");
                        }
                    }
                    System.out.println("Please choose a beverage courses: full-bar or soft drinks");
                    boolean beverageCheck = true;
                    while (beverageCheck){
                        String inputbeverage = bufferedReader.readLine();
                        beverages = inputbeverage;
                        if (beverages.equals("full-bar") || food.equals("soft drinks")) {
                            beverageCheck = false;

                        } else {
                            System.out.println("Sorry but, Input not recognized");
                        }
                    }
                    System.out.println("Please choose an entertainment type: live-band or Dj");
                    boolean entertainmentCheck = true;
                    while (entertainmentCheck){
                        String inputentertainment = bufferedReader.readLine();
                        entertainment = inputentertainment;
                        if (entertainment.equals("live-band") || food.equals("Dj")) {
                            entertainmentCheck = false;

                        } else {
                            System.out.println("Sorry but, Input not recognized");
                        }
                    }




                } else if(userEntry.equals("exit")){
                    programRunning = false;
                } else{
                    System.out.println("Sorry, Invalid input. Please try again");
                }


            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
