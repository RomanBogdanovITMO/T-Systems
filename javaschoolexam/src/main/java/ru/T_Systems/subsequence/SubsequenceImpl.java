package ru.T_Systems.subsequence;

import ru.T_Systems.subsequence.Subsequence;

import java.util.List;

public class SubsequenceImpl implements Subsequence {


    public boolean find(List<?> x, List<?> y) {
        boolean flag = true;

        int k = 0;
        for (int i = 0; i < x.size(); i++) {
            if (!flag) {
                break;
            }
            flag = false;
            for (int j = k; j < y.size(); j++) {
                if (y.get(j).equals(x.get(i))) {
                    k = j + 1;
                    flag = true;
                    break;

                }
            }
        }
        return flag;
    }
}
