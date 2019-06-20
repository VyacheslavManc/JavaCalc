package com.company;

public class DecimalToRomain{

    public String conversion(String expression){

        CalcAction act = new CalcAction();
        int answer = act.action(expression);

        String answerStr = "";
        while (answer >= 1){

            if (answer >= 1 & answer < 4) {

                String str = "I";
                answerStr = answerStr.concat(String.format("%" + answer + "s", str).replace(' ', 'I'));
                answer = 0;

            }
            if (answer == 4 | answer == 9){

                answerStr = answerStr.concat("I");
                answer += 1;

            }
            if (answer >= 5 & answer <= 8) {

                answerStr = answerStr.concat("V");
                answer -= 5;

            }
            if (answer >=10 & answer <= 39) {

                answerStr = answerStr.concat("X");
                answer -= 10;

            }
            if (answer >= 40 & answer <= 49){

                answerStr = answerStr.concat("X");
                answer += 10;

            }
            if (answer >= 50 & answer <= 89) {

                answerStr = answerStr.concat("L");
                answer -= 50;

            }
            if (answer >= 90 & answer <= 99) {

                answerStr = answerStr.concat("X");
                answer += 10;

            }
            if (answer >= 100){

                answerStr = answerStr.concat("C");
                answer -= 100;

            }
        }

        return answerStr;

    }
}



