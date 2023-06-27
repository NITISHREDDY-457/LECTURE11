abstract class Car // We cannot instantiate an abstract class, which means we cannot create objects of an abstract class
{
    int maxSpeed;
    abstract void accelerate(); // Only Declared but not implemented it is without a body
    // They are created to force the child classes to implement them before using, We will use them after overriding
    abstract void brake();
}

abstract class BMW extends Car {
    void accelerate() {
        System.out.println("BMW is accelerating");
    }
}

class BMW2 extends BMW {
    void brake() {
        System.out.println("BMW is applying brakes");
    }
}

public class Lecture11 {
    public static void main(String[] args) {
        // Car c= new Car(); //Cannot instantiate an abstract class
        // BMW b1=new BMW();
        // b1.accelerate();
        BMW2 b2 = new BMW2();
        b2.accelerate();
        b2.brake();

    }
}