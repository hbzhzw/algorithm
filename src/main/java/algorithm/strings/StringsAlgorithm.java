package algorithm.strings;

public class StringsAlgorithm {

    public static int findLongestSubstring(char[] charArray) {
        System.out.println("hello, world");
        return 0;
    }

    /**
     * "hello world" --> "olleh dlrow"
     * @param inputStr  the input string
     * @return the reversed string by word
     */
    public static String reverseStringByWord(String inputStr) {
        char[] carray = inputStr.toCharArray();
        for (int i = 0, j = i; i < carray.length; i++) {
            if (carray[i] == ' ') {
                if (i > j) {
                    reverseCharArray(carray, j, i - 1);
                }
                j = i + 1;
            } else if (i == carray.length - 1) {
                reverseCharArray(carray, j, i);
            }
        }
        return new String(carray);
    }

    private static void reverseCharArray(char[] charArray, int sidx, int eidx) {
        if (charArray == null || charArray.length <= 0) {
            return;
        }
        for (int i = sidx, j = eidx; i < j; i++, j--) {
            char t = charArray[i];
            charArray[i] = charArray[j];
            charArray[j] = t;
        }
    }
}
