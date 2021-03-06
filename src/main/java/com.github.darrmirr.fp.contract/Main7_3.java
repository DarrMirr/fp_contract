package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract2;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 7_3:
 *
 *   Contract2 extend Predicate interface in order to remove method's obligate argument with Predicate type
 */
public interface Main7_3 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x * x * x);
        Contract2 isPositiveNumber = (Integer value) -> value > 0;

        Integer x = null;
        var result = isPositiveNumber
                .obligate(cubeVolume)
                .apply(x);
        System.out.println("result : " + result);
    }
}
