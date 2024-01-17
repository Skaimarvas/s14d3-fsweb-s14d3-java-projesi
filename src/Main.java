import com.workintech.polymorphism.Car;
import com.workintech.polymorphism.Ford;
import com.workintech.polymorphism.Holden;
import com.workintech.polymorphism.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        System.out.println("*********Car*Company************");
        Car car = new Car(8,"Base Car");
        car.startEngine();
        car.accelerate();
        car.brake();
        System.out.println("*****Mitsubishi***************");
        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        mitsubishi.startEngine();
        mitsubishi.accelerate();
        mitsubishi.brake();

        System.out.println("***********Ford****************");
        Car ford = new Ford(6, "Ford Falcon");
        ford.startEngine();
        ford.accelerate();
        ford.brake();

        System.out.println("************Holden*Commodore******");
        Car holden = new Holden(6,"Holden Commodore");
        holden.startEngine();
        holden.accelerate();
        holden.brake();

    }
}