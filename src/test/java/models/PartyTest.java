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
    public void newParty_calculatesCost_30() {
        Party testParty = new Party(100, "full-course", "full-bar", "live-band");
        testParty.calculateCost();
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
        Party testParty = new Party(100, "full-course", "full-bar", "live-band");
        testParty.calculateBandCost();
        testParty.calculateBeverageCost();
        testParty.calculateCost();
        System.out.println(" ===== " + testParty.getTotalCost());
        assertEquals(8000, testParty.getTotalCost());
    }

}