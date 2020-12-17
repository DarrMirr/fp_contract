package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract1;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 7_1:
 *
 *   static method move to Contract1 class
 */
public interface Main7_2 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x * x * x);
        var isPositiveNumber = def((Integer value) -> value > 0);

        Integer x = null;
        var result = Contract1.obligate(cubeVolume, isPositiveNumber)
                .apply(x);
        System.out.println("result : " + result);
    }
}
