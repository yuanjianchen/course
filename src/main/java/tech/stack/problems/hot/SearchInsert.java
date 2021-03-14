package tech.stack.problems.hot;

/**
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 * 你可以假设数组中无重复元素。
 * <p>
 * 示例 1:
 * <p>
 * 输入: [1,3,5,6], 5
 * 输出: 2
 * <p>
 * 示例 2:
 * <p>
 * 输入: [1,3,5,6], 2
 * 输出: 1
 * <p>
 * 示例 3:
 * <p>
 * 输入: [1,3,5,6], 7
 * 输出: 4
 * <p>
 * 示例 4:
 * <p>
 * 输入: [1,3,5,6], 0
 * 输出: 0
 * <p>
 * 作者：力扣 (LeetCode)
 * 链接：https://leetcode-cn.com/leetbook/read/array-and-string/cxqdh/
 * 来源：力扣（LeetCode）
 * 著作权归作者所有。商业转载请联系作者获得授权，非商业转载请注明出处。
 *
 * @author jianyuan.chen@advance.ai
 * @date 2021/3/1 11:06
 */
public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int left = 0, mid = 0, right = nums.length - 1;
        while (left <= right) {
            mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        SearchInsert searchInsert = new SearchInsert();
        int[] nums = new int[]{1, 3, 5, 6};
        System.out.println(searchInsert.searchInsert(nums, 2));
    }
}
