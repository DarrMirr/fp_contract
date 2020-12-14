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
        var square = def((Integer x) -> x * x);
        var isIntPredicate = def((Integer value) -> value != null);

        Integer x = null;
        var result = obligate(square, isIntPredicate)
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
