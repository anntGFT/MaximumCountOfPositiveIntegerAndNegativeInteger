package org.example;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    static Solution solution;

    int result;
    int[] nums;

    @BeforeAll
    static void setup(){

        solution = new Solution();
    }

    @Test
    public void emptyArray(){

        result = 0;
        nums = new int[] {};

        assertEquals(result, solution.maximumCount(nums));
    }

    @Test
    public void arrayWithOnlyZeros(){

        result = 0;
        nums = new int[] {0,0,0};

        assertEquals(result, solution.maximumCount(nums));
    }

    @Test
    public void arrayWithOnlyPositives(){

        result = 3;
        nums = new int[] {1,3,44};

        assertEquals(result, solution.maximumCount(nums));
    }

    @Test
    public void arrayWithOnlyNegatives(){

        result = 3;
        nums = new int[] {-1,-3,-44};

        assertEquals(result, solution.maximumCount(nums));
    }

    @Test
    public void arrayWithMoreNegativesThanPositives(){

        result = 2;
        nums = new int[] {-1,-3,44};

        assertEquals(result, solution.maximumCount(nums));
    }
}
