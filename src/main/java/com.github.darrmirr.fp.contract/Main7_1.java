package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract1;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 7_1:
 *
 *   static method move to Contract1 class
 */
public interface Main7_1 {

    static void main(String[] args) {
        var square = def((Integer x) -> x * x);
        var isIntPredicate = def((Integer value) -> value != null);

        Integer x = null;
        var result = Contract1.obligate(square, isIntPredicate)
                .apply(x);
        System.out.println("result : " + result);
    }
}
