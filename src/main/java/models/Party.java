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

    public Party() {

    }

    public void calculateCost(){
        if (typeOfFood.equals("full-course")) {
            this.foodCost = 30;
        } else if (typeOfFood.equals("light snacks")){
             this.foodCost = 20;
        } else {
            this.foodCost = 5;
        }

    }

    public void calculateBeverageCost(){
        if (typeOfBeverage.equals("full-bar")) {
            this.beverageCost = 20;
        } else if (typeOfBeverage.equals("soft drinks")){
            this.beverageCost = 10;
        } else {
            this.beverageCost = 5;
        }
    }

    public void calculateBandCost(){
        if (typeOfEntertainment.equals("live-band")) {
             this.entertainmentCost = 3000;
        } else if (typeOfEntertainment.equals("Dj")){
             this.entertainmentCost = 2000;
        } else {
             this.entertainmentCost = 0;
        }
    }

    public void numberOfGuests(int i) {
    }

    public void setTotalCost(int totalCost) {
        this.totalCost = totalCost;
    }

    public int getTotalCost() {
        if (foodCost == 30 && beverageCost == 20 && entertainmentCost == 3000){
            totalCost = (((foodCost + beverageCost) * numberOfGuests) + entertainmentCost);
            return totalCost;
        } else {
            return 0;
        }

    }

    public int getFoodCost() {
        return foodCost;
    }

    public int getBeverageCost() {
        return beverageCost;
    }

    public int getEntertainmentCost() {
        return entertainmentCost;
    }
}
