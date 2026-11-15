package leetcode;

import java.util.ArrayList;
import java.util.Stack;

public class CarFleet {
    record CarWithSpeed(int position, int speed) {
    }

    public int carFleet(int target, int[] position, int[] speed) {
        // group fleets based where they'll meet target

        var sortedCars = new ArrayList<CarWithSpeed>();
        for (int i = 0; i < position.length; i++) {
            sortedCars.add(new CarWithSpeed(position[i], speed[i]));
        }
        sortedCars.sort((c1, c2) -> c2.position - c1.position);

        var stack = new Stack<Double>();

        // now we have to count number of fleets.

        for (var car : sortedCars) {
            // math the time current car will take to cross target.
            int distance = target - car.position;
            double timeToFinish = (double) distance / (double) car.speed;

            if (stack.isEmpty() || timeToFinish > stack.peek()) {
                stack.push(timeToFinish);
            }

        }

        return stack.size();
    }
}