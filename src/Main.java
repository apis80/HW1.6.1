public class Main {
    public static void main(String[] args) {
        String firstName = "Ivan ";
        String secondName = "Ivanovich ";
        String lastName = "Ivanov ";
        String fullName = lastName + firstName + secondName;
        System.out.println(" ФИО сотрудника - " + fullName);
        // Задача 2
        String bigName = fullName.replace("Ivanov Ivan Ivanovich", " IVANOV IVAN IVANOVICH");
        System.out.println("Данные ФИО сотрудника для заполнения отчета — " + bigName);
        // Задача 3
        String fullName1 = "Иванов Семён Семёнович";
        String fullName2 = fullName1.replace("ё", "е");
        System.out.println("Данные ФИО сотрудника — " + fullName2);


    }
}
