class ArmstrongNumbers {

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
