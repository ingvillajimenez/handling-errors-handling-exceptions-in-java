public class HandlingExceptions {

    public static void main(String[] args) {

        double[] prices = {5.90, 18.99, 64.0, 99.00, 79.50};

        int index = 5;

        System.out.println("Start of the program");

        try {
            System.out.format("\nThe price at index %s is %f\n", index, prices[index]); //java.lang.ArrayIndexOutOfBoundsException
        }
        catch (NullPointerException npe) {

            System.out.println("We never get here - the wrong Exception has been caught");
        }

        System.out.println("End of the program");

    }

//    public static void main(String[] args) {
//
//        double[] prices = {5.90, 18.99, 64.0, 99.00, 79.50};
//
//        int index = 5;
////        int index = -2;
//
//        System.out.println("Start of the program");
//
//        try {
//            System.out.format("\nThe price at index %s is %f\n", index, prices[index]); //java.lang.ArrayIndexOutOfBoundsException
//        }
//        catch (ArrayIndexOutOfBoundsException ex) {
//
//            System.out.println("An Exception occurred: " + ex.getClass());
//            System.out.println("You have exceeded the array bounds.");
//
//            if (index < 0) {
//
//                System.out.println("The first price in the array is: " + prices[0]);
//            }
//            else {
//                System.out.println("The last price in the array is: "
//                        + prices[prices.length - 1]);
//            }
//
//        }
//
//        System.out.println("End of the program");
//
//    }

//    public static void main(String[] args) {
//
//        double[] prices = {5.90, 18.99, 64.0, 99.00, 79.50};
//
//        int index = 5;
//
//        System.out.println("Start of the program");
//
//        try {
//            System.out.format("\nThe price at index %s is %f\n", index, prices[index]); //java.lang.ArrayIndexOutOfBoundsException
//        }
//        catch (Exception e) {
//
//            System.out.println("An Exception occurred");
//
//            System.out.println("Is e an Object? " + (e instanceof Object));
//            System.out.println("Is e a Throwable? " + (e instanceof Throwable));
//            System.out.println("Is e an Exception? " + (e instanceof Exception));
//            System.out.println("Is e a RuntimeException? " +
//                    (e instanceof RuntimeException));
//            System.out.println("Is e an ArrayIndexOutOfBoundsException? " +
//                    (e instanceof ArrayIndexOutOfBoundsException));
//
//            System.out.println("Is e an ArithmeticException? " +
//                    (e instanceof ArithmeticException));
//            System.out.println("Is e a StringIndexOutOfBoundsException? " +
//                    (e instanceof StringIndexOutOfBoundsException));

//            System.out.println("The Exception class: " + e.getClass());
//            System.out.println("The Exception message: " + e.getMessage());
//            System.out.println("The Exception localized message: " + e.getLocalizedMessage());
//            System.out.println("The Exception cause: " + e.getCause());


//        }
//
//        System.out.println("End of the program");
//
//    }
}
