// Eugen Grünwald
// Cohort 54.1
// homework_03


package homework;

public class Homework_03 {
    public static void main(String[] args) {

        // Task 1

        /*
        В классе HomeWork03 задекларировать (объявить) и присвоить значения 3-м переменным. Правильно подберите тип и имя переменным.

        Переменная 1 - сколько Вам полных лет
        Переменная 2 - должна хранить стоимость 1 литра молока в Вашей стране (без наименования валюты - только цена)
        Переменная 3 - Ваше имя (Опционально, так как мы с вами не учили, в каком типе данных хранить можно хранить текст. (Гугл?))
         */

        int age = 48;
        int priceMilk = 2;
        String myName = " Eugen Grünwald ";

        System.out.println(" Age = " + age);
        System.out.println(" Milk Price = " + priceMilk);
        System.out.println(" My Name = " + myName);

        System.out.println("=======================\n");

        // Task 2

        /*
        Объявите 4 переменных типа int со значениями 0, 1, 2, 3.
        Объявите ещё одну переменную int и сохраните в неё сумму этих переменных, деленную на 4. Получается, у вас будет среднее арифметическое этих чисел в одной переменной.
        Выведите на экран значение переменной.
        Какой остаток от деления программа "потеряла"?
         */

        int a = 0;
        int b = 1;
        int c = 2;
        int d = 3;

        int z = (a + b + c + d) / 4;

        int rest = (a + b + c + d) % 4;
        // остаток = 2

        System.out.println( "Среднее число = " + z );
        System.out.println( "Oстаток деления на 4 = " + rest );



        System.out.println("=======================\n");

        // Task 3*

        /*
        Пусть цена товара A составляет 1000 Euro, а товара B составляет 500 Euro.

        Если клиент покупает товары вместе, то на них действует скидка 10% на всю покупку.

        Выведите на экран значение переменной, которая соответствует стоимости товаров A+B со скидкой.
        тдельно выведите на экран сумму скидки для этой покупки (в деньгах).
         */

        double priceA = 1000;
        double priceB = 500;

        double discount = 10;

        double discountMoney = (priceA + priceB) * discount / 100;

        double priceWithDiscount = priceA + priceB - discountMoney; // сумма товаров минус скидка

        double priceWithDiscount2 = (priceA + priceB) * (100 - discount) / 100; // сумма товаров минус скидка (второй вариант подсчёта)




        System.out.println( "discountMoney: " + discountMoney);
        System.out.println("priceWithDiscount " + priceWithDiscount); // сумма товаров минус скидка
        System.out.println("priceWithDiscount2 " + priceWithDiscount2); // сумма товаров минус скидка (второй вариант подсчёта)

        System.out.println("=======================\n");

        // Task 3*

        /*
        Найдите в Интернете данные по температуре в вашем городе за прошедшую неделю (или придумайте :) ).

        Вычислите среднюю температуру за неделю и выведете ее на печать.
         */

        int t = 19;
        int t1 = 22;
        int t2 = 25;
        int t3 = 23;
        int t4 = 28;
        int t5 = 21;
        int t6 = 24;

        int days = 7;

        int sumTemp = t + t1 + t2 + t3 + t4 + t5 + t6; // сумма всех чисел
        System.out.println("sumtemp: " + sumTemp);

        // Todo разобраться с потерей дробной части

        // 162 / 7 = 23 и 1 в остатке
        // 162.0 / 7 = 23.142
        // average - средняя, Temp - температура
        double averageTemp = (double) sumTemp / days;

        System.out.println("averageTemp: " + averageTemp);


        System.out.println("=======================\n");

        // Task 4

    /*
    Какие числа могут получаться в качестве остатка от деления какого-либо целого числа на 2? На 3?

    Чётные делятся на 2 без остатка, а нечётные дают остаток 1.

    Не делящиеся на 3 числа могут быть двух видов: одни
    дают остаток 1 , а другие дают остаток 2 .
     */

    }
}
