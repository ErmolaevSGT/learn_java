import java.io.*;

public class Chat {
    public static void main(String[] args) {
        messenger M = new messenger("example2.txt");
        M.sendmessage("HUI");

        messenger X = new messenger("example.txt");
        X.sendmessage("PIZDA");
        //Начало чтения
        {
            String filename = "example.txt"; // Создание переменной с названием "Filename" присовение значения "example.txt"

            try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { //попытка
                String line = reader.readLine(); //чтение строки. Остается понять как почитать все строки.
                System.out.println(line); // печать строки
            } catch (IOException e) { // исключение
                System.err.println("Антон, ты тупой, попробуй заново"); //вывод ошибки, если я долбоёб
            }
        }
    }
}
