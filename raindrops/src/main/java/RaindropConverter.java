class RaindropConverter {

    String convert(int number) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                switch (i) {
                case 3:
                    stringBuilder.append("Pling");
                case 5:
                    stringBuilder.append("Plang");
                case 7:
                    stringBuilder.append("Plong");
                }
            }
        }
        if (stringBuilder.length() > 0)
            return stringBuilder.toString();
        else
            return Integer.toString(number);
    }
}
