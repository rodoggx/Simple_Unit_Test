package com.example.simpleunittest;

/**
 * Created by RodoggX on 8/16/2016.
 */
public class CalculatorHelper {
    public int sumItems(int n1, int n2) {
        int n3 = n1 + n2;
        return n3;
    }
    public int multiplyItems(int n1, int n2) {
        int total = 0;
        for (int i = 0; i < n2 ; i++) {
            total += n1;
        }
            return total;
    }
    public int powerItems(int n1, int n2) {
        if (n2 == 0)
            return 1;
        int answer = n1;
        int increment = n1;
        int i, j;
        for(i = 1; i < n2; i++)
        {
            for(j = 1; j < n1; j++)
            {
                answer += increment;
            }
            increment = answer;
        }
        return answer;
    }

}
