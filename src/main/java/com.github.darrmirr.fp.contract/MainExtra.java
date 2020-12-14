package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract;

import java.util.Objects;
import java.util.function.Predicate;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Extra example:
 *
 * Demonstration of applying multiply contract conditions
 */
public interface MainExtra {

    static void main(String[] args) {
        var cubeVolume = def((Integer x) -> x * x * x);
        var cubeVolumeProtected = Contract
                .of((Predicate<Integer>) Objects::nonNull)
                .and(number -> number > 0)
                .obligate(cubeVolume);

        var cubeVolumeProtected2 = Contract
                .of((Integer number) -> number < 20)
                .obligateAndFlat(cubeVolumeProtected);

        var result = cubeVolumeProtected.apply(-3);
        System.out.println("cube volume protected result : " + result);

        result = cubeVolumeProtected.apply(21);
        System.out.println("cube volume protected result : " + result);

        result = cubeVolumeProtected2.apply(21);
        System.out.println("cube volume protected 2 result : " + result);
    }
}
