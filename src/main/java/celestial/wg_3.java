/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rbB_2;
import celestial.th_3;

public class wg_3<T extends rbB_2>
extends th_3<T> {
    public wg_3(float f, boolean bl) {
        this(f, 0.0f, 64, bl ? 32 : 64);
    }

    protected wg_3(float f, float f2, int n, int n2) {
        super(f, f2, n, n2);
    }

    @Override
    public boolean id_class(T t) {
        return ((is_3)t).v();
    }
}

