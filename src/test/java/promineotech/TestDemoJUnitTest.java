package promineotech;

import com.promineotech.TestDemo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.spy;

class TestDemoJUnitTest {
    private TestDemo testDemo;

    @BeforeEach
    void setUp() {
        testDemo = new TestDemo();
    }

    /**
     * Test that verifies the addPositive method correctly adds pairs of positive numbers.
     */
    @Test
    void assertThatPairsOfPositiveNumbersAreAddedCorrectly() {
        assertThat(testDemo.addPositive(4, 5)).isEqualTo(9);
        assertThat(testDemo.addPositive(80, 80)).isEqualTo(160);
        assertThat(testDemo.addPositive(16, 32)).isEqualTo(48);
    }

    /**
     * Test that verifies the subtractGreaterPositive method correctly subtracts a smaller number from a larger one.
     */
    @Test
    void assertThatACanSubtractBCorrectly() {
        assertThat(testDemo.subtractGreaterPositive(18, 9)).isEqualTo(9);
        assertThat(testDemo.subtractGreaterPositive(360, 180)).isEqualTo(180);
    }

    /**
     * Test that verifies the addPositive method throws an IllegalArgumentException when given non-positive numbers.
     */
    @Test
    void assertThatExceptionThrownWithNegativeNumbers() {
        assertThrows(IllegalArgumentException.class, () -> testDemo.addPositive(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> testDemo.addPositive(5, -1));
        assertThrows(IllegalArgumentException.class, () -> testDemo.addPositive(-1, -1));
    }

    /**
     * Test that verifies the subtractGreaterPositive method throws an IllegalArgumentException when given invalid inputs.
     */
    @Test
    void assertThatExceptionThrownWithInvalidInputForSubtraction() {
        assertThrows(IllegalArgumentException.class, () -> testDemo.subtractGreaterPositive(5, 10));
        assertThrows(IllegalArgumentException.class, () -> testDemo.subtractGreaterPositive(-1, 5));
        assertThrows(IllegalArgumentException.class, () -> testDemo.subtractGreaterPositive(5, -1));
    }

    @Test
    void assertThatNumberSquaredIsCorrect() {
        //Create a Spy of the testDemo object
        TestDemo mockDemo = spy(testDemo);

        //Mock the getRandomInt to return 5
        doReturn(5).when(mockDemo).getRandomInt();

        int fiveSquared = mockDemo.randomNumberSquared();

        assertThat(fiveSquared).isEqualTo(25);
    }
}