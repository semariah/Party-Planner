import models.Party;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) {
        boolean programRunning = true;
        while (programRunning) {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Welcome to portland party planner app");
            Party newParty = new Party();
            try {
                System.out.println("Please make a selection: book an event or exit ");
                String userEntry = bufferedReader.readLine();
                if (userEntry.toLowerCase().equals("book an event")) {
                    System.out.println("How many people will be attending the event?");
                    String numberOfguests  = bufferedReader.readLine();
                    newParty.setNumberOfGuests(Integer.parseInt(numberOfguests));
                    System.out.println("Number of guests: " + newParty.getNumberOfGuests());
                    System.out.println("Please choose a food courses: full course or light snacks");

                    boolean foodCheck = true;
                    while (foodCheck){
                        String inputFood = bufferedReader.readLine();
                        //food = inputFood;
                        if (inputFood.toLowerCase().equals("full course") || inputFood.toLowerCase().equals("light snacks")) {
                            newParty.setTypeOfFood(inputFood);
                            foodCheck = false;
                            System.out.println("Food cost: " + newParty.getFoodCost());

                        } else {
                            System.out.println("Sorry but, Input not recognized");
                        }
                    }
                    System.out.println("Please choose a beverage courses: full-bar or soft drinks");
                    boolean beverageCheck = true;
                    while (beverageCheck){
                        String inputBeverage = bufferedReader.readLine();
                        //beverages = inputBeverage;
                        if (inputBeverage.toLowerCase().equals("full bar") || inputBeverage.toLowerCase().equals("soft drinks")) {
                            newParty.setTypeOfBeverage(inputBeverage);
                            beverageCheck = false;
                            System.out.println("Beverage cost: " + newParty.getBeverageCost());

                        } else {
                            System.out.println("Sorry but, Input not recognized");
                        }
                    }
                    System.out.println("Please choose an entertainment type: live band or dj");
                    boolean entertainmentCheck = true;
                    while (entertainmentCheck){
                        String inputEntertainment = bufferedReader.readLine();
                        //entertainment = inputEntertainment;
                        if (inputEntertainment.toLowerCase().equals("live band") || inputEntertainment.toLowerCase().equals("dj")) {
                            newParty.setTypeOfEntertainment(inputEntertainment);
                            entertainmentCheck = false;
                            System.out.println("Entertainment cost: " + newParty.getEntertainmentCost());
                            // calculating cost
                            newParty.calculateFoodCost();
                            newParty.calculateBandCost();
                            newParty.calculateBeverageCost();
                            System.out.println(" Your total cost is: " + newParty.getTotalCost());
                            System.out.println("--------------------------------------------------");
                    System.out.println("Do you want to continue booking more? yes/no");
                    String userContinue = bufferedReader.readLine();
                    if(userContinue.equals("yes")){
                        newParty = new Party();
                    } else {
                        programRunning = false;
                    }
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
