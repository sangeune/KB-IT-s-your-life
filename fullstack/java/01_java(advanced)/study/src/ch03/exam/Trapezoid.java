package ch03.exam;
//5번
public class Trapezoid {
    public static void main(String[] args) {
        int lengthTop = 5;
        int lengthBottom = 10;
        int height = 7;

        double area = (lengthTop + lengthBottom) * height / 2.0; //2 아니고 2.0
        System.out.println(area);
    }
}
