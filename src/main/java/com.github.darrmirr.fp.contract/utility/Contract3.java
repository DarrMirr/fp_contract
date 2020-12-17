package com.github.darrmirr.fp.contract.utility;

import java.util.Optional;
import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Version of Contract interface for example 7_4
 */
@FunctionalInterface
public interface Contract3 extends Predicate<Integer> {

    /**
     * Method to create new instance of Contract function
     *
     * @param contract predicate function that would be evaluate whether input value conform to contract or not
     * @return contract function
     */
    static Contract3 of(Predicate<Integer> contract) {
        return contract::test;
    }

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
