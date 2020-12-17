package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract3;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 7_4:
 *
 *   Unit method "of()" is added to Contract3 in order to make contract creation more expressive
 */
public interface Main7_4 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x * x * x);
        var isPositiveNumber = Contract3.of((Integer value) -> value > 0);

        Integer x = null;
        var result = isPositiveNumber
                .obligate(cubeVolume)
                .apply(x);
        System.out.println("result : " + result);
    }
}
