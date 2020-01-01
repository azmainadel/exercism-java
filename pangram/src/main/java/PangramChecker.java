import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PangramChecker {

    public boolean isPangram(String input) {
        if (input == null)
            return false;

        String strUpper = input.toUpperCase();

        Stream<Character> inputStream = strUpper.chars()
        .filter(c -> (c >= 'A' && c <= 'Z'))
        .mapToObj(c -> (char) c);

        Map<Character, Boolean> pangramMap = inputStream
                .collect(Collectors.toMap(c -> c, b -> Boolean.TRUE, (p1, p2) -> p1));

        return pangramMap.size() == 26;
    }
}
