import java.io.*;

public class FinallyBlock {

    public static void main(String[] args) {

        int num = 5;

        try {
            System.out.println("Start of the program");

            System.out.println("num/0 : " + (num / 0)); // java.lang.ArithmeticException
        }
        catch (ArithmeticException ae){

            System.out.println("An ArithmeticException was caught");
        }
        finally {

            System.out.println("finally can exist without a catch.");

        }

    }

//    public static void main(String[] args) {
//
//        int num = 5;
//
//        try {
//            System.out.println("Start of the program");
//
//            System.out.println("num/0 : " + (num / 0)); // java.lang.ArithmeticException
//        } finally {
//
//            System.out.println("finally can exist without a catch.");
//
//        }
//        catch (ArithmeticException ae){
//
//            System.out.println("An ArithmeticException was caught");
//        }
//    }

//    public static void main(String[] args) {
//
//        int num = 5;
//
//        try {
//            System.out.println("Start of the program");
//
//            System.out.println("num/0 : " + (num / 0)); // java.lang.ArithmeticException
//        } finally {
//
//            System.out.println("finally can exist without a catch.");
//
//        }
//
//        System.out.println("End of the program - second exception not caught");
//    }

//    public static void main(String[] args) {
//
//        BufferedReader br = null;
//        try {
////            File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
//            File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/NonExistentFile.txt");
//
//            br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//
//            String st = br.readLine(); // java.io.IOException
//
//            while (st != null) {
//                System.out.println(st);
//
//                st = br.readLine(); // java.io.IOException
//            }
//
//        }
//        catch (IOException ex) {
//            System.out.println("Exception caught: \n" + ex);
//        }
//        finally {
//            if (br != null) {
//                try {
//                    br.close();
//                } catch (IOException e) {
//                    e.printStackTrace();
//                }
//
//                System.out.println("Closed the buffered reader in the finally block");
//            } else {
//                System.out.println("The buffered reader was never opened");
//            }
//        }
//    }

//    public static void main(String[] args) {
//
//        BufferedReader br = null;
//        try {
//            File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
//
//            br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//
//            String st = br.readLine(); // java.io.IOException
//
//            while (st != null) {
//                System.out.println(st);
//
//                st = br.readLine(); // java.io.IOException
//            }
//
//            br.close();
//        }
//        catch (FileNotFoundException ex) {
//            System.out.println("Exception caught: \n" + ex);
//        }
//        catch (IOException ex) {
//            System.out.println("Exception caught: \n" + ex);
//        }
//    }

//    public static void main(String[] args) {
//
//        try {
//            File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
//
//            BufferedReader br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//
//            String st = br.readLine(); // java.io.IOException
//
//            while (st != null) {
//                System.out.println(st);
//
//                st = br.readLine(); // java.io.IOException
//            }
//        }
//        catch (FileNotFoundException ex) {
//            System.out.println("Exception caught: \n" + ex);
//        }
//        catch (IOException ex) {
//            System.out.println("Exception caught: \n" + ex);
//        }
//    }

//    public static void main(String[] args) {
//
//        try {
//            File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
//            File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/NonExistentFile.txt");
//
//            BufferedReader br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//
//            String st = br.readLine(); // java.io.IOException
//
//            while (st != null) {
//                System.out.println(st);
//
//                st = br.readLine(); // java.io.IOException
//            }
//        }
//        catch (IOException ex) {
//            System.out.println("Exception caught: \n" + ex);
//        }
//    }

//    public static void main(String[] args) {
//
//        try {
//            File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
//
//            BufferedReader br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//
//            String st = br.readLine(); // java.io.IOException
//
//            while (st != null) {
//                System.out.println(st);
//
//                st = br.readLine(); // java.io.IOException
//            }
//        }
//        catch (FileNotFoundException | IOException ex) {
//            System.out.println("Exception caught: \n" + ex);
//        }
//    }

//    public static void main(String[] args) {
//
//        File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
//
//        BufferedReader br = null;
//        try {
//            br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//        } catch (FileNotFoundException e) {
//            e.printStackTrace();
//        }
//
//        String st = null;
//        try {
//            st = br.readLine(); // java.io.IOException
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        while (st != null) {
//            System.out.println(st);
//
//            try {
//                st = br.readLine(); // java.io.IOException
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//    }
}
