package com.github.darrmirr.fp.contract;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 3:
 *
 *     IllegalArgumentException is replace by special number.
 *     This number means error occur during lambda's code execution.
 */
public interface Main3 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x != null ? x * x * x: -1);
        Integer x = null;
        var result = cubeVolume.apply(x);
        System.out.println("result : " + result);
    }
}
