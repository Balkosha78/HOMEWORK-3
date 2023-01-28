public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
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
}