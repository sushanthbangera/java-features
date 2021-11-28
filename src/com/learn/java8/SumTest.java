package com.learn.java8;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

public class SumTest {

    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 6, 7, 2, 3);
        System.out.println(getSum(integerList));

        long maxInterval = 2000
                * BigDecimal.valueOf(3).pow(10 - 1).longValue();



        System.out.println(maxInterval);

    }

    public static Integer  getSum(List<Integer> list) {
        return list.stream().reduce(0, (a, b) -> a + b);
    }

}
