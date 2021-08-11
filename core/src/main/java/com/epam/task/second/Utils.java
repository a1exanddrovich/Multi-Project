package com.epam.task.second;

import com.epam.task.first.StringUtils;

public class Utils {

    public boolean isAllPositiveNumbers(String... str) {
        StringUtils utils = new StringUtils();
        for (String number : str) {
            if (!utils.isPositiveNumbers(number)) {
                return false;
            }
        }
        return true;
    }

}
