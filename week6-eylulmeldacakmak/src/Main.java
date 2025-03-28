import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {

        Point p = new Point(3, 4);
        Rectangle r1 = new Rectangle(p, 3, 4);
        System.out.println(Rectangle.counter);
        System.out.println(r1.countForObject);

        Rectangle r2 = new Rectangle(p, 3, 4);
        System.out.println(Rectangle.counter);
        System.out.println(r1.countForObject);
        System.out.println(r2.countForObject);

        System.out.println(Integer.parseInt("3"));

        System.out.println(p);
    }
}