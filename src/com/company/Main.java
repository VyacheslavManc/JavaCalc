package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        try {

            // Вводим выражение
            Scanner in = new Scanner(System.in);
            System.out.print("Enter expression: ");
            String expression = in.nextLine();

            // Присваиваем переменной conv экземпляг класса ConversionToDecimal и Вызываем метод класса.
            ConversionToDecimal conv = new ConversionToDecimal();
            conv.conversionOfDec(expression);

            boolean bSing = conv.singStr.matches("[+\\-/*]");
            if (!bSing) throw new Exception("Вы ввели не верный операнд");
            if (conv.numbStr1 != null & conv.numbStr2 != null) {

                boolean numb1 = conv.numbStr1.matches("\\d+");
                boolean numb2 = conv.numbStr2.matches("\\d+");


                // Если условие верно присваиваем переменной calc экземпляр класса CalcAction
                // и выводим значение метода action
                if (numb1 && numb2) {

                    if (conv.firstNum < 1 | conv.secondNumb <1) throw new Exception("Одно из значений меньше 1");
                    if (conv.firstNum > 10 | conv.secondNumb > 10) throw new Exception("Одно из значений больше 10");
                    CalcAction calc = new CalcAction();
                    System.out.println(calc.action(expression));

                }

                // Иначе если оба числа не являются арабскими выводим переконвертированное решение из класса DecimalToRomain
                else if (!numb1 & !numb2){
                    boolean numb3 = conv.numbStr1.matches("[V][I][I][I]|[IV][I][I]|[IV][IVX]|[IVX]");
                    boolean numb4 = conv.numbStr2.matches("[V][I][I][I]|[IV][I][I]|[IV][IVX]|[IVX]");
                    if (!numb3 | !numb4) throw new Exception("Не входит в диапазон I-X");
                    DecimalToRomain answer = new DecimalToRomain();
                    System.out.println(answer.conversion(expression));

                }
                // Если числа разные выводится сообщение
                else if (numb1 | numb2){
                    System.out.println("Выберете арабские либо римские цифры");
                }

            }

        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}