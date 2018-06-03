package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartyTest {
    @Test
    public void generate_ifItInstantiates_true() {
        Party testParty = new Party(100, "snack", "beer", "dancing");
        assertEquals(true, testParty instanceof Party);
    }

    @Test
    public void setGuestNumber_toBe_100_to_true() {
        Party testParty = new Party();
        testParty.setNumberOfGuests(100);
        assertEquals(100, testParty.getNumberOfGuests());
    }

    @Test
    public void setFoodType_forFullCourse_toCalculate_foodCost_30() {
        Party testParty = new Party();
        testParty.setTypeOfFood("full course");
        testParty.calculateFoodCost();
        assertEquals(30, testParty.getFoodCost());
    }

    @Test
    public void setFoodType_forLightSnacks_toCalculate_foodCost_10() {
        Party testParty = new Party();
        testParty.setTypeOfFood("light snacks");
        testParty.calculateFoodCost();
        assertEquals(20, testParty.getFoodCost());
    }

    @Test
    public void setBeverageType_forFullBar_toCalculate_beverageCost_20() {
        Party testParty = new Party();
        testParty.setTypeOfBeverage("full bar");
        testParty.calculateBeverageCost();
        assertEquals(20, testParty.getBeverageCost());
    }

    @Test
    public void setBeverageType_forSoftDrinks_toCalculate_beverageCost_10() {
        Party testParty = new Party();
        testParty.setTypeOfBeverage("soft drinks");
        testParty.calculateBeverageCost();
        assertEquals(10, testParty.getBeverageCost());
    }

    @Test
    public void setEntertainmentType_forLiveBand_toCalculate_EntertainmentCost_3000() {
        Party testParty = new Party();
        testParty.setTypeOfEntertainment("live band");
        testParty.calculateBandCost();
        assertEquals(3000, testParty.getEntertainmentCost());
    }

    @Test
    public void newParty_calculatesTotalCostOfParty_8000() {
        Party testParty = new Party(100, "full course", "full bar", "live band");
        assertEquals(8000, testParty.getTotalCost());
    }

}