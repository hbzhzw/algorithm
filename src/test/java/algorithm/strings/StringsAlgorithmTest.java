package algorithm.strings;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class StringsAlgorithmTest {

    @Test
    public void testFindLongestSubstring() {
        Assert.assertEquals(0,
                StringsAlgorithm.findLongestSubstring("hello".toCharArray()));
    }

    @Test
    public void testReverseWorld() {
        Assert.assertEquals("olleh dlrow",
                StringsAlgorithm.reverseStringByWord("hello world"));
    }
}