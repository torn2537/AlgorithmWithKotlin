import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class SumKTest {

    @Test
    void reWriteSlidingWindowAlgorithmBlankInput() {
        int[] arr = {};
        int n = arr.length;
        int k = 3;
        int result = SumK.reWriteSlidingWindowAlgorithm(arr,0, 2);
        assertEquals(0,result);
    }

    @Test
    void reWriteSlidingWindowAlgorithmSuccessfully() {
        int[] arr = {5, 2, -1, 0, 3};
        int n = arr.length;
        int k = 3;
        int result = SumK.reWriteSlidingWindowAlgorithm(arr,n, k);
        assertEquals(6,result);
    }
}
