/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rJP;
import celestial.rJr_1;
import celestial.rWE;
import celestial.rWr_1;
import celestial.rXu_1;
import celestial.rhN_2;
import celestial.rke_3;
import celestial.rkw_3;

public abstract class rJI<C extends rXu_1>
extends rJr_1 {
    public abstract int id_byte();

    public rJI(rJP<?> rJP2, int n) {
        super(rJP2, n);
    }

    public abstract void id_class();

    public abstract boolean id_class(rkw_3<? super C> var1);

    public void id_class(boolean bl, rkw_3<?> rkw_32, rhN_2 rhN_22) {
        new rWE(this).id_class(rhN_22, rkw_32, bl);
    }

    public abstract void id_class(rWr_1 var1);

    public abstract int id_break();

    public abstract int id_throws();

    public abstract rke_3 id_implements();

    public abstract int id_protected();
}

