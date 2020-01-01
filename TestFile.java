import java.util.Random;

public class TestFile {
    private static String generateRandomName() {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < 5; i++) {
            Random random = new Random();

            if (i < 2)
                stringBuilder.append((char) (random.nextInt(26) + 'A'));
            else
                stringBuilder.append(random.nextInt(10));
        }

        return stringBuilder.toString();
    }

    public static void main(String[] args) {
        String s = generateRandomName();

        System.out.println(s);
    }
}
