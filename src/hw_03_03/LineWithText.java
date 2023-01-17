package hw_03_03;
/*Необходимо создать строку с текстом (текст взять любой из интернета).
  Разбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложения с новой строки.
*/

public class LineWithText {
    public static void main(String[] args) {

        System.out.println("Строка:");
        String str = "If there is a will, there is a way!";
        System.out.println(str);

        //разделение с помощью substring
        int a = str.length();
        int b = str.length()/2;
        int c = str.length() - str.length()/2;
        System.out.println("Строка содержит " + a + " элементов.");
        System.out.println("Первая подстрока длиной " + c + " элементов:");
        String textOne = str.substring(0, c);
        System.out.println(textOne);
        System.out.println("Вторая подстрока длиной " + b + " элементов:");
        String textTwo = str.substring(c);
        System.out.println(textTwo);
        System.out.println("-------------------");

        //разделение с помощью split
        String[] text = str.split(", ");
        System.out.println("Разделение строки по запятой:");
        for (String temp : text) {
            System.out.println(temp);
        }
    }
}