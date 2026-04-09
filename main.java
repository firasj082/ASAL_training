import java.util.ArrayList;
import java.util.List;

public class main {
    public static void main(String[] args) {
    
    List<Shape> shapes = new ArrayList<>();
    shapes.add(new Circle(5));
    shapes.add(new Rectangle(10, 5));
    shapes.add(new Shape());

    for(Shape s: shapes){

        System.out.println("Area: " + s.calculateArea());
    }

    }
}
