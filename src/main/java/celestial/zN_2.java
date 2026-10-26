/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.du_3;
import celestial.kX_2;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import java.util.Random;

public class zN_2
extends du_3
implements kX_2 {
    public zN_2(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        zN_2.id_class(rrEm_12, rfH_22, new rdn_3(this));
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return true;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rxx_3 rxx_32) {
        return false;
    }
}

