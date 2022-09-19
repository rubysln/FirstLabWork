import java.io.IOException;
import java.util.ArrayList;

public interface ChangeRegistry {
    public void change(String line);
}

class FirstStrategy implements ChangeRegistry{
    public void change(String line){
        line = line.trim().toLowerCase();
        String[] lineSplit = line.split("(?<=\\.)|(?<=\\?)|(?<=!)");
        String result = "";
        for(var e:lineSplit){
            e = e.trim();
            e = Character.toUpperCase(e.toCharArray()[0]) + e.substring(1) + " ";
            result = result + e;
        }
        System.out.println(result);
    }
}
class SecondStrategy implements ChangeRegistry{
    public void change(String line){
        System.out.println(line.toLowerCase());
    }
}
class ThirdStrategy implements  ChangeRegistry{
    public void change(String line){
        System.out.println(line.toUpperCase());
    }
}
class FourthStrategy implements ChangeRegistry{
    public void change(String line){
        String[] lineSplit = line.split("\\s+");
        line = "";
        for (var e:lineSplit) {
            e = Character.toUpperCase(e.toCharArray()[0]) + e.substring(1);
            line = line + e + " ";
        }
        System.out.println(line);
    }
}

class FifthStrategy implements ChangeRegistry{
    public void change(String line){
        String result = "";
        for (var e:line.toCharArray()) {
            if(Character.isUpperCase(e)){
                result = result + Character.toLowerCase(e);
            }
            else result = result + Character.toUpperCase(e);
        }
        System.out.println(result);
    }
}
