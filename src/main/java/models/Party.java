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


    public Party() {

    }

    public Party (int numberOfGuests, String typeOfFood, String typeOfBeverage, String typeOfEntertainment){
        this.numberOfGuests = numberOfGuests;
        this.typeOfFood = typeOfFood;
        this.typeOfBeverage = typeOfBeverage;
        this.typeOfEntertainment = typeOfEntertainment;

    }


    public void setNumberOfGuests(int numberOfGuests) {
        this.numberOfGuests = numberOfGuests;
    }

    public int getNumberOfGuests() {
        return numberOfGuests;
    }

    public int getFoodCost() {
        return foodCost;
    }

    public void setTypeOfFood(String typeOfFood) {
        this.typeOfFood = typeOfFood;
    }

    public void setTypeOfBeverage(String typeOfBeverage) {
        this.typeOfBeverage = typeOfBeverage;
    }

    public int getBeverageCost() {
        return beverageCost;
    }

    public void setTypeOfEntertainment(String typeOfEntertainment) {
        this.typeOfEntertainment = typeOfEntertainment;
    }


    public int getEntertainmentCost() {
        return entertainmentCost;
    }

    public void calculateFoodCost(){
        if (typeOfFood.equals("full course")) {
            this.foodCost = 30;
        } else if (typeOfFood.equals("light snacks")){
             this.foodCost = 20;
        } else {
            this.foodCost = 5;
        }

    }

    public void calculateBeverageCost(){
        if (typeOfBeverage.equals("full bar")) {
            this.beverageCost = 20;
        } else if (typeOfBeverage.equals("soft drinks")){
            this.beverageCost = 10;
        } else {
            this.beverageCost = 5;
        }
    }

    public void calculateBandCost(){
        if (typeOfEntertainment.equals("live band")) {
             this.entertainmentCost = 3000;
        } else if (typeOfEntertainment.equals("dj")){
             this.entertainmentCost = 2000;
        } else {
             this.entertainmentCost = 0;
        }
    }

    public int getTotalCost() {
        calculateFoodCost();
        calculateBandCost();
        calculateBeverageCost();
        totalCost = (((foodCost + beverageCost) * numberOfGuests) + entertainmentCost);
        return totalCost;

    }
}
