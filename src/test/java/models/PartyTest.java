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
    public void setFoodType_forFullCourse_toCalculate_foodCost_30() {
        Party testParty = new Party();
        testParty.setTypeOfFood("full course");
        testParty.calculateFoodCost();
        assertEquals(30, testParty.getFoodCost());
    }

    @Test
    public void newParty_calculatesBeverageCost_20() {
        Party testParty = new Party(100, "full-course", "full-bar", "live-band");
        testParty.calculateBeverageCost();
        assertEquals(20, testParty.getBeverageCost());
    }

    @Test
    public void newParty_calculatesEntertainmentCost_3000() {
        Party testParty = new Party(100, "full-course", "full-bar", "live-band");
        testParty.calculateBandCost();
        assertEquals(3000, testParty.getEntertainmentCost());
    }

    @Test
    public void newParty_calculatesTotalCostOfParty_8000() {
        Party testParty = new Party(100, "full course", "full bar", "live band");
        assertEquals(8000, testParty.getTotalCost());
    }

}