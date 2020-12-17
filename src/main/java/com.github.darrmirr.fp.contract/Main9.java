package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 9:
 *
 *    Final example. Demonstration using square with contract and without it.
 */
public interface Main9 {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x * x * x);
        var cubeVolumeProtected = Contract
                .of((Integer value) -> value != null)
                .and(number -> number > 0)
                .obligate(cubeVolume);

        Integer x = null;

        try {
            var result = cubeVolume.apply(x);
            System.out.println("cubeVolume result : " + result);
        } catch (Exception e) {
            System.out.println("cubeVolune failed due to x = " + x);
        }

        var result = cubeVolumeProtected.apply(x);
        System.out.println("cubeVolume protected result : " + result);
    }
}
