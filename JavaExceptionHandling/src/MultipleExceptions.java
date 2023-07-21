public class MultipleExceptions {

    public static void main(String[] args) {

        System.out.println("Start of the program");

        int index = 4;

        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
                "Laptop Charger", "HDMI Cable", "Mouse"};

        try {
            System.out.format("\nThe product at index %d: %s\n", index, products[index]); // java.lang.ArrayIndexOutOfBoundsException

            System.out.println("Is the last product a mouse? "
                    + products[products.length-1].equalsIgnoreCase("mouse")); // java.lang.NullPointerException

            float firstPrice = Float.parseFloat(products[0]); // java.lang.NumberFormatException
        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
            System.out.format("An Exception of type %s was thrown.", ex.getClass());
        }
        catch (Exception ex) {
            System.out.println("An Exception has been raised: " + ex.getClass());
        }

        System.out.println("End of the program");
    }

//    public static void main(String[] args) {
//
//        System.out.println("Start of the program");
//
//        int index = 4;
//
//        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
//                "Laptop Charger", "HDMI Cable", "Mouse"};
//
//        try {
//            System.out.format("\nThe product at index %d: %s\n", index, products[index]); // java.lang.ArrayIndexOutOfBoundsException
//
//            System.out.println("Is the last product a mouse? "
//                    + products[products.length-1].equalsIgnoreCase("mouse")); // java.lang.NullPointerException
//
//            float firstPrice = Float.parseFloat(products[0]); // java.lang.NumberFormatException
//        }
//        catch (Exception ex) {
//            System.out.println("An Exception has been raised: " + ex.getClass());
//        }
//        catch (NullPointerException ex) {
//            System.out.println("A null value was being accessed");
//        }
//        catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("The bounds of the array have been exceeded.");
//        }
//
//        System.out.println("End of the program");
//    }

//    public static void main(String[] args) {
//
//        System.out.println("Start of the program");
//
//        int index = 4;
//
//        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
//                "Laptop Charger", "HDMI Cable", "Mouse"};
//
//        try {
//            System.out.format("\nThe product at index %d: %s\n", index, products[index]); // java.lang.ArrayIndexOutOfBoundsException
//
//            System.out.println("Is the last product a mouse? "
//                    + products[products.length-1].equalsIgnoreCase("mouse")); // java.lang.NullPointerException
//
//            float firstPrice = Float.parseFloat(products[0]); // java.lang.NumberFormatException
//        }
//        catch (NullPointerException ex) {
//            System.out.println("A null value was being accessed");
//        }
//        catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("The bounds of the array have been exceeded.");
//        }
//        catch (Exception ex) {
//            System.out.println("An Exception has been raised: " + ex.getClass());
//        }
//
//
//        System.out.println("End of the program");
//    }

//    public static void main(String[] args) {
//
//        System.out.println("Start of the program");
//
//        int index = 4;
//
//        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
//                "Laptop Charger", "HDMI Cable", null};
//
//        try {
//            System.out.format("\nThe product at index %d: %s\n", index, products[index]); // java.lang.ArrayIndexOutOfBoundsException
//
//            System.out.println("Is the last product a mouse? "
//                    + products[products.length-1].equalsIgnoreCase("mouse")); // java.lang.NullPointerException
//        }
//        catch (NullPointerException | ArrayIndexOutOfBoundsException ex) {
//            System.out.format("An Exception of type %s was thrown.", ex.getClass());
//        }
//
//
//        System.out.println("End of the program");
//    }

//    public static void main(String[] args) {
//
//        System.out.println("Start of the program");
//
////        int index = 10;
//        int index = 4;
//
//        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
//                "Laptop Charger", "HDMI Cable", null};
//
//        try {
//            System.out.format("\nThe product at index %d: %s\n", index, products[index]); // java.lang.ArrayIndexOutOfBoundsException
//
//            System.out.println("Is the last product a mouse? "
//                    + products[products.length-1].equalsIgnoreCase("mouse")); // java.lang.NullPointerException
//        }
//        catch (NullPointerException ex) {
//            System.out.println("A null value was being accessed");
//        }
//        catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("The bounds of the array have been exceeded.");
//        }
//
//        System.out.println("End of the program");
//    }

//    public static void main(String[] args) {
//
//        System.out.println("Start of the program");
//
//        int index = 10;
//
//        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
//                "Laptop Charger", "HDMI Cable", null};
//
//        try {
//            System.out.format("\nThe product at index %d: %s\n", index, products[index]); // java.lang.ArrayIndexOutOfBoundsException
//
//            System.out.println("Is the last product a mouse? "
//                    + products[products.length-1].equalsIgnoreCase("mouse")); // java.lang.NullPointerException
//        }
//        catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("The bounds of the array have been exceeded.");
//        }
//        catch (NullPointerException ex) {
//            System.out.println("A null value was being accessed");
//        }
//
//        System.out.println("End of the program");
//    }

//    public static void main(String[] args) {
//
//        System.out.println("Start of the program");
//
//        int index = 10;
//
//        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
//                "Laptop Charger", "HDMI Cable", null};
//
//        try {
//            System.out.format("\nThe product at index %d: %s\n", index, products[index]); // java.lang.ArrayIndexOutOfBoundsException
//        }
//        catch (ArrayIndexOutOfBoundsException ex) {
//            System.out.println("The bounds of the array have been exceeded.");
//        }
//
//        try{
//            System.out.println("Is the last product a mouse? "
//                    + products[products.length-1].equalsIgnoreCase("mouse")); // java.lang.NullPointerException
//        }
//        catch (NullPointerException ex) {
//            System.out.println("A null value was being accessed");
//        }
//
//        System.out.println("End of the program");
//    }

//    public static void main(String[] args) {
//
//        System.out.println("Start of the program");
//
//        int index = 10;
////        int index = 4;
//
//        String[] products = {"Power Bank", "USB Cable", "Phone Charger",
//                "Laptop Charger", "HDMI Cable", null};
//
//        System.out.format("\nThe product at index %d: %s\n", index, products[index]); // java.lang.ArrayIndexOutOfBoundsException
//
//        System.out.println("Is the last product a mouse? "
//                + products[products.length-1].equalsIgnoreCase("mouse")); // java.lang.NullPointerException
//
//        System.out.println("End of the program");
//    }
}
