import java.util.Random;

public class Robot {
    private String name;
    private boolean isBooted;

    public Robot() {
        this.name = generateRandomName();
        this.isBooted = true;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        if (!isBooted) {
            this.name = generateRandomName();
        }
        return this.name;
    }

    public void reset() {
        this.name = "";
        this.isBooted = false;
    }

    private String generateRandomName() {
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
}