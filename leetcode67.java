class Solution {
    public String addBinary(String a, String b) {
        int value = 0, nextValue = 0;
        String result = "";
        for (int i = a.length() - 1, j = b.length() - 1; i >= 0 || j >= 0; i--, j--) {
            value = 0;
            if (i >= 0 && a.charAt(i) == '1') {
                value += 1;
            }
            if (j >= 0 && b.charAt(j) == '1') {
                value += 1;
            }
            nextValue = value + nextValue;
            if (i > 0 || j > 0) {
                result = nextValue % 2 == 1? result.concat("1") : result.concat("0");
            } else {
                if (nextValue == 2) {
                    result = result.concat("01");
                } else if (nextValue == 3) {
                    result = result.concat("11");
                } else{
                    result = nextValue == 1 ? result.concat("1") : result.concat("0");
                }
            }
            nextValue = nextValue > 1 ? 1 : 0;
        }
        return new StringBuffer(result).reverse().toString();
    }
}
