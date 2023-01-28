public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
    }
    public static void task1() {
        System.out.println("Задача 1"); // Код задачи 1
        int alfa = 50000;
        byte beta = 10;
        short gamma = 11000;
        long zetta = 60L;
        float sigma = 1.1f;
        double delta = 5.0D;
        System.out.println("Значение переменной alfa с типом int равно " + alfa);
        System.out.println("Значение переменной beta с типом byte равно " + beta);
        System.out.println("Значение переменной gamma с типом short равно " + gamma);
        System.out.println("Значение переменной zetta с типом short равно " + zetta);
        System.out.println("Значение переменной sigma с типом short равно " + sigma);
        System.out.println("Значение переменной delta с типом short равно " + delta);
    }
    public static void task2() {
        System.out.println("Задача 2"); // Код задачи 2
        float alfa = 27.12f;
        long betta = 987678965549L;
        double gamma = 2.786;
        short sigma = 569;
        short omega = -159;
        int delta = 27897;
        byte zetta = 67;
        System.out.println(alfa);
        System.out.println(betta);
        System.out.println(gamma);
        System.out.println(sigma);
        System.out.println(omega);
        System.out.println(delta);
        System.out.println(zetta);
    }
    public static void task3() {
        System.out.println("Задача 3"); // Код задачи 3
        short ludmilaPavlovnaStudents = 23;
        short annaSergeevnaStudents = 27;
        short ekaterinaAndreevnaStudents = 30;
        short totalSheets = 480;
        int totalStudent = (ludmilaPavlovnaStudents + annaSergeevnaStudents + ekaterinaAndreevnaStudents); //общее кол-во учеников
        int perStudent = (totalSheets / totalStudent); // кол-во листов на 1 ученика
        System.out.println("На каждого ученика рассчитано " + perStudent + " листов бумаги");
    }
    public static void task4() {
        System.out.println("Задача 4"); // Код задачи 4
        int machinePerformance = 16;
        int machinePerformanceReference = (machinePerformance / 2); // производительность за мин.
        byte minutes = 20;
        int machinePerformanceMinut = (machinePerformanceReference * minutes); // за 20 мин.
        System.out.println("За " + minutes + " минут машина произвела " + machinePerformanceMinut + " штук бутылок");
        byte hour = 60;
        int day = (hour * 24); // перевод суток в мин.
        int machinePerformanceDay = (machinePerformanceReference * day); // производительность в сутки
        System.out.println("За сутки машина произвела " + machinePerformanceDay + " штук бутылок");
        int days = (day * 3);
        int machinePerformanceDays = (machinePerformanceReference * days); // за 3 дня
        System.out.println("За 3 дня машина произвела " + machinePerformanceDays + " штук бутылок");
        int month = (day * 30);
        int machinePerformanceMonth = (machinePerformanceReference * month); // за месяц
        System.out.println("За 1 месяц машина произвела " + machinePerformanceMonth + " штук бутылок");
    }
    public static void task5() {
        System.out.println("Задача 5"); // Код задачи 5
        byte totalCansPaint = 120;
        byte whitePaintClass = 2;
        byte brownPaintClass = 4;
        int classRoom = (whitePaintClass + brownPaintClass); // общее кол-во банок на класс
        int totalClass = (totalCansPaint / classRoom); // сколько всего классов
        int totalCanWhitePaint = (whitePaintClass * totalClass); // сколько белой
        int totalCanBrownPaint = (brownPaintClass * totalClass); // сколько коричневой
        System.out.println("В школе, где " + totalClass + " классов, нужно " + totalCanWhitePaint +
                " банок белой краски и " + totalCanBrownPaint + " банок коричневой краски");
    }
    public static void task6() {
        System.out.println("Задача 6"); // Код задачи 6
        byte banana = 5;
        short bananaWeight = 80;
        int bananaWeightTotal = (banana * bananaWeight); // расчет в граммах баннанов
        short milk = 2;
        short milkWeight = 105;
        int milkWeightTotal = (milk * milkWeight); // расчет в граммах молока
        byte iceCream = 2;
        short iceCreamWeight = 100;
        int iceCreamWeightTotal = (iceCream * iceCreamWeight); // расчет в граммах мороженного
        byte rawEgg = 4;
        short rawEggWeight = 70;
        int rawEggWeightTotal = (rawEgg * rawEggWeight); // расчет в граммах яиц
        int totalCoctailWeight = (bananaWeightTotal + milkWeightTotal + iceCreamWeightTotal + rawEggWeightTotal); // общий вес
        System.out.println("Общий вес спортивного завтрака = " + totalCoctailWeight + " грамм.");
        float totalCoctailWeightKG = (totalCoctailWeight / 1000f); // в кг.
        System.out.println("Общий вес спортивного завтрака = " + totalCoctailWeightKG + " кг.");
    }
}