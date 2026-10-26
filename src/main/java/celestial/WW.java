/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.WQ;
import celestial.rCL;
import celestial.rCN;
import celestial.rCZ;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class WW
extends xd_3 {
    public static final rCN id_volatile = WQ.id_volatile;

    public WW(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)this.id_continue().id_class(id_volatile, false));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        return (xc_3)this.id_continue().id_class(id_volatile, rxx_32.id_int().id_public(rxx_32.id_class()));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        boolean bl2;
        if (!rYB2.id_continue && (bl2 = xc_32.id_byte(id_volatile).booleanValue()) != rYB2.id_public(rfH_22)) {
            if (bl2) {
                rYB2.id_finally().id_class(rfH_22, this, 4);
            } else {
                rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile), 2);
            }
        }
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_volatile).booleanValue() && !rrEm_12.id_public(rfH_22)) {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile), 2);
        }
    }
}

