package SS6.Triangle;

public class TestTriangle {
    public static void main(String[] args) {
        Triangle triangle = new Triangle(4.5, 3, 2.5);
        System.out.println(" Diện tích tam giác : " + triangle.getArea());
        System.out.println(" Chu vi tam giác : " + triangle.getPerimeter());
        System.out.println(triangle.toString());
    }
}
