package com.github.darrmirr.fp.contract;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 7:
 *
 *    Code snippet with Optional moved to method
 */
public interface Main7 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x * x * x);
        // the same as Predicate<Integer> isPositiveNumber = (Integer value) -> value > 0;
        var isPositiveNumber = def((Integer value) -> value > 0);

        Integer x = null;
        var result = getResult(cubeVolume, isPositiveNumber, x);
        System.out.println("result : " + result);
    }

    static Optional<Integer> getResult(Function<Integer, Integer> cubeVolume, Predicate<Integer> isPositiveNumber, Integer x) {
        return Optional
                .ofNullable(x)
                .filter(isPositiveNumber)
                .map(cubeVolume);
    }
}
