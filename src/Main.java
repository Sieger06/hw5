public class Main {
    public static void main(String[] args) {
       int clientOS = 0;
       int clientOSYear = 2021;
       if (clientOS == 0) {
           if (clientOSYear > 2015) {
               System.out.println("Установите версию приложения для iOS по ссылке");
           } else {
               System.out.println("Установите облегчённую версию приложения для iOS по ссылке");
           }
       } else {
           if (clientOSYear > 2015) {
               System.out.println("Установите версию приложения для Android по ссылке");
           } else {
               System.out.println("Установите облегчённую версию приложения для Android по ссылке");
           }
       }

        System.out.println();
        System.out.println("Задача 3");
        int year = 2020;
       if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
           System.out.println("Год является високосным");
       } else {
           System.out.println("Год не является високосным");
       }

        System.out.println();
        System.out.println("Задача 4");
        int deliveryDistance = 95;
        int deliveryDays = 1;
        if (deliveryDistance > 20){
            deliveryDays++;
        }
        if (deliveryDistance >60){
            deliveryDays++;
        }
        System.out.println("Дней потребуется " + deliveryDays);

        System.out.println();
        System.out.println("Задача 5");
        int mounthNumber = 12;
        switch (mounthNumber){
            case 1 :
                System.out.println("Зима");
                break;
            case 2 :
                System.out.println("Зима");
                break;
            case 3 :
                System.out.println("Весна");
                break;
            case 4 :
                System.out.println("Весна");
                break;
            case 5 :
                System.out.println("Весна");
                break;
            case 6 :
                System.out.println("Лето");
                break;
            case 7 :
                System.out.println("Лето");
                break;
            case 8 :
                System.out.println("Лето");
                break;
            case 9 :
                System.out.println("Осень");
                break;
            case 10 :
                System.out.println("Осень");
                break;
            case 11 :
                System.out.println("Осень");
                break;
            case 12 :
                System.out.println("Зима");
                break;
            default:
                System.out.println("Такого месяца не существует");
        }


    }
}
