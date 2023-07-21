import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TryWithResourcesBlock {

    public static void main(String[] args) {

//        File fileIn= new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
        File fileIn= new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/someFile.txt");
//        File fileOut= new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/copyOfMyFile.txt");
        File fileOut= new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/copyOfSomeFile.txt");

        try (
                BufferedReader br = new BufferedReader(new FileReader(fileIn)); // java.io.FileNotFoundException
                BufferedWriter bw = new BufferedWriter(new FileWriter(fileOut))
        ) {

            bw.write("This is another copy!\n");

            String st = null;

            while ((st = br.readLine()) != null) { // java.io.IOException
                System.out.println(st);

                bw.write(st + "\n");
            }
        }
        catch (IOException e){
            System.out.println("Catch and handle exception: " + e);
        }
    }

//    public static void main(String[] args) {
//
////        File fileIn= new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
//        File fileIn= new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/samplefile.txt");
//
//        try (BufferedReader br = new BufferedReader(new FileReader(fileIn))) { // java.io.FileNotFoundException
//
//            String st = null;
//
//            while ((st = br.readLine()) != null) { // java.io.IOException
//                System.out.println(st);
//            }
//        }
//        catch (IOException e){
//            System.out.println("Catch and handle exception: " + e);
//        }
//    }

//    public static void main(String[] args) throws IOException {
//
//        BufferedReader br = null;
//
//        try {
//            File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
//            br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//            String st = null;
//
//            while ((st = br.readLine()) != null) { // java.io.IOException
//                System.out.println(st);
//            }
//        }
//        finally {
//            br.close(); // java.io.IOException
//            System.out.println("Closed the buffered reader in the finally block");
//        }
//    }

//    public static void main(String[] args) {
//
//        BufferedReader br = null;
//        try {
//            File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/myFile.txt");
//            br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//            String st = br.readLine(); // java.io.IOException
//
//            while (st != null) {
//                System.out.println(st);
//
//                st = br.readLine(); // java.io.IOException
//            }
//        }
//        catch (IOException ex) {
//            System.out.println("Exception caught: " + ex);
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
}
