
// Parent class
class Shape {
    // Method in the parent class
    void draw() {
        System.out.println("Drawing a shape");
    }
}

// Subclass inheriting from Shape
class Circle extends Shape {
    // Overriding the draw method in the Circle class
    void draw() {
        System.out.println("Draw a circle");
    }
}

// Another subclass inheriting from Shape
class Square extends Shape {
    // Overriding the draw method in the Square class
    void draw() {
        System.out.println("Draw a square");
    }
}

public class Overriding {
    public static void main(String[] args) {
        Shape genericShape = new Shape();
        Shape myCircle = new Circle();
        Shape mySquare = new Square();

        genericShape.draw();  // Output: Drawing a shape
        myCircle.draw();      // Output: Drawing a circle
        mySquare.draw();      // Output: Drawing a square
    }
}
