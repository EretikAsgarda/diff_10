public class main {
    public static void main(String[] args) {

         //____________________________________Задача 1
        // Входной массив: выплаты авторам контента (5 элементов)
        int[] inputArray1 = {15000, 8000, 22000, 12000, 30000};

        // Переменные для расчётов
        int sum = 0;
        int max = inputArray1[0];
        int min = inputArray1[0];

        // Проходим по массиву и считаем сумму, ищем максимум и минимум
        for (int payment : inputArray1) {
            sum += payment;
            if (payment > max) {
                max = payment;
            }
            if (payment < min) {
                min = payment;
            }
        }


        // Среднее значение может быть дробным, поэтому используем double
        double average = (double) sum / inputArray1.length;

        // Выходной массив: [сумма, максимум, минимум, среднее]
        // Используем Object[], чтобы хранить и int, и double в одном массиве
        Object[] outputArray1 = {sum, max, min, average};

        // Вывод inputArray1
        System.out.print("inputArray1: [");
        for (int i = 0; i < inputArray1.length; i++) {
            System.out.print(inputArray1[i]);
            if (i < inputArray1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Вывод outputArray1
        System.out.print("outputArray1: [");
        for (int i = 0; i < outputArray1.length; i++) {
            System.out.print(outputArray1[i]);
            if (i < outputArray1.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");




        //____________________________________Задача 2

        // Входной массив: выплаты сотрудникам по ТК РФ (5 элементов)
        int[] inputArray2 = {45000, 62000, 38000, 51000, 70000};

        // Выходной массив: налог 13% для каждой выплаты
        // Используем double[], потому что налог может быть дробным
        double[] outputArray2 = new double[inputArray2.length];

        // Рассчитываем налог 13% для каждой выплаты
        for (int i = 0; i < inputArray2.length; i++) {
            outputArray2[i] = inputArray2[i] * 0.13;
        }

        // Вывод inputArray2
        System.out.print("inputArray2: [");
        for (int i = 0; i < inputArray2.length; i++) {
            System.out.print(inputArray2[i]);
            if (i < inputArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Вывод outputArray2
        System.out.print("outputArray2: [");
        for (int i = 0; i < outputArray2.length; i++) {
            // Форматируем до 2 знаков после запятой для наглядности
            System.out.printf("%.2f", outputArray2[i]);
            if (i < outputArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");


        //____________________________________Задача 3
        // Входной массив: бонусы сотрудников отдела продаж за январь
        int[] inputArray3 = {3500, 6200, 4800, 7100, 5000};

        // Выходной массив: флаги true/false (тип boolean[])
        boolean[] outputArray3 = new boolean[inputArray3.length];

        // Заполняем outputArray3: true, если бонус > 5000, иначе false
        for (int i = 0; i < inputArray3.length; i++) {
            outputArray3[i] = inputArray3[i] > 5000;
        }

        // Вывод inputArray3
        System.out.print("inputArray3: [");
        for (int i = 0; i < inputArray3.length; i++) {
            System.out.print(inputArray3[i]);
            if (i < inputArray3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Вывод outputArray3
        System.out.print("outputArray3: [");
        for (int i = 0; i < outputArray3.length; i++) {
            System.out.print(outputArray3[i]);
            if (i < outputArray3.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");



        //____________________________________Задача 4
        // Входной массив: остаток на кредитном счёте клиента в начале каждого месяца
        int[] inputArray4 = {1500, 2300, -400, 800, 1200};

        // Выходной результат: true — просрочек не было, false — была хотя бы одна
        boolean outputArray4 = true;

        // Проходим по массиву и ищем отрицательный баланс
        for (int balance : inputArray4) {
            if (balance < 0) {
                outputArray4 = false;
                break; // Прерываем цикл сразу при обнаружении просрочки — это и есть «максимально быстро»
            }
        }

        // Вывод inputArray4
        System.out.print("inputArray4: [");
        for (int i = 0; i < inputArray4.length; i++) {
            System.out.print(inputArray4[i]);
            if (i < inputArray4.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Вывод outputArray4
        System.out.println("outputArray4: " + outputArray4);



        //____________________________________Задача 5
        // Входной массив: чистая прибыль компании за месяц (5 элементов)
        int[] inputArray5 = {120000, -30000, 85000, 0, 45000};

        // Выходной результат: количество рентабельных месяцев (прибыль > 0)
        int outputArray5 = 0;

        // Считаем месяцы с прибылью больше нуля
        for (int profit : inputArray5) {
            if (profit > 0) {
                outputArray5++;
            }
        }

        // Вывод inputArray5
        System.out.print("inputArray5: [");
        for (int i = 0; i < inputArray5.length; i++) {
            System.out.print(inputArray5[i]);
            if (i < inputArray5.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

        // Вывод outputArray5
        System.out.println("outputArray5: " + outputArray5);
    }
}