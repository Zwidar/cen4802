import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;

class fibseqTest {

    /*@Test
    @DisplayName("Specific term of Fibonacci")
    void main() {
        assertEquals(55, fibseq.fibCalc(10));
        assertEquals(610, fibseq.fibCalc(15));
    }*/

    @ParameterizedTest
    @DisplayName("Specific term of Fibonacci")
    @CsvSource(value = {"10, 55", "15, 610"} )
    void main(int input, int expected) {
        assertEquals(expected, fibseq.fibCalc(input));
    }

}