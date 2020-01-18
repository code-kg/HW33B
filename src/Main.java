import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter1 = new FileWriter("textB.txt");
        fileWriter1.write("1. Исключением является событие, которое происходит во время выполнения программы\n" +
                "и нарушает нормальный поток работы программы.\n");
        fileWriter1.write("2. исключения которые я встречал: ArrayIndexOutOfBoundsException, NullPointerException, NoSuchMethodException\n");
        fileWriter1.write("3. Иерархия классов exception начинается с класса Throwable, который является базовым классом\n");
        fileWriter1.write("4. Не обработанное исключение или игнорирование исключения не приветствуется, программа выдаст предупреждение об исключении\n");
        fileWriter1.write("5. В структуре, try помещается возможный код с ошибкой, catch обрабатывет его\n");
        fileWriter1.close();

        FileWriter fileWriter2 = new FileWriter("textC.txt");
        fileWriter2.write("1. Error - это не исправимая ошибка которая явялется наследником от Throwable\n" +
                "RuntimeException и его подклассы являются unchecked исключениями\n" +
                "Checked Exception нужно обработать самим в ручную\n");
        fileWriter2.write("2. Ключевое слово throw в Java используется для явного выброса исключения из метода или любого блока кода.\n" +
                "Мы можем бросить либо проверенное, либо непроверенное исключение. Ключевое слово throw в основном используется для создания пользовательских исключений.\n");
        fileWriter2.write("3. Unchecked не обрабатывемые исключения\n");
        fileWriter2.write("4. Блок catch выполняется только в случае возникновения исключения в блоке try\n" +
                "Блок finally выполняется всегда после блока try (-catch), если выброшено исключение или нет.\n");
        fileWriter2.write("5. если исключения имеют отношения родитель-потомок, \n" +
                "блоки catch должны быть отсортированы сначала по наиболее конкретным исключениям,\n" +
                "а затем по наиболее общим.\n");
        fileWriter2.close();

        FileReader fileReader = new FileReader("textB.txt");
        Scanner scanner = new Scanner(fileReader);
        while (scanner.hasNextLine()){
            System.out.println(scanner.nextLine());
            fileWriter1.close();
        }


    }
}
