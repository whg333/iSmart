package com.why.ismart.framework.util;

import java.util.Collection;
import java.util.Map;

/**
 * 类似org.springframework.util的Assert断言类
 * 
 * @author whg
 * @date 2016年6月18日 下午4:01:15
 */
public class AssertUtil {

    public static void isTrue(boolean expression) {
        isTrue(expression, "[Assertion failed] - this expression must be true");
    }
    
    public static void isTrue(boolean expression, String message) {
        if (!expression) {
            throw new IllegalArgumentException(message);
        }
    }
    
    public static void isNull(Object object) {
        isNull(object, "[Assertion failed] - the object argument must be null");
    }
    
    public static void isNull(Object object, String message) {
        if (object != null) {
            throw new IllegalArgumentException(message);
        }
    }
    
    public static void notNull(Object object) {
        notNull(object, "[Assertion failed] - this argument is required; it must not be null");
    }
    
    public static void notNull(Object object, String message) {
        if (object == null) {
            throw new IllegalArgumentException(message);
        }
    }
    
    public static void notEmpty(Object[] array) {
        notEmpty(array, "[Assertion failed] - this array must not be empty: it must contain at least 1 element");
    }
    
    public static void notEmpty(Object[] array, String message) {
        if (ArrayUtil.isEmpty(array)) {
            throw new IllegalArgumentException(message);
        }
    }
    
    public static void notEmpty(Collection<?> collection) {
        notEmpty(collection,
                "[Assertion failed] - this collection must not be empty: it must contain at least 1 element");
    }
    
    public static void notEmpty(Collection<?> collection, String message) {
        if (CollectionUtil.isEmpty(collection)) {
            throw new IllegalArgumentException(message);
        }
    }
    
    public static void notEmpty(Map<?, ?> map) {
        notEmpty(map, "[Assertion failed] - this map must not be empty; it must contain at least one entry");
    }
    
    public static void notEmpty(Map<?, ?> map, String message) {
        if (CollectionUtil.isEmpty(map)) {
            throw new IllegalArgumentException(message);
        }
    }
    
}
