package ch10_13.lab4;

public abstract class Shape {
    int width;
    int height;
    final String borderStyle = "dash";

    int area() {
        return 0;
    }

    final int borderArea() {
        return 0;
    }
}
