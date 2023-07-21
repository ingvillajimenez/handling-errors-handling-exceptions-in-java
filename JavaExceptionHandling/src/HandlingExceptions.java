public class HandlingExceptions {

    public static void main(String[] args) {

        double[] prices = {5.90, 18.99, 64.0, 99.00, 79.50};

//        int index = 2;
        int index = 5;

        System.out.println("Start of the program");

        try {
            System.out.format("\nThe price at index %s is %f\n", index, prices[index]); //java.lang.ArrayIndexOutOfBoundsException

            System.out.println("This does not run if there is an Exception");
        }
        catch (Exception e) {
            System.out.println("An Exception occurred");

//            e.printStackTrace();
            System.out.println(e);
        }

        System.out.println("End of the program");
    }

//    public static void main(String[] args) {
//
//        double[] prices = {5.90, 18.99, 64.0, 99.00, 79.50};
//
//        int index = 5;
//
//        System.out.println("Start of the program");
//
//        System.out.format("\nThe price at index %s is %f\n", index, prices[index]); //java.lang.ArrayIndexOutOfBoundsException
//
//        System.out.println("End of the program");
//    }
}
