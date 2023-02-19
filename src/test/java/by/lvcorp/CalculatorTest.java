package by.lvcorp;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setUp(){
        calculator = new Calculator();
    }

    @Test
    void checkGetResultReturn13() {
        //prepare
        calculator.setNumBefore(7);
        calculator.setNumCurrent(6);
        calculator.setOperator("+");

        //action
        double actual = calculator.getResult();

        //check
        Assertions.assertThat(actual).isEqualTo(13);
    }
}