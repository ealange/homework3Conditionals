public class Main {
    public static void main(String[] args) {
    //задача 1
        System.out.println("Задача 1");
        byte clientOs = 1;
        if  (clientOs==0){
            System.out.println("Установите версию приложения для iOS по ссылке");

        } else {System.out.println("Установите версию приложения для Android по ссылке");}

    // задача 2
        System.out.println("Задача 2");
        short clientDeviceYear = 2013;
        if (clientDeviceYear<2015){
            System.out.print("Установите облегченную версию приложения для ");
            } else {System.out.print("Установите версию приложения для ");}
        if (clientOs==0){
            System.out.println("iOS по ссылке");
        } else {System.out.println("Android по ссылке");}

    // задача 3
        short year = 2000;
        int yearRemOfDivision400=year%400;
        int yearRemOfDivision100=year%100;
        int yearRemOfDivision4=year%4;
        if (yearRemOfDivision400==0){
            System.out.println(year+"-год високосный");
        } else {
            if(yearRemOfDivision4==0&&yearRemOfDivision100!=0){
                System.out.println(year+"Год високосный");
            } else {System.out.println(year+"-год не високосный");}
        }
    // задача 4
    int deliveryDistance = 95;
    int deliveryPeriod = 1;
    if (deliveryDistance>20){
        deliveryPeriod=deliveryPeriod+1;
    }
    if (deliveryDistance>60){
        deliveryPeriod=deliveryPeriod+1;
    }
        System.out.println("Потребуется "+deliveryPeriod+" дня доставки.");
    // задача 5
     byte   monthNumber = 12;
     switch (monthNumber){
         case 1:
         case 2:
         case 12:

     }

    }
}

