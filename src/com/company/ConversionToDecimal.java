package com.company;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Этот класс разбивает введенное строковое выражение на составные части
// и переводит числа из строкового типа в целочисленный
public class ConversionToDecimal {

    // В переменные numbStr1 и numbStr2 записываются числа в строковом типе и передаются в main для проверки условия
    String numbStr1;
    String numbStr2;
    String singStr;
    int firstNum;
    int secondNumb;
    char sing;


    void conversionOfDec(String expression){

        try {
            // Убераем все пробелы в строке
            expression = expression.replaceAll("\\s", "");
            // Задаем шаблон для поиска
            Pattern num = Pattern.compile("[IVX][IVX][IVX][IVX]|[IVX][IVX][IVX]|[IVX][IVX]|\\b\\d+\\b|\\D");
            // используя шаблон ищем в строкеримские цифры либо целые либо знаки
            Matcher matcher = num.matcher(expression);
            // Цикл нужен для построчного вывода отдельных значений строки и записи в массив
            int i = 0;
            String[] stringsNumb = new String[3];
            while (matcher.find()) {

                stringsNumb[i] = matcher.group();
                i += 1;

            }
            numbStr1 = stringsNumb[0];
            numbStr2 = stringsNumb[2];
            singStr = stringsNumb[1];

            if (numbStr1 == null | numbStr2 == null) {
                System.out.println("Одно из значений не указано или указано не верно");
            }
            else {

                sing = stringsNumb[1].charAt(0);

                boolean numb1 = numbStr1.matches("\\d+");
                boolean numb2 = numbStr2.matches("\\d+");

                if (numb1 && numb2) {

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


        }
        catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Исключение:" + e);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

}

