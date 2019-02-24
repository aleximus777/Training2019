package homework10.task2;

import java.util.HashMap;

public final class Garage {
    private static HashMap<Car, Integer> hashMap = new HashMap<>();

    public static void parkCar(HashMap<Car, Integer> hashMap, Car car) {
        hashMap.putIfAbsent(car, 0);
        hashMap.put(car, hashMap.get(car) + 1);
    }

    public static void unParkCar(HashMap<Car, Integer> hashMap, Car car) {
        hashMap.putIfAbsent(car, 0);
        hashMap.put(car, hashMap.get(car) - 1);
    }

    public static int getCarCount(HashMap<Car, Integer> hashMap, Car car) {
        hashMap.putIfAbsent(car, 0);
        return hashMap.get(car);
    }

    public static HashMap getReference() {
        return hashMap;
    }
}
