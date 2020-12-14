package com.github.darrmirr.fp.contract;

import static com.github.darrmirr.fp.contract.utility.Define.def;

/**
 * Example 1:
 *
 *     NPE is thrown during code execution
 */
public interface Main1 {

    static void main(String[] args) {
        // the same as Function<Integer, Integer> square = (Integer x) -> x * x;
        var square = def((Integer x) -> x * x);
        Integer x = null;
        var result = square.apply(x);
        System.out.println("square result : " + result);
    }
}
