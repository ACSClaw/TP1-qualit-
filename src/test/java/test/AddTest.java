package test;

import main.Add;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class AddTest {

    //Test qui vérifie le cas positif
    @Test
    public void testAddition() {
        Add add = new Add();

        int resultat = add.add(1, 2);

        assertEquals(3, resultat);
    }

    //Test qui vérifie les cas négatifs
    @Test
    public void testAdditionNegatif(){

        Add addNegatif = new Add();
        int resultatNegatif = addNegatif.add(2, 3);
        assertEquals(-1, resultatNegatif);
    }

}
