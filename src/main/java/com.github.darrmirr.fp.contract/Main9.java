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
        var square = def((Integer x) -> x * x);
        var squareProtected = Contract
                .of((Integer value) -> value != null)
                .obligate(square);

        Integer x = null;

        try {
            var result = square.apply(x);
            System.out.println("square result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }

        var result = squareProtected.apply(x);
        System.out.println("square protected result : " + result);
    }
}
