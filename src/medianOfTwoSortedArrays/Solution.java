package medianOfTwoSortedArrays;

public class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int i = 0, j = 0, k = 0;
        int[] result = new int[nums1.length + nums2.length];

        while (i < nums1.length && j < nums2.length) {
            if (nums1[i] < nums2[j])
                result[k++] = nums1[i++];
            else
                result[k++] = nums2[j++];
        }
        while (i < nums1.length) {
            result[k++] = nums1[i++];
        }
        while (j < nums2.length) {
            result[k++] = nums2[j++];
        }

        int mid = result.length / 2;
        if (result.length % 2 == 0) {
            return (double) (result[mid] + result[mid - 1]) / 2;
        } else {
            return result[mid];
        }
    }
}
