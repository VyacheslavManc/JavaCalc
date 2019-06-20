package com.company;

public class RomainToDecimal {

    int decimal = 0;
    int lastNumber = 0;

    void letterToNumber (java.lang.String romanNumber) {

        decimal = 0;
        lastNumber = 0;

        String romanNumeral = romanNumber.toUpperCase();

        for (int x = romanNumeral.length() - 1; x >= 0 ; x--){

            char convertToDecimal = romanNumeral.charAt(x);

            switch (convertToDecimal) {

                case 'I':
                    decimal = processDecimal(1, lastNumber, decimal);
                    lastNumber = 1;
                    break;
                case 'V':
                    decimal = processDecimal(5, lastNumber, decimal);
                    lastNumber = 5;
                    break;
                case 'X':
                    decimal = processDecimal(10, lastNumber, decimal);
                    lastNumber = 10;
                    break;

            }

        }

    }

    public static int processDecimal(int decimal, int lastNumber, int lastDecimal) {
        if (lastNumber > decimal) {
            return lastDecimal - decimal;
        } else {
            return lastDecimal + decimal;
        }
    }

}
