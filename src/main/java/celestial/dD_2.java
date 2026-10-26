/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Qs_1;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCZ;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;

public class dD_2
extends kE_2 {
    public dD_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(p, rxx_32.id_case().id_case());
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{p});
    }

    @Override
    public Qs_1 id_protected(xc_3 xc_32) {
        return Qs_1.PUSH_ONLY;
    }
}

