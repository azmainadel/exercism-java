class RnaTranscription {

    String transcribe(String dnaStrand) {
        if (dnaStrand.length() > 0) {
            StringBuilder rnaBuilder = new StringBuilder();

            for (int i = 0; i < dnaStrand.length(); i++) {
                switch (dnaStrand.charAt(i)) {
                case 'G':
                    rnaBuilder.append('C');
                    break;
                case 'C':
                    rnaBuilder.append('G');
                    break;
                case 'T':
                    rnaBuilder.append('A');
                    break;
                case 'A':
                    rnaBuilder.append('U');
                    break;
                }
            }

            return rnaBuilder.toString();
        }

        return dnaStrand;
    }

}
