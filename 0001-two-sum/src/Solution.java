import java.util.HashMap;
import java.util.Map;

public class Solution {

    /**
     * @Author: Shangde
     * @Date: 2021/1/20 17:48
     * @Description: 暴力枚举
     **/
    public static int[] twoSum01(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return new int[0];
    }

    /**
     * @Author: Shangde
     * @Date: 2021/1/20 17:54
     * @Description: 哈希表
     **/
    public static int[] twoSum02(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                return new int[]{map.get(target - nums[i]), i};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }


    public static void main(String[] args) {
        long startTime=System.nanoTime();   //获取开始时间
        int[] ints = twoSum02(new int[]{1, 4, 5, 2, 7}, 12);
        if (ints.length > 0) {
            for (int i = 0; i < ints.length; i++) {
                System.out.println(ints[i]);
            }
        }
        long endTime=System.nanoTime(); //获取结束时间
        System.out.println("程序运行时间： "+(endTime-startTime)+"ns");
    }
}