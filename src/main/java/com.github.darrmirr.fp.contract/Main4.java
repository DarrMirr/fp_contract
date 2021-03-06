package com.github.darrmirr.fp.contract;


import java.util.Optional;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 4:
 *
 *    Special error number is replaced by Optional
 */
public interface Main4 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> Optional
                .ofNullable(x)
                .map(value -> value * value * value)
        );

        Integer x = null;
        var result = cubeVolume.apply(x);
        System.out.println("result : " + result);
    }
}
