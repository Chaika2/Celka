/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.W;

public interface C_import {
    public String id_byte();

    public <T> T id_byte(Class<T> var1) throws W;

    public <T, S> boolean id_class(Class<T> var1, Class<S> var2, S var3);

    public <T> boolean id_class(Class<T> var1);

    public int id_class();

    public <T, S> T id_break(Class<T> var1, Class<S> var2, S var3) throws W;

    public String id_break();

    public <E extends Enum<?>> E id_break(Class<E> var1) throws W;
}

