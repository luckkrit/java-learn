package ch10_13.lab4;

public class Lab4 {
    public static void main(String[] args) {
        // Cannot new except anonymous
        Shape shape = new Shape() {
            @Override
            int area() {
                return super.area();
            }
            // Get errors
//            @Override
//            int borderArea(){
//                return 0;
//            }
        };
        // Get error
//        ShapeType shapeType = new ShapeType()
        ShapeType shapeType = ShapeType.CIRCLE;
        switch (shapeType) {
            case CIRCLE:
                System.out.println("Circle type");
                break;
            default:
                break;
        }
    }
}
