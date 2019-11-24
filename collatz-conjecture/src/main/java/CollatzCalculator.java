class CollatzCalculator {

    int computeStepCount(int start) {
        if (start > 0) {
            int stepCount = 0;

            while (start != 1) {
                if (start % 2 == 0) {
                    start /= 2;
                    stepCount++;
                } else {
                    start = (3 * start) + 1;
                    stepCount++;
                }
            }

            return stepCount;
        } else {
            throw new IllegalArgumentException("Only natural numbers are allowed");
        }
    }

}
