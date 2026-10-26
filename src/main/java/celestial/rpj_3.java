/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rpF_2;
import celestial.rpR_2;
import celestial.rpV_2;
import celestial.rpg_3;

public abstract class rpj_3 {
    private int id_class;

    public boolean id_byte() {
        int n = this.id_break();
        boolean bl = n != this.id_class;
        this.id_class = n;
        return bl;
    }

    public abstract void id_class(int var1);

    public static rpj_3 id_class() {
        return new rpR_2();
    }

    public static rpj_3 id_class(rpF_2 rpF_22, int n) {
        return new rpV_2(rpF_22, n);
    }

    public static rpj_3 id_class(int[] nArray, int n) {
        return new rpg_3(nArray, n);
    }

    public abstract int id_break();
}

