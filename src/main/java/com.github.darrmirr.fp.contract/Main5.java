package com.github.darrmirr.fp.contract;

import java.util.Optional;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 5:
 *
 *    Code snippet with Optional move out from lambda body
 */
public interface Main5 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x * x * x);
        Integer x = null;
        var result = Optional
                .ofNullable(x)
                .filter(value -> value > 0)
                .map(cubeVolume);
        System.out.println("result : " + result);
    }
}
