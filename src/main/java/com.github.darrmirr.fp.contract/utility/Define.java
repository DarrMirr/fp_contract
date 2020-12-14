package com.github.darrmirr.fp.contract.utility;

import java.util.function.Function;
import java.util.function.Predicate;

/**
 * Utility interface to define shortly function with one parameter
 *
 */
public interface Define {


    static <T, R> Function<T, R> def(Function<T, R> function) {
        return function;
    }

    static <T> Predicate<T> def(Predicate<T> predicate) {
        return predicate;
    }
}
