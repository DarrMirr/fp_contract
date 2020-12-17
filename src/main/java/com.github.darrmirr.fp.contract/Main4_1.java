package com.github.darrmirr.fp.contract;

import java.util.Optional;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 4:
 *
 *    Additional filter is added due to cube volume could not be negative
 */
public interface Main4_1 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> Optional
                .ofNullable(x)
                .filter(value -> value > 0)
                .map(value -> value * value * value)
        );

        Integer x = -3;
        var result = cubeVolume.apply(x);
        System.out.println("result : " + result);
    }
}
