public class Atbash {
    public static final String CHAR_REGEX = "[^A-Za-z0-9]";
    public static final String REVERSE_ALPHABET = "zyxwvutsrqponmlkjihgfedcba";

    public Atbash() {
    }

    private String cleanInput(String input) {
        String output = input.replaceAll(CHAR_REGEX, "");

        return output.toLowerCase();
    }

    public String encode(String input) {
        String simplifiedInput = cleanInput(input);
        StringBuilder outputBuilder = new StringBuilder();

        for (int i = 0; i < simplifiedInput.length(); i++) {
            if (Character.isDigit(simplifiedInput.charAt(i))) {
                outputBuilder.append(simplifiedInput.charAt(i));
            } else {
                outputBuilder.append(REVERSE_ALPHABET.charAt(simplifiedInput.charAt(i) - 'a'));
            }

            if ((i + 1) < simplifiedInput.length() && (i + 1) % 5 == 0)
                outputBuilder.append(" ");
        }

        return outputBuilder.toString();
    }

    public String decode(String input) {
        String simplifiedInput = cleanInput(input);
        StringBuilder outputBuilder = new StringBuilder();

        for (int i = 0; i < simplifiedInput.length(); i++) {
            if (Character.isDigit(simplifiedInput.charAt(i))) {
                outputBuilder.append(simplifiedInput.charAt(i));
            } else {
                outputBuilder.append(REVERSE_ALPHABET.charAt(simplifiedInput.charAt(i) - 'a'));
            }
        }

        return outputBuilder.toString();
    }
}