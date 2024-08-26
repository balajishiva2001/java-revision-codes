abstract class Car {
    int x = 1000;

    public abstract void hornSound();

    public void playMusic() {
        System.out.println("Playing Music");
    }

    static String country = "Indian";
}

class SUV extends Car {

    @Override
    public void hornSound() {
        System.out.println("Loud horn Beep Beep");
    }

    public void show(){
        System.out.println("Inside show method");
    }
}

public class Intro10 {

    public static void main(String[] args) {
        Car c = new SUV(); //Indirect way of instantion
        System.out.println(c.x);
        System.out.println(Car.country);
        System.out.println(SUV.country);
        c.playMusic();
        c.hornSound();
        
        SUV c1 = (SUV) c; //downcasting
        c1.show();

        /*
        *Anonymous Inner class
        */
        Car newCar = new Car() {
            public void hornSound() {
                System.out.println("Short horn");
            }
        };

        System.out.println(newCar.x);
        System.out.println(Car.country);
        newCar.playMusic();
        newCar.hornSound();
    }
}
