package practice;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

 class ArraysStringTest {

    @ParameterizedTest
    @MethodSource("isUniqueTextExpectedResult")
    void isUniqueTest(String input, boolean expected) {
        Assertions.assertEquals(expected, ArraysString.isUniqueInitialApproach(input));
        Assertions.assertEquals(expected, ArraysString.isUnique(input));
    }

    private static Stream<Arguments> isUniqueTextExpectedResult() {
        return Stream.of(
            Arguments.of("", false),
            Arguments.of(null, false),
            Arguments.of("   ", false),
            Arguments.of("null", false),
            Arguments.of("1234567aaa", false),
            Arguments.of("fsafhasdkfhsld", false),
            Arguments.of("abc", true)
        );
    }

    @ParameterizedTest
    @MethodSource("checkPermutation2TextExpected")
    void checkPermutationTest(String text1, String text2, boolean expected) {
        Assertions.assertEquals(expected, ArraysString.checkPermutation(text1, text2));
    }

     private static Stream<Arguments> checkPermutation2TextExpected() {
        return Stream.of(
            Arguments.of("", "", false),
            Arguments.of(null, null, false),
            Arguments.of("god", "dog", true)
        );
     }
}
