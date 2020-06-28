/*
 * Copyright 2019 All rights reserved.
 */

package cn.muses.design.component.strategy;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @author miaoqiang
 * @date 2020/6/28.
 */
public abstract class AbstractStrategyAnnotation implements Annotation {

    @Override
    public boolean equals(Object var1) {
        if (var1 == this) {
            return true;
        } else if (!this.annotationType().isInstance(var1)) {
            return false;
        } else {
            Map<String, Object> var0Map = getMemberValues(this);
            Map<String, Object> var1Map = getMemberValues((Annotation) var1);
            return !var0Map.entrySet().stream().anyMatch(e -> {
                if (null == e.getValue()) {
                    return null != var1Map.get(e.getKey());
                } else {
                    return !e.getValue().equals(var1Map.get(e.getKey()));
                }
            });
        }
    }

    @Override
    public int hashCode() {
        int var1 = 0;
        Map.Entry var3;
        for (Iterator var2 = getMemberValues(this).entrySet().iterator(); var2.hasNext();
            var1 += 127 * ((String) var3.getKey()).hashCode() ^ memberValueHashCode(var3.getValue())) {
            var3 = (Map.Entry) var2.next();
        }

        return var1;
    }

    private static <T extends Annotation> Map<String, Object> getMemberValues(T annotation) {
        return Arrays.stream(annotation.annotationType().getDeclaredMethods())
            .collect(Collectors.toMap(m -> m.getName(), m -> {
                try {
                    return m.invoke(annotation);
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
                return null;
            }));
    }

    private static int memberValueHashCode(Object var0) {
        Class var1 = var0.getClass();
        if (!var1.isArray()) {
            return var0.hashCode();
        } else if (var1 == byte[].class) {
            return Arrays.hashCode((byte[]) ((byte[]) var0));
        } else if (var1 == char[].class) {
            return Arrays.hashCode((char[]) ((char[]) var0));
        } else if (var1 == double[].class) {
            return Arrays.hashCode((double[]) ((double[]) var0));
        } else if (var1 == float[].class) {
            return Arrays.hashCode((float[]) ((float[]) var0));
        } else if (var1 == int[].class) {
            return Arrays.hashCode((int[]) ((int[]) var0));
        } else if (var1 == long[].class) {
            return Arrays.hashCode((long[]) ((long[]) var0));
        } else if (var1 == short[].class) {
            return Arrays.hashCode((short[]) ((short[]) var0));
        } else {
            return var1 == boolean[].class ? Arrays.hashCode((boolean[]) ((boolean[]) var0))
                : Arrays.hashCode((Object[]) ((Object[]) var0));
        }
    }
}
