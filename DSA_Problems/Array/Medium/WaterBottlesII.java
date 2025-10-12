package Array.Medium;

public class WaterBottlesII {
    public static int maxBottlesDrunk(int numBottles, int numExchange) {
        int ans = numBottles;

        while (numBottles >= numExchange) {
            numBottles = (numBottles - numExchange + 1);
            ++numExchange;
            ++ans;
        }

        return ans;
    }

    public static void main(String[] args) {
        int numBottles = 9, numExchange = 3;
        System.out.println(maxBottlesDrunk(numBottles, numExchange));
    }
}
