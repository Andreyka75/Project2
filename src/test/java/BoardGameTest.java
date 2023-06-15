import Module7SelfTraining.CorrectStream;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardGameTest {

    @Test
    public void summaryTest() {
        String a = "fhdgldfglfgj";
        int[] expectedResult = {0, 0, 0};
        String expectedResult1 = Arrays.toString(expectedResult);

        int[] actualResult = CorrectStream.calculateScores(a);
        String actualResult1 = Arrays.toString(actualResult);
                assertEquals(expectedResult1, actualResult1, "Summary result is incorrect");
    }
}
