import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Reader {
    public static void main(String[] args) {
        String filename = "example.txt"; // Создание переменной с названием "Filename" присовение значения "example.txt"

        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) { //попытка
            String line = reader.readLine(); //чтение строки. Остается понять как почитать.
            System.out.println(line); // печать строки
        } catch (IOException e) { // исключение
            System.err.println("Антон, ты тупой, попробуй заново"); //вывод ошибки, если я долбоёб
        }
    }
}
