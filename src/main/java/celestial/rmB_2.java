/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rmb_3;
import celestial.ruu_3;

public class rmB_2
implements rmb_3<rdn_3> {
    @Override
    public rdn_3 id_class(rdn_3 rdn_32) {
        return rdn_32.id_implements();
    }

    @Override
    public rdn_3 id_class(ruu_3 ruu_32) {
        return ruu_32.id_extends();
    }

    @Override
    public void id_class(ruu_3 ruu_32, rdn_3 rdn_32) {
        ruu_32.id_class(rdn_32);
    }

    @Override
    public /* synthetic */ Object id_break(ruu_3 ruu_32) {
        return this.id_class(ruu_32);
    }
}

