package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract3;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 7_3:
 *
 *   Unit method "of()" is added to Contract3 in order to make contract creation more expressive
 */
public interface Main7_3 {

    static void main(String[] args) {
        var square = def((Integer x) -> x * x);
        var isIntPredicate = Contract3.of((Integer value) -> value != null);

        Integer x = null;
        var result = isIntPredicate
                .obligate(square)
                .apply(x);
        System.out.println("result : " + result);
    }
}
