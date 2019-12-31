class IsbnVerifier {

    boolean isValid(String stringToVerify) {
        if (stringToVerify.length() > 0) {
            if (stringToVerify.charAt(stringToVerify.length() - 1) == 'X')
                stringToVerify = stringToVerify.replaceAll("[^X0-9]", "");
            else
                stringToVerify = stringToVerify.replaceAll("[^0-9]", "");

            if (stringToVerify.length() != 10)
                return false;

            int isbnTotal = 0;
            for (int i = 10; i >= 1; i--) {
                int currentDigit = stringToVerify.charAt(10 - i) == 'X' ? 10
                        : Character.getNumericValue(stringToVerify.charAt(10 - i));

                isbnTotal += currentDigit * i;
            }

            return isbnTotal % 11 == 0;
        }
        return false;
    }
}
