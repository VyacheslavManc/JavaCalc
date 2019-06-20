package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Enter expression: ");
        String expression = in.nextLine();


        ConversionToDecimal conv = new ConversionToDecimal();
        conv.conversionOfDec(expression);

        try {

            boolean numb1 = conv.numbStr1.matches("[0-1][0]|[1-9]");
            boolean numb2 = conv.numbStr2.matches("[0-1][0]|[1-9]");
            if (numb1 == true & numb2 == true) {

                CalcAction calc = new CalcAction();
                System.out.println(calc.action(expression));

            }

            else if (numb1 == false & numb2 == false){

                DecimalToRomain answer = new DecimalToRomain();
                System.out.println(answer.conversion(expression));

            }

            else {
                System.out.println("Выберете арабские либо римские цифры");
            }

        }

        catch (NullPointerException e){

            System.out.println("Вы что то сделали не так");

        }

    }
}