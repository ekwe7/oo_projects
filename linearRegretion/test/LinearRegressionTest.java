import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class LinearRegressionTest {
        private LinearRegression regression;
        private int[] valuesX;
        private int[] valuesY;
        private int numberOfDataPoints;

        @BeforeEach
        void setUp() {
            numberOfDataPoints = 7;
            valuesX = new int[]{1, 2, 3, 4, 5, 0, 4};
            valuesY = new int[]{2, 4, 6, 8, 10, 5, 7};
            regression = new LinearRegression(numberOfDataPoints, valuesY, valuesX);
        }

        @Test
        void ProductOfXAndYLength() {
            int[] result = regression.calculateProductOfXAndY();
            assertEquals(7, result.length);
        }

        @Test
        void productOfXandYwithZero() {
            int[] x = new int[]{0, 3, 4};
            int[] y = new int[]{5, 10, 15};

            LinearRegression zeroRegression = new LinearRegression(3, y, x);
            int[] result = zeroRegression.calculateProductOfXAndX();

            assertArrayEquals(new int[]{0, 9, 16}, result);
        }

        @Test
        void ProductOfXAndXWithNegativeNumbers() {
            int[] x = new int[]{-1, -3, 4};
            int[] y = new int[]{5, 10, 15};

            LinearRegression negativeRegression = new LinearRegression(3, y, x);
            int[] result = negativeRegression.calculateProductOfXAndX();

            assertArrayEquals(new int[]{1, 9, 16}, result);
        }


    }


