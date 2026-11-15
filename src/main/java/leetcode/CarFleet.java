package leetcode;

import java.util.ArrayList;
import java.util.List;

public class CarFleet {
    record Car(int position, int speed) {
    }

    public int carFleet(int target, int[] position, int[] speed) {
        // group fleets based where they'll meet target

        List<Car> sortedCars = new ArrayList<>();
        for (int i = 0; i < position.length; i++) {
            sortedCars.add(new Car(position[i], speed[i]));
        }
        sortedCars.sort((c1, c2) -> Integer.compare(c2.position(), c1.position()));

        double lastFleetTime = 0;
        int fleets = 0;

        for (Car car : sortedCars) {
            // math the time current car will take to cross target.
            int distance = target - car.position();
            double time = (double) distance / (double) car.speed();

            if (time > lastFleetTime) {
                fleets++;
                lastFleetTime = time;
            }

        }

        return fleets;
    }
}