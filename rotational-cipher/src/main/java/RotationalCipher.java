class RotationalCipher {
    private int shiftKey;

    RotationalCipher(int shiftKey) {
        if (shiftKey >= 26) {
            this.shiftKey = 0;
        } else {
            this.shiftKey = shiftKey;
        }
    }

    private char shiftCharacter(char ch) {
        if (Character.isUpperCase(ch)) {
            return (char)((ch - 'A' + shiftKey) % 26 + 'A');
        } else if (Character.isLowerCase(ch)) {
            return (char)((ch - 'a' + shiftKey) % 26 + 'a');
        }
        return ch;
    }

    String rotate(String data) {
        if (data != null) {
            char[] dataParts = data.toCharArray();

            for(int i = 0; i < dataParts.length; i++){
                char currentChar = dataParts[i];

                if(Character.isLetter(currentChar)){
                    dataParts[i] = shiftCharacter(currentChar);
                }
            }
            return new String(dataParts);
        }
        return null;
    }
    
}
