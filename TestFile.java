import java.util.HashMap;
import java.util.Map;

public class TestFile {
    static class ArmstrongNumbers {

        boolean isArmstrongNumber(int numberToCheck) {
            int numberOfDigits = String.valueOf(numberToCheck).length();
            int armstrongValue = 0;
            int temp = numberToCheck;

            while (temp != 0) {
                armstrongValue += Math.pow(temp % 10, numberOfDigits);
                temp /= 10;
            }

            return armstrongValue == numberToCheck;
        }
    }

    public static void main(String[] args) {
        ArmstrongNumbers armstrongNumbers = new ArmstrongNumbers();

        System.out.println(armstrongNumbers.isArmstrongNumber(9474));
    }
}
