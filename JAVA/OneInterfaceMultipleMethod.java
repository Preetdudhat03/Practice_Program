
// Interface with multiple methods
interface Worker {
    void doWork();
    void takeBreak();
}

// Concrete class implementing the Worker interface
class Programmer implements Worker {
    @Override
    public void doWork() {
        System.out.println("The programmer is coding.");
    }

    @Override
    public void takeBreak() {
        System.out.println("The programmer takes a coffee break.");
    }
}

// Concrete class implementing the Worker interface
class Gardener implements Worker {
    @Override
    public void doWork() {
        System.out.println("The gardener is planting flowers.");
    }

    @Override
    public void takeBreak() {
        System.out.println("The gardener takes a lunch break.");
    }
}

public class OneInterfaceMultipleMethod {
    public static void main(String[] args) {
        // Using the Worker interface to achieve polymorphism
        Worker programmer = new Programmer();
        Worker gardener = new Gardener();

        // Performing work and breaks for different workers
        programmer.doWork();
        programmer.takeBreak();

        gardener.doWork();
        gardener.takeBreak();
    }
}