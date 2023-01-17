package hw_03_04;
/*Создайте в package текстовый файл и класс, внесите в файл некий текст.
  Выведите на экран содержимое файла.
*/

import java.io.*;

public class TextOfFile {
    public static void main(String[] args) throws Exception{

        File myFile = new File("I:\\Education JAVA\\HomeWork\\src\\hw_03_04\\sample_03_04");
        myFile.mkdir();
        File file_txt = new File(myFile, "SampleText.txt");
        file_txt.createNewFile();
        File file_class = new File(myFile,"Sample_Class.class");
        file_class.createNewFile();

        if(myFile.isDirectory()) {
            System.out.println("Файлы в папке: ");
            for (File fileNew : myFile.listFiles()) {
                System.out.println(fileNew.getName());
            }
            System.out.println("------------------------");
        }
        FileReader fr = new FileReader(file_txt);
        BufferedReader br = new BufferedReader(fr);
        System.out.println("Содержимое файла " + file_txt.getName() + " :");
        while (br.ready()){
            System.out.println(br.readLine());
        }
        br.close();
    }
}
