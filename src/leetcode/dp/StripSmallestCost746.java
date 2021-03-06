package leetcode.dp;

/**
 * 数组的每个索引做为一个阶梯，第 i个阶梯对应着一个非负数的体力花费值 cost[i](索引从0开始)。
 * <p>
 * 每当你爬上一个阶梯你都要花费对应的体力花费值，然后你可以选择继续爬一个阶梯或者爬两个阶梯。
 * <p>
 * 您需要找到达到楼层顶部的最低花费。在开始时，你可以选择从索引为 0 或 1 的元素作为初始阶梯。
 * <p>
 * 示例 1:
 * <p>
 * 输入: cost = [10, 15, 20]
 * 输出: 15
 * 解释: 最低花费是从cost[1]开始，然后走两步即可到阶梯顶，一共花费15。
 * Created by zhaiyi on 2018/11/2.
 */
public class StripSmallestCost746 {
    public int minCostClimbingStairs(int[] cost) {
        int len = cost.length;
        if (len <= 1) {
            return 0;
        }
        int[] dp = new int[len];
        dp[0] = 0;
        dp[1] = Math.min(cost[0], cost[1]);
        for (int i = 2; i < len; i++) {
            dp[i] = Math.min(cost[i] + dp[i - 1], cost[i - 1] + dp[i - 2]);
        }
        return dp[len - 1];
    }

    /**
     * 最优解
     *
     * @param cost
     * @return
     */
    public int minCostClimbingStairs2(int[] cost) {
        int m = cost.length;
        int[] dp = new int[m];
        dp[0] = cost[0];
        dp[1] = cost[1];
        for (int i = 2; i < m; ++i) {
            dp[i] = Math.min(dp[i - 1], dp[i - 2]) + cost[i];
        }
        return Math.min(dp[m - 1], dp[m - 2]);
    }

    public static void main(String[] args) {
        StripSmallestCost746 stripSmallestCost746 = new StripSmallestCost746();
        System.out.println(stripSmallestCost746.minCostClimbingStairs(new int[]{1, 100, 1, 1, 1, 100, 1, 1, 100, 1}));
    }
}
