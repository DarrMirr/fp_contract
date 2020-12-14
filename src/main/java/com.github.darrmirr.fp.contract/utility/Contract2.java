package com.github.darrmirr.fp.contract.utility;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Version of Contract interface for example 7_2
 */
public interface Contract2 extends Predicate<Integer> {

    /**
     * Obligate (Wrap) function by contract.
     * Result is function that test input value by contract before value is passed to function
     *
     * Caution! non NPE-free version of obligate method
     *
     * @param function function to obligate
     * @return function wrapped by contract
     */
    default Function<Integer, Optional<Integer>> obligate(Function<Integer, Integer> function) {
        return value -> Optional
                .ofNullable(value)
                .filter(this)
                .map(function);
    }
}
