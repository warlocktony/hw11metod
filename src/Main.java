public class Main {


    public static void main(String[] args) {
//        method for task 1
        chekLeapYear(403);
//        method for task 2
        int os = 0;
        int year = 2013;

        showClientOs(os, year);
//        method for task 3
        methodForTaskThree();
    }

    //        TASK 1
    public static void chekLeapYear(int year) {

        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.println("leap year");
        } else {
            System.out.println("Not leap year");
        }
    }

//            TASK 2

    public static void showClientOs(int clientOs, int clientDeviceYear) {


        if (clientOs == 0 && clientDeviceYear <= 2014) {
            System.out.println("Install the lite version of the iOS app by following the link");
        } else if (clientOs == 0 && clientDeviceYear >= 2015) {
            System.out.println("Install the IOS version of the app by following the link");
        }
        if (clientOs == 1 && clientDeviceYear <= 2014) {
            System.out.println("Install the lite version of the Android app by following the link");
        } else if (clientOs == 1 && clientDeviceYear >= 2015) {
            System.out.println("Install the Android version of the app by following the link");
        }
    }

    //        TASK 3
    public static void methodForTaskThree() {

        int days = calculatedDeliveryDays(150);

        if (days > 0) {
            System.out.println("delivery " + days + " day");
        } else {
            System.out.println("no delivery");
        }
    }

    public static int calculatedDeliveryDays(int distance) {

        int deliveryDays = 0;

        if (distance < 20) {
            deliveryDays = 1;
        } else if (distance < 60) {
            deliveryDays = 2;
        } else if (distance < 100) {
            deliveryDays = 3;
        } else {
            deliveryDays = -1;
        }

        return deliveryDays;

    }

}






