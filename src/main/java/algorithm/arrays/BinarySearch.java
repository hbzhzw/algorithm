package algorithm.arrays;

public class BinarySearch {
    public static int binarySearch(int[] ordersArray, int findNum) {
        int result = -1;
        if (ordersArray != null && ordersArray.length > 0) {
            int s = 0;
            int e = ordersArray.length - 1;
            while (s <= e) {
                int mid = (s + e) >> 1;
                if (ordersArray[mid] == findNum) {
                    result = mid;
                    break;
                } else if (ordersArray[mid] > findNum) {
                    s = ++ mid;
                } else {
                    e = -- mid;
                }
            }
        }
        return result;
    }
}
