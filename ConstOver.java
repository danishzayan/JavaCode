class Rectangle {
    private int length;
    private int width;

    public Rectangle() {
        length = 0;
        width = 0;
    }

    public Rectangle(int side) {
        length = side;
        width = side;
    }

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int calculateArea() {
        return length * width;
    }
}

public class ConstOver {
    public static void main(String[] args) {
        Rectangle square = new Rectangle(5);
        System.out.println("Area of square: " + square.calculateArea());

        Rectangle rectangle = new Rectangle(4, 6);
        System.out.println("Area of rectangle: " + rectangle.calculateArea());
    }
}
