package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartyTest {
    @Test
    public void generate_ifItInstantiates_true() {
        Party testParty = new Party(20, "snack", "beer", "dancing");
        assertEquals(true, testParty instanceof Party);
    }

    @Test
    public void newParty_calculatesCost_4000() {
        Party testParty = new Party(20, "full-course", "full-bar", "live-band");
        assertEquals(4000, testParty.calculateCost());
    }

}