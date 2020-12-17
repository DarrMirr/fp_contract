package com.github.darrmirr.fp.contract.utility;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Version of Contract interface for example 7_2
 */
public interface Contract1 {

    static Function<Integer, Optional<Integer>> obligate(Function<Integer, Integer> function, Predicate<Integer> predicate) {
        return value -> Optional
                .ofNullable(value)
                .filter(predicate)
                .map(function);
    }
}
