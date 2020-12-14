package com.github.darrmirr.fp.contract;

import com.github.darrmirr.fp.contract.utility.Contract2;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 7_2:
 *
 *   Contract2 extend Predicate interface in order to remove method argument with Predicate type
 */
public interface Main7_2 {

    static void main(String[] args) {
        var square = def((Integer x) -> x * x);
        Contract2 isIntPredicate = (Integer value) -> value != null;

        Integer x = null;
        var result = isIntPredicate
                .obligate(square)
                .apply(x);
        System.out.println("result : " + result);
    }
}
