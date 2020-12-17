package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 8:
 *
 *    Contract interface is used.
 *
 *    Condition `(Integer value) -> value != null` is added due to
 *    obligate method implementation is changed to NPE-free one
 */
public interface Main8 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x * x * x);
        var cubeVolumeProtected = Contract
                .of((Integer value) -> value != null)
                .and(number -> number > 0)
                .obligate(cubeVolume);

        Integer x = null;
        var result = cubeVolumeProtected.apply(x);
        System.out.println("result : " + result);
    }
}
