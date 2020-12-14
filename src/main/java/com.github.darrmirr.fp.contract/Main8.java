package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 8:
 *
 *    Contract interface is used.
 */
public interface Main8 {

    static void main(String[] args) {
        var square = def((Integer x) -> x * x);
        var squareProtected = Contract
                .of((Integer value) -> value != null)
                .obligate(square);

        Integer x = null;
        var result = squareProtected.apply(x);
        System.out.println("square protected result : " + result);
    }
}
