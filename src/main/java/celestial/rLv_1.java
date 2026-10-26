/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rLp_1;
import celestial.rLq_1;
import celestial.ruu_3;

public class rLv_1
extends rLq_1 {
    private float id_volatile = Float.MAX_VALUE;
    private rLq_1 id_final;
    private boolean id_package;

    public rLv_1(rLq_1 rLq_12) {
        super(rLq_12.id_class, rLq_12.id_break, rLq_12.id_byte);
    }

    public rLv_1(int n, int n2, int n3) {
        super(n, n2, n3);
    }

    public rLq_1 id_class() {
        return this.id_final;
    }

    public static rLv_1 id_class(ruu_3 ruu_32) {
        rLv_1 rLv_12 = new rLv_1(ruu_32.readInt(), ruu_32.readInt(), ruu_32.readInt());
        rLv_12.id_finally = ruu_32.readFloat();
        rLv_12.id_extends = ruu_32.readFloat();
        rLv_12.id_implements = ruu_32.readBoolean();
        rLv_12.id_native = rLp_1.values()[ruu_32.readInt()];
        rLv_12.id_catch = ruu_32.readFloat();
        return rLv_12;
    }

    public void id_class(float f, rLq_1 rLq_12) {
        if (f < this.id_volatile) {
            this.id_volatile = f;
            this.id_final = rLq_12;
        }
    }

    public void id_break() {
        this.id_package = true;
    }
}

