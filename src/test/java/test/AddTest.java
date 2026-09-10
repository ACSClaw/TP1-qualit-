package test;

import main.Add;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {

    @Test
    public void testAddition() {
        Add add = new Add();

        int resultat = add.add(1, 2);

        assertEquals(3, resultat);
    }

}
