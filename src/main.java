public class main {
    public static void main (String[] args) {
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
        double[] outputArray2 = new double[inputArray2.length];

        // Используем for-each и отдельную переменную для индекса
        int index2 = 0;
        for (int payment : inputArray2) {
            outputArray2[index2] = payment * 0.13;
            index2++;
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
            System.out.printf("%.2f", outputArray2[i]);
            if (i < outputArray2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        //____________________________________Задача 3
        // Входной массив: бонусы сотрудников отдела продаж за январь
        int[] inputArray3 = {3500, 6200, 4800, 7100, 5000};

        // Выходной массив: флаги true/false
        boolean[] outputArray3 = new boolean[inputArray3.length];

        // Используем for-each и отдельную переменную для индекса
        int index3 = 0;
        for (int bonus : inputArray3) {
            outputArray3[index3] = bonus > 5000;
            index3++;
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

                // Выходной массив: один элемент — результат проверки (true/false)
                boolean[] outputArray4 = new boolean[1];

                // Проходим по массиву и ищем отрицательный баланс
                boolean hasOverdue = false;
                for (int balance : inputArray4) {
                    if (balance < 0) {
                        hasOverdue = true;
                        break; // Прерываем цикл сразу при обнаружении просрочки
                    }
                }
                outputArray4[0] = !hasOverdue; // true — просрочек не было, false — была хотя бы одна

                // Вывод inputArray4
                System.out.print("inputArray4: [");
                for (int i = 0; i < inputArray4.length; i++) {
                    System.out.print(inputArray4[i]);
                    if (i < inputArray4.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

                // Вывод outputArray4 как массива с одним элементом
                System.out.println("outputArray4: [" + outputArray4[0] + "]");


                //____________________________________Задача 5
                // Входной массив: чистая прибыль компании за месяц (5 элементов)
                int[] inputArray5 = {120000, -30000, 85000, 0, 45000};

                // Выходной массив: один элемент — количество рентабельных месяцев
                int[] outputArray5 = new int[1];

                // Считаем месяцы с прибылью больше нуля
                int profitableMonths = 0;
                for (int profit : inputArray5) {
                    if (profit > 0) {
                        profitableMonths++;
                    }
                }
                outputArray5[0] = profitableMonths;

                // Вывод inputArray5
                System.out.print("inputArray5: [");
                for (int i = 0; i < inputArray5.length; i++) {
                    System.out.print(inputArray5[i]);
                    if (i < inputArray5.length - 1) {
                        System.out.print(", ");
                    }
                }
                System.out.println("]");

                // Вывод outputArray5 как массива с одним элементом
                System.out.println("outputArray5: [" + outputArray5[0] + "]");
    }
}