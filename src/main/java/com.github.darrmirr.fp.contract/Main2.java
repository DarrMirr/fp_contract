package com.github.darrmirr.fp.contract;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 2:
 *
 *     NPE is replaced by user-defined exception. IllegalArgumentException is used as "used-defined" one.
 */
public interface Main2 {

    static void main(String[] args) {
        var square = def((Integer x) -> {
            if(x != null) return x * x;
            else throw new IllegalArgumentException("input argument is null");
        });
        Integer x = null;
        var result = square.apply(x);
        System.out.println("square result : " + result);
    }
}