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
        assertEquals(30, testParty.calculateCost());
    }

    @Test
    public void newParty_calculatesBeverageCost_3000() {
        Party testParty = new Party(100, "full-course", "full-bar", "live-band");
        assertEquals(20, testParty.calculateBeverageCost());
    }

    @Test
    public void newParty_calculatesEntertainmentCost_3000() {
        Party testParty = new Party(100, "full-course", "full-bar", "live-band");
        assertEquals(3000, testParty.calculateBandCost());
    }

    @Test
    public void newParty_calculatesTotalCost_8000() {
        Party testParty = new Party(100, "full-course", "full-bar", "live-band");
        assertEquals(7000, testParty.getTotalCost());
    }

}