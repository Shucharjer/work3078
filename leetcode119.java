class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<Integer>();
        row.add(1);
        int num = 1;
        for (int m = 1; m < rowIndex + 1; m++) {
            num = (int)((long) num * (rowIndex - m + 1) / m);
            row.add(num);
        }
        return row;
    }
}
