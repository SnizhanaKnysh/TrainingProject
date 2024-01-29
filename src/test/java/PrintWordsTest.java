import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.example.PrintWords;
import org.junit.jupiter.api.Test;

class PrintWordsTest {

    PrintWords printWords = new PrintWords();

    @Test
    void ok() {
        String expectedOutput = "1\n2\nFizz\n4\nBuzz\nFizz\n7\n8\nFizz\nBuzz\n11\nFizz\n13\n14\nFizzBuzz\n";
        assertEquals(expectedOutput, printWords.getFizzBuzz(15));

    }

    @Test
    void lessThanOneShouldReturnIllegalArgumentException() {
        assertThrows(IllegalArgumentException.class,
            () -> {
                printWords.getFizzBuzz(-1);
            });
    }
}
