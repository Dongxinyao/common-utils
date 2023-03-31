package com.zhouzhou.utils;

/**
 * pre-processing string
 */
public class StringUtils {

    public boolean isEmpty(Object s) {
        if (s instanceof String && (!"".equals(s))) {
            return false;
        }
        return true;
    }

    public boolean isNotEmpty(Object s) {
        return !isEmpty(s);
    }

    public boolean leastOneIsEmpty(Object... objects) {
        for (Object o : objects) {
            if (isEmpty(o)) {
                return true;
            }
        }
        return false;
    }

}
