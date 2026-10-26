/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rmb_3;
import celestial.rpr_3;
import celestial.ruu_3;

public class ruR_2
implements rmb_3<rpr_3> {
    @Override
    public rpr_3 id_class(rpr_3 rpr_32) {
        return rpr_32;
    }

    @Override
    public rpr_3 id_class(ruu_3 ruu_32) {
        return ruu_32.id_class(rpr_3.class);
    }

    @Override
    public void id_class(ruu_3 ruu_32, rpr_3 rpr_32) {
        ruu_32.id_class(rpr_32);
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

