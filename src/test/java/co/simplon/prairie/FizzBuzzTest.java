package co.simplon.prairie;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 * Classe de tests de la classe FizzBuzz
 */
public class FizzBuzzTest {

    @Test
    public void la_correspondance_de_0_est_0() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        String reponse = fizzBuzz.determinerCorrespondance(0);

        assertEquals(
                "La correspondance pour 0 doit être 0.",
                "0",
                reponse
        );
    }

    @Test
    public void la_correspondance_de_3_est_Fizz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 3 doit être Fizz.",
                "Fizz",
                fizzBuzz.determinerCorrespondance(3)
        );
    }

    @Test
    public void la_correspondance_de_5_est_Buzz() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 5 doit être Buzz.",
                "Buzz",
                fizzBuzz.determinerCorrespondance(5)
        );
    }


    @Test
    public void la_correspondance_de_2_est_2() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 2 doit être 2.",
                "2",
                fizzBuzz.determinerCorrespondance(2)
        )
        ;
    }

     @Test
    public void la_correspondance_de_4_est_4() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(
                "La correspondance pour 4 doit être 4.",
                "4",
                fizzBuzz.determinerCorrespondance(4)
        )
        ;
    }
}
