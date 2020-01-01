import java.util.List;
import java.util.stream.Collectors;

public class Allergies {
    int score;

    public Allergies(int score) {
        this.score = score;
    }

    public boolean isAllergicTo(Allergen allergen) {
        return (score & allergen.getScore()) != 0;
    }

    public List<Allergen> getList() {
        return Allergen.getStream().filter(allergen -> isAllergicTo(allergen)).collect(Collectors.toList());
    }
}