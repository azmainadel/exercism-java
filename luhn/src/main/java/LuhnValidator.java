//TODO: Unsolved

class LuhnValidator {

    boolean isValid(String candidate) {
        candidate = candidate.replaceAll("[^0-9]", "");

        if (candidate.length() <= 1) {
            return false;
        } else {
            int checksum = 0;
            boolean isSecond = false;

            for (int i = candidate.length() - 1; i >= 0; i--) {
                int val = Character.getNumericValue(candidate.charAt(i));
                
                if (isSecond) {
                    checksum += ((val * 2) > 9) ? (val * 2) - 9 : (val * 2);
                } else {
                    checksum += val;
                }

                isSecond = !isSecond;
            }

            return (checksum % 10 == 0);
        }
    }
}
