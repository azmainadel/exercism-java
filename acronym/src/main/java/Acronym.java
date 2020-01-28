import java.util.stream.Stream;
import static java.util.stream.Collectors.joining;

class Acronym {
    private static final String WORD_REGEX = "[^a-zA-Z]+";

    private final String result;

    Acronym(String phrase) {
        result = Stream.of(phrase.split(WORD_REGEX))
                .filter(s -> !s.isEmpty() && (s.length() > 1 || Character.isUpperCase(s.charAt(0))))
                .map(s -> s.charAt(0))
                .map(ch -> ch.toString().toUpperCase())
                .collect(joining());
    }

    String get() {
        return result;
    }
}
