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
        var cubeVolume = def((Integer x) -> x * x * x);
        // the same as Predicate<Integer> isPositiveNumber = (Integer value) -> value > 0;
        var isPositiveNumber = def((Integer value) -> value > 0);

        Integer x = null;
        var result = Optional
                .ofNullable(x)
                .filter(isPositiveNumber)
                .map(cubeVolume);
        System.out.println("result : " + result);
    }
}
