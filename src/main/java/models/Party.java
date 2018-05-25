package models;

public class Party {
    private int numberOfGuests;
    private String typeOfFood;
    private String typeOfBeverage;
    private String typeOfEntertainment;
    private int foodCost;
    private int beverageCost;
    private int entertainmentCost;
    private int totalCost;

    public Party (int guests, String food, String beverage, String entertainment) {
        numberOfGuests = guests;
        typeOfFood = food;
        typeOfBeverage = beverage;
        typeOfEntertainment = entertainment;
    }

    public int calculateCost(){
        if (typeOfFood.equals("full-course")) {
            return foodCost = 30;
        } else if (typeOfFood.equals("light snacks")){
            return foodCost = 20;
        } else {
            return foodCost = 5;
        }

    }

    public int calculateBeverageCost(){
        if (typeOfBeverage.equals("full-bar")) {
            return beverageCost = 20;
        } else if (typeOfBeverage.equals("soft drinks")){
            return beverageCost = 10;
        } else {
            return beverageCost = 5;
        }
    }

}
