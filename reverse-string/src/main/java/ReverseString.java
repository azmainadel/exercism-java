class ReverseString {

    String reverse(String inputString) {
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = inputString.length() - 1; i >=0; i--){
            stringBuilder.append(inputString.charAt(i));
        }

        return stringBuilder.toString();
    }
  
}