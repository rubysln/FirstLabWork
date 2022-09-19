import java.io.BufferedReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Transliteration("Шишкина Жанна");
        Truncate("A    ", 3);
        Truncate("95 процентов мирового океана");
        ChangeRegistry();
    }

    static void Truncate(String line){
        Truncate(line, 16);
    }
    static void Truncate(String line, int truncater){
        String result = "";
        for(int i = 0; i < truncater && i < line.length(); i++){
            result = result + line.toCharArray()[i];
        }
        result = result.trim();
        if(truncater >= line.trim().length()) System.out.println(result);
        else System.out.printf(result + "...");
    }
    static void Transliteration(String name) {
        Transliteration(name, " ");
    }

    static void Transliteration(String name, String devider) {
        Map map = new Map();
        String result = "";
        for (var e: name.toCharArray()) {
            if(e == ' ') result = result + devider;
            result = result + map.SearchValue(Character.toString(e));
        }
        System.out.println(result);
    }

    static void ChangeRegistry(){
        System.out.println("\nВведите свой текст:");
        Scanner scanner = new Scanner(System.in);
        String line = scanner.nextLine();
        System.out.println(
                "1.\tКак в предложениях\n" +
                        "2.\tвсе строчные\n" +
                        "3.\tВСЕ ПРОПИСНЫЕ\n" +
                        "4.\tНачинать С Прописных\n" +
                        "5.\tиЗМЕНИТЬ РЕГИСТР\n"
        );
        int strategyIndex = scanner.nextInt();
        SwitchCase switcher = new SwitchCase();
        switcher.select(line, strategyIndex);
    }
}
