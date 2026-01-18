
// Define a simple class
class MyClass {
    int value;

    // Constructor
    MyClass(int val) {
        this.value = val;
    }
}

public class ObjectDemo {

    // Method that takes an object as a parameter
    static void modifyObject(MyClass obj) {
        obj.value += 10;
    }

    // Method that returns an object
    static MyClass createModifiedObject(int val) {
        MyClass newObj = new MyClass(val);
        newObj.value += 5;
        return newObj;
    }

    public static void main(String[] args) {
        // Create an object
        MyClass myObj = new MyClass(20);

        // Pass the object to the method, and modify it
        modifyObject(myObj);
        System.out.println("Modified Value: " + myObj.value);

        // Call a method that returns an object
        MyClass newObj = createModifiedObject(30);
        System.out.println("New Object Value: " + newObj.value);
    }
}
