/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rdn_3;
import celestial.rkf_3;
import celestial.rkg_3;
import celestial.rkj_3;
import celestial.rkv_3;
import celestial.rqO_2;
import celestial.xu_3;

public class rWQ
extends rkv_3 {
    public rWQ(rqO_2 rqO_22, String string, rkg_3 rkg_32, rdn_3 rdn_32, float f, int n) {
        super(rkj_3.id_protected, rqO_22, string, rkg_32, rdn_32, f, n);
    }

    @Override
    public rdn_3 id_private() {
        return new rdn_3(xu_3.hi);
    }

    @Override
    public rkf_3<?> W_() {
        return rkf_3.id_continue;
    }
}

