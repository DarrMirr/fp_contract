package com.github.darrmirr.fp.contract;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 7_1:
 *
 *    Change getResult() method name and return value
 */
public interface Main7_1 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x * x);
        var isPositiveNumber = def((Integer value) -> value > 0);

        Integer x = null;
        var result = obligate(cubeVolume, isPositiveNumber)
                .apply(x);
        System.out.println("result : " + result);
    }

    static Function<Integer, Optional<Integer>> obligate(Function<Integer, Integer> function, Predicate<Integer> predicate) {
        return value -> Optional
                .ofNullable(value)
                .filter(predicate)
                .map(function);
    }
}
