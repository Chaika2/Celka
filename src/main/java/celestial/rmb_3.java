/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rut_3;
import celestial.ruu_3;

public interface rmb_3<T> {
    public T id_class(T var1);

    default public rut_3<T> id_class(int n) {
        return new rut_3(n, this);
    }

    public void id_class(ruu_3 var1, T var2);

    public T id_break(ruu_3 var1);
}

