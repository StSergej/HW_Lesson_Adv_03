package hw_03_02;
/*Создайте файл, запишите в него произвольные данные и закройте файл.
  Затем снова откройте этот файл, прочитайте из него данные и выведете их на консоль.
*/

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class HandlingFile {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("Sample.txt");
        fileWriter.write("Hello World! \n");
        fileWriter.write("Happy New Year - " + 2023 + "!");

        fileWriter.flush();
        fileWriter.close();

        FileReader fileReader = new FileReader("Sample.txt");
        Scanner scanner = new Scanner(fileReader);

        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
        }
        fileReader.close();
    }
}
