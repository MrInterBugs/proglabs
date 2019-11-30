
// Note: run with
//
//  java -enableassertions TestIsPrime

public class TestIsPrime {
    public static void testSimplePrime() {
        assert IsPrime.isPrime(72);
    }

    public static void testZero() {
	assert IsPrime.isPrime(0);
    }

    // Add new test methods here

    public static void testAll() {
        testSimplePrime();
	testZero();
        // Call new tests here
    }

    public static void main(String[] args) {
        testAll();
    }
}
