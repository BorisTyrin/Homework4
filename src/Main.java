public class Main {
    public static void main(String[] args) {

        // Задание 1
        System.out.println("Задание 1");
        int age = 12;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием");
        } else {
            System.out.println("Возраст совершеннолетия ещё не наступил, и нужно немного подождать.");
        }

        // Задание 2
        System.out.println("Задание 2");
        if (age >= 7 && age < 18) {
            System.out.println("Ребёнок ходит в школу");
        } else if (age >= 18 && age < 24) {
            System.out.println("Человек ходит в университет");
        } else if (age >= 24) {
            System.out.println("Человек хотит на работу");
        }

        // Задание 3
        System.out.println("Задание 3");
        int seatsInTheCar = 102;
        int seatingPlaces = 60;
        int standingPlaces = seatsInTheCar - seatingPlaces;

        int seatingPlacesUsed = 60;
        int standingPlacesUsed = 31;
        if (seatingPlacesUsed < seatingPlaces) {
            System.out.println("Ещё осталось " + (seatingPlaces - seatingPlacesUsed) + " сидячих места");
        } else {
            System.out.println("Сидячих мест нет");
        }

        if (standingPlacesUsed < standingPlaces) {
            System.out.println("Ещё осталось " + (standingPlaces - standingPlacesUsed) + " стоячих места");
        } else {
            System.out.println("Стоячих мест нет");
        }

        // Задание 4.1
        System.out.println("Задание 4.1");

        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в детский сад");
        } else if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в школу");
        } else if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить в университет");
        } else if (age > 24) {
            System.out.println("Если возраст человека равен " + age + " , то ему нужно ходить на работу");
        }

        // Задание 4.2
        System.out.println("Задание 4.2");

        if (age < 5) {
            System.out.println("Ребёнок не может кататься на аттракционе.");
        } else if (age < 14) {
            System.out.println("Ребёнок может кататься на аттракционе в сопровождении взрослого.");
        } else {
            System.out.println("Ребёнок может кататься на аттракционе.");
        }

        // Задание 4.3
        System.out.println("Задание 4.2");

        int one = 5;
        int two = 20;
        int three = 3;
        if (one > two) {
            if (one >= two) {
            System.out.println("Максимальное число - " + one);
        } else {
            System.out.println("Максимальное число - " + three);
        }
    } else if (two > one) {
        if (two >= three) {
            System.out.println("Максимальное число - " + two);
        } else {
            System.out.println("Максимальное число - " + three);
        }
    } else {
        if (one > three) {
                System.out.println("Максимальное число - " + one);
        } else if (three > one) {
            System.out.println("Максимальное число - " + three);
        } else {
            System.out.println("Все 3 числа равны");
        }
        }
        }
}