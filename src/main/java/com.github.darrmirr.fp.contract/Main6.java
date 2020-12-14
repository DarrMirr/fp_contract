package com.github.darrmirr.fp.contract;

import java.util.Optional;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 6:
 *
 *    Predicate function is moved to local variable
 */
public interface Main6 {

    static void main(String[] args) {
        var square = def((Integer x) -> x * x);
        // the same as Predicate<Integer> isIntPredicate = value -> value != null;
        var isIntPredicate = def((Integer value) -> value != null);

        Integer x = null;
        var result = Optional
                .ofNullable(x)
                .filter(isIntPredicate)
                .map(square);
        System.out.println("result : " + result);
    }
}
