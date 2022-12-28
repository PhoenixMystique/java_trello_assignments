package task6;

public class Rectangle {
    int length;
    int breadth;

    public Rectangle() {
        length = 0;
        breadth = 0;
    }

    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public Rectangle(int num) {
        length = num;
        breadth = num;
    }

    public int area() {
        int area = length * breadth;
        return area;
    }

    public static void main(String[] args) {
        Rectangle rectangle1 = new Rectangle();
        Rectangle rectangle2 = new Rectangle(7, 9);
        Rectangle rectangle3 = new Rectangle(30);
        System.out.println(rectangle1.area());
        System.out.println(rectangle2.area());
        System.out.println(rectangle3.area());
    }
}
