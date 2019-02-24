package homework10.task2;

import java.util.HashMap;

import static homework10.task2.Garage.*;

public class runtime {

    public static void main(String[] args) {
        HashMap<Car, Integer> hashMap = Garage.getReference();

        parkCar(hashMap, new Volvo("XC60", 2015, "white", "petrol"));
        parkCar(hashMap, new Volvo("XC60", 2015, "white", "petrol"));
        parkCar(hashMap, new Volvo("XC90", 2015, "white", "petrol"));
        parkCar(hashMap, new Audi("RS4", 2017, "blue", "petrol"));
        parkCar(hashMap, new Vw("Passat", 2012, "brown", "diesel"));
        parkCar(hashMap, new Toyota("Corolla", 2018, "grey", "diesel"));
        System.out.println(hashMap.toString());
        unParkCar(hashMap, new Volvo("XC90", 2015, "white", "petrol"));
        System.out.println(hashMap.toString());
        System.out.println(new Volvo("XC90", 2015, "white", "petrol").toString() + ": " + getCarCount(hashMap, new Volvo("XC90", 2015, "white", "petrol")));
    }
}
