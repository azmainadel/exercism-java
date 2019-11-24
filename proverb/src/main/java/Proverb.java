class Proverb {
    private String[] words;

    Proverb(String[] words) {
        this.words = words;
    }

    String recite() {
        StringBuilder stringBuilder = new StringBuilder();

        if(words.length == 0) return "";
        
        for (int i = 0; i < words.length - 1; i++) {
            stringBuilder.append("For want of a " + words[i] + " the " + words[i + 1] + " was lost.\n");
        }
        stringBuilder.append("And all for the want of a " + words[0] + ".");

        return stringBuilder.toString();
    }
}
