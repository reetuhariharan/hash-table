import java.util.HashMap;

public class TwoSumTransactions {

    public void findTwoSum(int[] transactions, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : transactions) {

            int complement = target - num;

            if (map.containsKey(complement)) {
                System.out.println("Pair found: " + num + " + " + complement + " = " + target);
                return;
            }

            map.put(num, 1);
        }

        System.out.println("No pair found.");
    }
}