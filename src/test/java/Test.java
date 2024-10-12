import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class L2022211897_9_Test {

    // 测试用例设计的总体原则：等价类划分原则

    @Test
    void testPossibleBipartition_WhenExample1_ExpectTrue() {
        // 测试目的：测试给定示例1的情况
        // 期望结果：返回 true
        int n = 4;
        int[][] dislikes = {{1, 2}, {1, 3}, {2, 4}};
        Solution9 solution = new Solution9();
        boolean result = solution.possibleBipartition(n, dislikes);
        assertTrue(result);
    }

    @Test
    void testPossibleBipartition_WhenExample2_ExpectFalse() {
        // 测试目的：测试给定示例2的情况
        // 期望结果：返回 false
        int n = 3;
        int[][] dislikes = {{1, 2}, {1, 3}, {2, 3}};
        Solution9 solution = new Solution9();
        boolean result = solution.possibleBipartition(n, dislikes);
        assertFalse(result);
    }

    @Test
    void testPossibleBipartition_WhenExample3_ExpectFalse() {
        // 测试目的：测试给定示例3的情况
        // 期望结果：返回 false
        int n = 5;
        int[][] dislikes = {{1, 2}, {2, 3}, {3, 4}, {4, 5}, {1, 5}};
        Solution9 solution = new Solution9();
        boolean result = solution.possibleBipartition(n, dislikes);
        assertFalse(result);
    }
}