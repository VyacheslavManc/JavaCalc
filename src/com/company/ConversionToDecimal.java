package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ConversionToDecimal {

    String numbStr1;
    String numbStr2;
    int firstNum;
    int secondNumb;
    char sing;


    void conversionOfDec(String expression){

        try {

            expression = expression.replaceAll("\\s", "");
            Pattern num = Pattern.compile("[V][I][I][I]|[IV][I][I]|[IV][IVX]|[IVX]|[0-1][0]|[1-9]|\\D");
            Matcher matcher = num.matcher(expression);

            int i = 0;
            String[] stringsNumb = new String[3];
            while (matcher.find()) {

                stringsNumb[i] = matcher.group();
                i += 1;

            }

            numbStr1 = stringsNumb[0];
            numbStr2 = stringsNumb[2];
            sing = stringsNumb[1].charAt(0);
            boolean numb1 = numbStr1.matches("[0-1][0]|[1-9]");
            boolean numb2 = numbStr2.matches("[0-1][0]|[1-9]");
            if (numb1 == true & numb2 == true) {

                firstNum = Integer.parseInt(numbStr1);
                secondNumb = Integer.parseInt(numbStr2);


            }

            else {

                RomainToDecimal Let = new RomainToDecimal();
                Let.letterToNumber(numbStr1);
                firstNum = Let.decimal;
                Let.letterToNumber(numbStr2);
                secondNumb = Let.decimal;

            }

        }



        catch (NullPointerException e) {

            System.out.println("");
        }

        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Что то не так");
        }

    }

}

