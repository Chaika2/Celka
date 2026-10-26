/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;

public class Pc_1 {
    private Pc_1() {
    }

    public static Class<?> id_class(Type type) {
        return type instanceof Class ? (Class)type : (type instanceof ParameterizedType ? (Class)((ParameterizedType)type).getRawType() : null);
    }
}

