package algorithm.arrays;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class BinarySearchTest {

    @Test
    public void testBinarySearch() {
        int[] orderArray = new int[] {1, 2, 3, 4, 5};

        Assert.assertEquals(2, BinarySearch.binarySearch(orderArray, 3));
    }
}