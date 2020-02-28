import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NextDayCalculatorTest {

    @Test
    @DisplayName("1-1-2018")
    void nextDay1() {
        int inputDay = 1;
        int inputMonth = 1;
        int inputYear = 2018;
        String expected = "2-1-2018";
        assertEquals(expected,NextDayCalculator.nextDay(inputDay,inputMonth,inputYear));
    }

    @Test
    @DisplayName("31-1-2018")
    void nextDay2() {
        int inputDay = 31;
        int inputMonth = 1;
        int inputYear = 2018;
        String expected = "1-2-2018";
        assertEquals(expected,NextDayCalculator.nextDay(inputDay,inputMonth,inputYear));
    }

    @Test
    @DisplayName("30-4-2018")
    void nextDay3() {
        int inputDay = 30;
        int inputMonth = 4;
        int inputYear = 2018;
        String expected = "1-5-2018";
        assertEquals(expected,NextDayCalculator.nextDay(inputDay,inputMonth,inputYear));
    }

    @Test
    @DisplayName("28-2-2018")
    void nextDay4() {
        int inputDay = 28;
        int inputMonth = 2;
        int inputYear = 2018;
        String expected = "1-3-2018";
        assertEquals(expected,NextDayCalculator.nextDay(inputDay,inputMonth,inputYear));
    }

    @Test
    @DisplayName("29-2-2020")
    void nextDay5() {
        int inputDay = 29;
        int inputMonth = 2;
        int inputYear = 2020;
        String expected = "1-3-2020";
        assertEquals(expected,NextDayCalculator.nextDay(inputDay,inputMonth,inputYear));
    }

    @Test
    @DisplayName("31-12-2018")
    void nextDay6() {
        int inputDay = 31;
        int inputMonth = 12;
        int inputYear = 2018;
        String expected = "1-1-2019";
        assertEquals(expected,NextDayCalculator.nextDay(inputDay,inputMonth,inputYear));
    }
}