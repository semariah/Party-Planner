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
                    String inputFood = bufferedReader.readLine();
                    if () {

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
