package models;

public class Party {
    private int numberOfGuests;
    private String typeOfFood;
    private String typeOfBeverage;
    private String typeOfEntertainment;

    public Party (int guests, String food, String beverage, String entertainment) {
        numberOfGuests = guests;
        typeOfFood = food;
        typeOfBeverage = beverage;
        typeOfEntertainment = null;
    }

}
