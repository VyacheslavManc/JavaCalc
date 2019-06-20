package com.company;

public class CalcAction {

    public int action(String expression) {

        int answer = 0;
        ConversionToDecimal ctd = new ConversionToDecimal();
        ctd.conversionOfDec(expression);
        switch (ctd.sing) {

            case '+':
                answer = ctd.firstNum + ctd.secondNumb;
                break;

            case '-':
                answer = ctd.firstNum - ctd.secondNumb;
                break;

            case '*':
                answer = ctd.firstNum * ctd.secondNumb;
                break;

            case '/':
                answer = ctd.firstNum / ctd.secondNumb;
                break;

            default:
                System.out.println("You entered a wrong symbol");


        }

        return answer;
    }

}
