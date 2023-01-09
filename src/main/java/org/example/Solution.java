package org.example;

public class Solution {
    public Solution() {

    }

    public int maximumCount(int[] nums) {

        int contPos = 0;
        int contNeg = 0;

        for (int num : nums) {

            if (num > 0) {

                contPos++;
            } else if (num < 0) {

                contNeg++;
            }
        }

        return Math.max(contPos, contNeg);
    }
}