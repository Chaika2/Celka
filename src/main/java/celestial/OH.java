/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Oy_1;
import java.util.function.Consumer;

public class OH<T>
implements Oy_1 {
    private final Class<T> id_class;
    private final int id_break;
    private final Consumer<T> id_byte;
    private Object id_protected;

    @Override
    public int id_byte() {
        return this.id_break;
    }

    public OH(Class<T> clazz, int n, Consumer<T> consumer) {
        this.id_class = clazz;
        this.id_break = n;
        this.id_byte = consumer;
    }

    public OH(Class<T> clazz, Consumer<T> consumer) {
        this(clazz, 0, consumer);
    }

    public Class<T> id_class() {
        return this.id_class;
    }

    @Override
    public void id_class(Object object) {
        this.id_byte.accept(object);
    }

    @Override
    public Object id_break() {
        return this.id_protected;
    }

    @Override
    public void id_break(Object object) {
        this.id_protected = object;
    }

    @Override
    public boolean id_protected() {
        return false;
    }
}

