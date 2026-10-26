/*
 * Decompiled with CFR 0.152.
 */
package celestial;

public class On_1
extends RuntimeException {
    public On_1(Class<?> clazz) {
        super("No registered lambda listener for '" + clazz.getName() + "'.");
    }
}

