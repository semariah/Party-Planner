package models;

import org.junit.Test;

import static org.junit.Assert.*;

public class PartyTest {
    @Test
    public void generate_ifItInstantiates_true() {
        Party testParty = new Party(10, "snack", "beer", "dancing");
        assertEquals(true, testParty instanceof Party);
    }
}