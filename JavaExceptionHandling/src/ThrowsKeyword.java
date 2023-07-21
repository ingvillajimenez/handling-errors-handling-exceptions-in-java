import java.io.*;

public class ThrowsKeyword {

    public static void main(String[] args) {

        try {
            readFile();
        } catch (IOException e) {

            System.out.println("Catch the exception in order to handle it \n" + e);
        }
    }

//    public static void main(String[] args) throws IOException {
//
//        readFile();
//    }

    public static void readFile() throws IOException {
        File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/NonExistentFile.txt");

        BufferedReader br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException

        String st = br.readLine(); // java.io.IOException

        while (st != null) {
            System.out.println(st);

            st = br.readLine(); // java.io.IOException
        }

        br.close(); // java.io.IOException
    }

//    public static void main(String[] args) throws IOException {
//
//        File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/NonExistentFile.txt");
//
//        BufferedReader br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//
//        String st = br.readLine(); // java.io.IOException
//
//        while (st != null) {
//            System.out.println(st);
//
//            st = br.readLine(); // java.io.IOException
//        }
//
//        br.close(); // java.io.IOException
//    }

//    public static void main(String[] args) {
//
//        File file = new File("/Users/juan/code/skillsoft/java-novice-to-javanista/track-2-java-apprentice/handling-errors-handling-exceptions-in-java/JavaExceptionHandling/NonExistentFile.txt");
//
//        BufferedReader br = new BufferedReader(new FileReader(file)); // java.io.FileNotFoundException
//
//        String st = br.readLine(); // java.io.IOException
//
//        while (st != null) {
//            System.out.println(st);
//
//            st = br.readLine(); // java.io.IOException
//        }
//
//        br.close(); // java.io.IOException
//    }
}
