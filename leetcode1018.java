class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        int sum = 0,temp = 0; // 0, 1, 2, 3
        List<Boolean> list = new ArrayList<Boolean>();
        for (int i = 0; i < nums.length; i++) // 1, 2, 4, 8, 6, 2, 4, 8, 6 ,2, 4, 8, 6
        {
            sum = 0; temp = 0;
            for (int j = i; j >= 0; j--) {
                if (j == i)
                {
                    sum += nums[j];
                } else {
                    switch (temp) {
                        case 0: sum += nums[j] * 2; temp++; break;
                        case 1: sum += nums[j] * 4; temp++; break;
                        case 2: sum += nums[j] * 8; temp++; break;
                        default:sum += nums[j] * 6; temp=0; break;
                    }
                }
            }
            if (sum % 5 == 0) {
                list.add(true);
            } else {
                list.add(false);
            }
        }
        return list;
    }
}
