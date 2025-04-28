class Main {

    public static void main(String[] args) throws java.lang.Exception {
        int k = 1;
        int[] arr = {2153, 65, 1, 12, 11, 1111};
        int result = NumWithMaxK(k, arr);
        System.out.println(result);
    }

    static int NumWithMaxK(int k, int[] arr) throws java.lang.Exception {
        if (arr == null) {
            return -1;
        }

        int maxCount = 0;
        int result = 0;
        for (int num : arr) {
            int count = countDigitOccurrences(num, k);
            if (count > maxCount) {
                maxCount = count;
                result = num;
            }
        }
        if (maxCount == 0) {
            return 0;
        }

        return result;
    }

    static int countDigitOccurrences(int num, int k) {
        int count = 0;
        while (num > 0) {
            if (num % 10 == k) {
                count++;
            }
            num /= 10;
        }
        return count;
    }
}