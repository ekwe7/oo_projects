    public class LinearRegression {
        private int numberOfDataPoint;
        private int[] valuesOfY;
        private int[] valuesOfX;

        public LinearRegression(int numberOfDataPoint, int[] valuesOfY, int[] valuesX) {
            if (numberOfDataPoint != valuesX.length || numberOfDataPoint != valuesOfY.length) {
                throw new InvalidDatapointException("Data length must match number of data point");
            }
            this.numberOfDataPoint = numberOfDataPoint;
            this.valuesOfY = valuesOfY;
            this.valuesOfX = valuesX;
        }

        public int getNumberOfDataPoint() {
            return numberOfDataPoint;
        }

        public int[] getNumberOfY() {
            return valuesOfY;
        }

        public int[] getNumberOfX() {
            return valuesOfX;
        }

        public int[] calculateProductOfXAndY() {
            int[] xy = new int[numberOfDataPoint];
            for (int num = 0; num < numberOfDataPoint; num++) {
                xy[num] = valuesOfX[num] * valuesOfY[num];
            }
            return xy;
        }

        public int[] calculateProductOfXAndX() {
            int[] product = new int[numberOfDataPoint];
            for (int num = 0; num < numberOfDataPoint; num++) {
                product[num] = valuesOfX[num] * valuesOfX[num];
            }
            return product;
        }

        public int getSumOfNumbers(int[] numbers) {
            int sum = 0;
            for (int number : numbers) {
                sum += number;
            }
            return sum;
        }

    }

