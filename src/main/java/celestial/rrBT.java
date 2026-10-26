/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rrBt_1;

public interface rrBT
extends rrBt_1 {
    @Override
    default public int id_class(int n) {
        return n - 1;
    }

    @Override
    default public int id_break(int n) {
        return n - 1;
    }
}

