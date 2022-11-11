package enums;

enum Color1{
    RED, BLUE{
        void info(Color1 color){
            System.out.println("Dangerous Color : "+color);
        }
    },GREEN;
    void info(Color1 color){
        System.out.println("Universal Color : "+color);
    }
}

public class EnumTest {
    public static void main(String[] args) {
        Color1[] colors = Color1.values();

        for (Color1 color : colors){
          color.info(color);
        }
    }
}
