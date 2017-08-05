package com.journaldev.spring.di.test;

/**
 * Created by snjvkalangi on 8/5/2017.
 */

import java.util.Arrays;
import java.util.Collections;

public class Solution {

    public static void main(String[] args) {


        Integer[] calories = new Integer[]{819, 701 ,578 ,403 ,50 ,400 ,983 ,665 ,510 ,523 ,696 ,532 ,51 ,449 ,333 ,234 ,
            958 ,460 ,277 ,347 ,950 ,53 ,123 ,227, 646 ,190 ,938 ,61 ,409 ,110 ,61 ,178 ,659 ,989 ,625 ,237 ,944 ,550 ,954 ,439};

        Arrays.sort(calories);
        long distance=0;
        int i=0;
        for(int j=39;j>=0;j--){

            distance+=(calories[j]*Math.pow(2,i++));

        }
        // your code goes here
        System.out.println(distance);
        System.out.println(minimumMiles(calories));

    }

    private static long minimumMiles(Integer [] calories) {
        Arrays.sort(calories, Collections.reverseOrder());
        long multiplier = 1;
        long miles = 0;
        for (int j = 0; j < calories.length; j++) {
            miles += calories[j] * multiplier;
            multiplier *= 2;
        }
        return miles;
    }
}