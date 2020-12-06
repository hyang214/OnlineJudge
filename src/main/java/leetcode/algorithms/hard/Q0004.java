package leetcode.algorithms.hard;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * title:
 *
 * @author Hao YANG
 * @since 2019.11.11
 */
public class Q0004 {

	/**
	 * approach 1
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double combineIntoOneArray(int[] nums1, int[] nums2) {
		if (nums1 == null) {
			nums1 = new int[]{};
		}
		if (nums2 == null) {
			nums2 = new int[]{};
		}
		List<Integer> combine = new ArrayList<>(nums1.length + nums2.length);
		for (int i = 0; i < nums1.length; i ++) {
			combine.add(nums1[i]);
		}
		for (int i = 0; i < nums2.length; i ++) {
			combine.add(nums2[i]);
		}
		Collections.sort(combine);
		if (combine.size() % 2 == 0) {
			/** 偶数长度 **/
			return (combine.get(combine.size()/2 - 1) + combine.get(combine.size()/2))/2.0;
		} else {
			return combine.get(combine.size()/2);
		}
	}

	/**
	 * approach 2
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	public double compareInTwoArray(int[] nums1, int[] nums2) {
		if (nums1 == null) {
			nums1 = new int[]{};
		}
		if (nums2 == null) {
			nums2 = new int[]{};
		}
		/** 需要搜索的元素 **/
		int total = nums1.length + nums2.length;
		List<Integer> target = new ArrayList<>();
		target.add(total / 2);
		if (total % 2 == 0) {
			target.add(total / 2 - 1);
		}

		/** 搜索元素 **/
		List<Integer> value = find(target, nums1, nums2);
		/** 计算均值并且返回 **/
		double r = average(value);
		return r;
	}

	/**
	 * 找到目标位置的值
	 * @param target
	 * @param nums1
	 * @param nums2
	 * @return
	 */
	private List<Integer> find(List<Integer> target, int[] nums1, int[] nums2) {
		int num1Index = 0;
		int num2Index = 0;
		List<Integer> value = new ArrayList<>();
		for (int i = 0 ; i <= target.get(0); i ++) {
			/** 获取num1中的当前元素 **/
			Integer num1Element = null;
			if (num1Index < nums1.length) {
				num1Element = nums1[num1Index];
			}
			/** 获取num2中的当前元素 **/
			Integer num2Element = null;
			if (num2Index < nums2.length) {
				num2Element = nums2[num2Index];
			}
			/** 处理一个array耗尽的情况 **/
			Integer current;
			if (num1Element == null) {
				current = num2Element;
				num2Index ++;
			} else if (num2Element == null) {
				current = num1Element;
				num1Index ++;
			} else {
				/** 2个array都还有元素的情况 **/
				if (num1Element < num2Element) {
					current = num1Element;
					num1Index ++;
				} else {
					current = num2Element;
					num2Index ++;
				}
			}
			/** 已经到目标 **/
			if (target.contains(i)) {
				value.add(current);
			}
		}
		return value;
	}

	/**
	 * 请均值
	 * @param value
	 * @return
	 */
	private double average(List<Integer> value) {
		double sum = 0;
		for (Integer v: value) {
			sum += v;
		}
		return sum / value.size();
	}

}
