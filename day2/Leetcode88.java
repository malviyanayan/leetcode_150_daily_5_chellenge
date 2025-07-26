class Leetcode88 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int length = m+n-1;

        while(m>=0 && n>=0){
            if(nums1[m]>nums2[n]){
                nums1[length] = nums1[m];
                m--;
            }else{
                nums1[length] = nums2[n];
                n--;
            }
            length--;
        }

        while (m >= 0) {
            nums1[length--] = nums1[m--];
        }

        while (n >= -0) {
            nums1[length--] = nums2[n--];
        }
    }    

}
