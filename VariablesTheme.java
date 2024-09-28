public class VariablesTheme {
    public static void main(String[] args) {
        // TODO Вывести в консоль характеристики компьютера с помощью примитивов
        String header1 = "\n1. Вывод характеристик компьютера\n";
        System.out.println(header1);

        // Целое число, для диапазона значений от -128 до 127
        byte corseNumber = 8;
        System.out.println("Количество ядер" + " = " + corseNumber);

        // Целое число, для диапазона значений от -32_768 до 32_767
        short ram = 16_384;
        System.out.println("Оперативная память (в мегабайтах)" + " = " + ram + " Мб");

        // Целое число, для диапазона значений -2_147_483_648 до 2_147_483_647
        int powerSupply = 300_000;
        System.out.println("Мощность БП (в милливаттах)" + " = " + powerSupply + " мВт");

        // Целое число, для диапазона значений от
        // -9_223_372_036_854_775_808 до 9_223_372_036_854_775_807
        long hardDrive = 10_737_418_240L;
        System.out.println("Объём жёсткого диска (в килобайтах)" + " = " + hardDrive + " Кб");

        // Вещественное число, дробь
        float procFrequency = 2.6f;
        System.out.println("Частота процессора (в гигагерцах)" + " = " + procFrequency + " Hhz");

        // Вещественное число двойной точности
        double procFrequencyMhz = 2_599.999_999d;
        System.out.println("Частота процессора (в мегагерцах)" + " = " + procFrequencyMhz + " Mhz");

        // Символ
        char signAt = '@';
        System.out.println("Символ коммерческой At" + " = " + signAt);

        // Логическое значение
        boolean sold = true;
        System.out.println("Компьютер продан?" + " = " + sold);

        // TODO Вывести в консоль стоимости товаров со скидкой и без
        String header2 = "\n2. Расчёт стоимости товаров со скидкой\n";
        System.out.println(header2);

        // Стоимость ручки
        float penCost = 105.5f;

        // Стоимость книжки
        float bookCost = 235.83f;

        // Скидка на оба товара вместе
        float discount = 0.11f;

        // Сумма стоимости товаров без скидки
        float sumProducts = penCost + bookCost;
        System.out.println("Сумма стоимости товаров без скидки" + " = " + sumProducts);

        // Суммарная скидка
        float sumDiscount = sumProducts * discount;
        System.out.println("Сумма скидок" + " = " + sumDiscount);

        // Стоимость товаров со скидкой
        float prodDiscount = sumProducts - sumDiscount;
        System.out.println("Стоимость товаров со скидкой" + " = " + prodDiscount);

        // TODO Вывести в консоль слова JAVA
        /* String header3 = "\n3. Вывод слова JAVA\n";
        System.out.println(header3 + "\n    J    a  v     v  a\n    J   a a  v   v  a a");
        System.out.println(" J  J  aaaaa  V V  aaaaa\n  JJ  a     a  V  a     a");
        */

        // TODO Вывести в консоль слова JAVA
        String header3 = "\n3. Вывод слова JAVA\n";
        System.out.println(header3 + "\n    J    a  v     v  a\n    J   a a  v   v  a a" +
                "\n J  J  aaaaa  V V  aaaaa\n  JJ  a     a  V  a     a");

        // TODO Вывод min и max значений целых числовых типов
        String header4 = "\n4. Вывод min и max значений целых числовых типов\n";
        System.out.println(header4);

        // Примитив Byte
        byte x = 127;
        System.out.println("Максимальное значение переменной byte" + " = " + x);

        // Примитив Byte с инкрементом
        x++;
        System.out.println("Примитив byte: инкремент" + " = " + x);

        // Примитив Byte с декрементом
        x--;
        x--;
        System.out.println("Примитив byte: декремент" + " = " + x);

        // Примитив short
        short y = 32_767;
        System.out.println("\nМаксимальное значение переменной short" + " = " + y);

        // Примитив short с инкрементом
        y++;
        System.out.println("Примитив short: инкремент" + " = " + y);

        // Примитив short с декрементом
        y--;
        y--;
        System.out.println("Примитив short: декремент" + " = " + y);

        // Примитив int
        int z = 2_147_483_647;
        System.out.println("\nМаксимальное значение переменной int" + " = " + z);

        // Примитив int с инкрементом
        z++;
        System.out.println("Примитив int: инкремент" + " = " + z);

        // Примитив int с декрементом
        z--;
        z--;
        System.out.println("Примитив int: декремент" + " = " + z);

        // Примитив long
        long w = 9_223_372_036_854_775_807L;
        System.out.println("\nМаксимальное значение переменной long" + " = " + w);

        // Примитив long с инкрементом
        w++;
        System.out.println("Примитив long: инкремент" + " = " + w);

        // Примитив long с декрементом
        w--;
        w--;
        System.out.println("Примитив long: декремент" + " = " + w);

        // TODO Перестановка значений переменных
        String header5 = "\n5. Перестановка значений переменных\n";
        System.out.println(header5);

        // Первая и вторая переменные
        int a = 2;
        int b = 5;
        System.out.println("Исходные переменные:\n" + "a" + " = " + a + "\nb" + " = " + b);

        // Перестановка с помощью третьей переменной
        int temp = b; // 5
        b = a; // 2
        a = temp; // 5
        System.out.println("\nТретья переменная\n" + "a" + " = " + a + "\nb" + " = " + b);

        // Перестановка с помощью арифметических операций
        b = a + b; // 7
        a = b - a; // 2
        b = b - a; // 5
        System.out.println("\nАрифметическая операция\n" + "a" + " = " + a + "\nb" + " = " + b);

        // Перестановка с помощью побитовой операции
        b = a ^ b; // 10^101 = 111 (7)
        a = b ^ a; // 111^010 = 101 (5)
        b = b ^ a; // 111^101 = 010 (2)
        System.out.println("\nПобитовая операция\n" + "a" + " = " + a + "\nb" + " = " + b);

        // TODO Вывод символов и их кодов
        String header6 = "\n6. Вывод символов и их кодов\n";
        System.out.println(header6);

        char dollar = '$';
        int value1 = dollar;
        System.out.println("Символ" + " = " + '$' + "\nКод" + " = " + value1);

        char star = '*';
        int value2 = star;
        System.out.println("\nСимвол" + " = " + '*' + "\nКод" + " = " + value2);

        char dog = '@';
        int value3 = dog;
        System.out.println("\nСимвол" + " = " + '@' + "\nКод" + " = " + value3);

        char vertical = '|';
        int value4 = vertical;
        System.out.println("\nСимвол" + " = " + '|' + "\nКод" + " = " + value4);

        char tilda = '~';
        int value5 = tilda;
        System.out.println("\nСимвол" + " = " + '~' + "\nКод" + " = " + value5);

        // TODO Вывод в консоль ASCII-арт Дюка
        String header7 = "\n7. Вывод в консоль ASCII-арт Дюка\n";
        System.out.println(header7);

        char rightSlash = '/';
        char leftSlash = '\\';
        char underline = '_';
        char leftBracket = '(';
        char rightBracket = ')';
        System.out.println("    " + rightSlash + leftSlash + "\n   " + rightSlash + "  " +
                leftSlash + "\n  " + rightSlash + underline + leftBracket + " " + rightBracket +
                leftSlash + "\n " + rightSlash + "      " + leftSlash + "\n" + rightSlash +
                underline + underline + underline + underline + rightSlash + leftSlash +
                underline + underline + leftSlash);

        // TODO Вывод символов и их кодов
        String header8 = "\n8. Манипуляции с сотнями, десятками и единицами числа\n";
        System.out.println(header8);

        String splitNumber = "Число 123 содержит:"; // Подзаголовок
        int n = 123; // целевое число
        int x3 = n % 1000 / 100; // сотни
        int x2 = n % 100 / 10; // десятки
        int x1 = n % 10; // единицы
        int summary = x1 + x2 + x3; // сумма
        int multiply = x1 * x2 * x3; // произведение
        System.out.println(splitNumber + "\n  сотен - " + x3 + "\n  десятков: - " + x2 +
                "\n  единицы - " + x1 + "\nСумма разрядов" + " = " + summary +
                "\nПроизведение разрядов" + " = " + multiply);

        // TODO Перевод секунд в часы, минуты и секунды
        String header9 = "\n9. Перевод секунд в часы, минуты и секунды\n";
        System.out.println(header9);

        /*
        Перевод секунд в часы, минуты и секунды
        имеется 86399 сек.
        переведите это значение в часы, минуты и секунды
        используйте для этого только операции / и %
        выведите в консоль значения в формате ЧЧ:ММ:СС

        */
    }
}