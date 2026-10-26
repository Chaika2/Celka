/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jp_1;
import celestial.Jq_1;
import celestial.du_3;
import celestial.kX_2;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rrEm_1;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class zc_3
extends xF_2
implements kX_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 13.0, 14.0);

    @Override
    public Jp_1 id_byte() {
        return Jp_1.XYZ;
    }

    protected zc_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        du_3 du_32 = (du_3)(this == xu_3.a ? xu_3.GE : xu_3.Gs);
        if (du_32.id_continue().id_class((rRR)rrEm_12, rfH_22) && rrEm_12.id_finally(rfH_22.id_final())) {
            du_32.id_class((rRg_1)rrEm_12, rfH_22, 2);
        }
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return true;
    }
}

