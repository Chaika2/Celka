/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import java.lang.reflect.Array;
import java.util.ArrayDeque;

public class rrka_1 {
    private Class id_class = null;
    private int id_break = 0;
    private ArrayDeque id_byte = new ArrayDeque();

    public rrka_1(Class clazz, int n) {
        this.id_class = clazz;
        this.id_break = n;
    }

    public synchronized Object id_class(int n) {
        Object object = this.id_byte.pollLast();
        if (object == null || Array.getLength(object) < n) {
            object = Array.newInstance(this.id_class, n);
        }
        return object;
    }

    public synchronized void id_class(Object object) {
        if (object != null) {
            Class<?> clazz = object.getClass();
            if (clazz.getComponentType() != this.id_class) {
                throw new IllegalArgumentException("Wrong component type");
            }
            if (this.id_byte.size() < this.id_break) {
                this.id_byte.add(object);
            }
        }
    }
}

