package enums;

enum Color{

    RED, GREEN, BLUE;

    public void info(){
        System.out.println("Universal Colors");
    }

}
public class EnumMethods {
    public static void main(String[] args) {
        Color[] colors = Color.values();

        for (Color color : colors){
           color.info();
        }
    }
}
