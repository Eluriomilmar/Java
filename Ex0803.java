import parafernalhas.E0803.Circle;
import parafernalhas.E0803.Rectangle;
import parafernalhas.E0803.Shape;
import parafernalhas.E0803.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ex0803 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int n = sc.nextInt();

        List<Shape> list = new ArrayList<>();

        for (int i = 1; i <= n; i++) {
            System.out.println("Shape #" + i + " data:");
            System.out.print("Rectangle or Circle (R/C): ");
            char ch = sc.next().toUpperCase().charAt(0);
            System.out.print("Color (Black/Blue/Red): ");
            Color color = Color.valueOf(sc.next().toUpperCase());
            if (ch == 'R') {
                System.out.print("Width: ");
                double width = sc.nextDouble();
                System.out.print("Height: ");
                double height = sc.nextDouble();
                list.add(new Rectangle(color, width, height));
            } else {
                System.out.print("Radius: ");
                double radius = sc.nextDouble();
                list.add(new Circle(color, radius));
            }
        }
        System.out.println();
        System.out.println("Shape areas: ");
        for (Shape shape : list) {
            System.out.printf("%.2f%n", shape.area());
        }
    }
}
