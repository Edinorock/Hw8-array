public class Main {
    public static void main(String[] args) {
        // Задача №1
        System.out.println("Задача 1");

        int[] bigBox = new int[3];
        bigBox[0] = 1;
        bigBox[1] = 2;
        bigBox[2] = 3; // Целочисленный массив, заполненный тремя цифрами – 1, 2 и 3 – с помощью ключевого слова new

        double[] weight = {1.57, 7.654, 9.986}; // Массив, в котором можно хранить три дробных числа – 1.57, 7.654, 9.986 –  сразу заполнив его значениями

        int[] puk = {1, 7, 9,}; // Произвольный массив – тип и количество данных определите сами. Самостоятельно выберите способ создания массива: с помощью ключевого слова или сразу заполненный элементами

        // Задача №2
        System.out.println("Задача 2");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        System.out.print(numbers[0] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[2] + " "); // В консоль выведены все элементы первого массива в верном порядке через запятую

        double[] weights = {1.57, 7.654, 9.986};
        System.out.println(" ");
        for (int i = 0; i < 3; i++) {
            if (i == weights.length - 1) {
                System.out.println(weights[i]);
            } else {
                System.out.print(weights[i] + ", ");
            }
        } // В консоль выведены все элементы второго массива в верном порядке через запятую

        int[] puk2 = {1, 7, 9,};
        for (int i = 0; i < 3; i++) {
            if (i == puk2.length - 1) {
                System.out.println(puk2[i]);
            } else {
                System.out.print(puk2[i] + ", ");
            }
        } // В консоль выведены все элементы третьего массива в верном порядке через запятую

        // На одной строчке расположены элементы только одного массива


        // Задача №3
        System.out.println("Задача 3");
        int[] smallBox = new int[3];
        smallBox[0] = 1;
        smallBox[1] = 2;
        smallBox[2] = 3;
        System.out.print(numbers[2] + ", ");
        System.out.print(numbers[1] + ", ");
        System.out.print(numbers[0] + " "); // В консоль выведены все элементы первого массива в обратном порядке через запятую


        double[] weight2 = {1.57, 7.654, 9.986};
        System.out.println(" ");
        for (int i = weight2.length - 1; i > -1; i--) {
            if (i == 0) {
                System.out.println(weight2[i]);
            } else {
                System.out.print(weight2[i] + ", ");
            }
        } // В консоль выведены все элементы второго массива в обратном порядке через запятую

        int[] puk3 = {1, 7, 9,};
        for (int i = puk3.length - 1; i > -1; i--) {
            if (i == 0) {
                System.out.println(puk3[i]);
            } else {
                System.out.print(puk3[i] + ", ");
            }
        } // В консоль выведены все элементы третьего массива в обратном порядке через запятую
        // На одной строчке расположены элементы только одного массива

        // Задача №4
        System.out.println("Задача 4");
        // Пройдитесь по первому целочисленному массиву и все нечетные числа в нем сделайте четными (нужно прибавить 1)
        int[] middleBox = new int[3];
        middleBox[0] = 1;
        middleBox[1] = 2;
        middleBox[2] = 3;
        for (int i = 0; i <= 3; i++) {
            if (i % 2 == 0 || i == 0) {
                middleBox[i] = middleBox[i] + 1; // Все нечетные числа в целочисленном массиве четные с помоущью прибавления 1
                System.out.print(middleBox[i] + " "); // В консоли распечатан только целочисленный массив
            }
        }


    }
}