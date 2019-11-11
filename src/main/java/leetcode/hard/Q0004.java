package leetcode.hard;

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

	public double compareInTwoArray(int[] nums1, int[] nums2) {
		return 0.0;
	}

}
