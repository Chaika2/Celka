/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.an_3;
import celestial.dI_2;
import celestial.iB_2;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLR;
import celestial.rLY;
import celestial.rRO;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public class zU_2
extends dI_2 {
    public zU_2(rLR rLR2, Jq_1 jq_1) {
        super(rLR2, 8, jq_1);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, an_3 an_32) {
        iB_2 iB_22;
        if (!rYB2.id_continue && rYB2.id_abstract() != rRO.PEACEFUL && an_32 instanceof iB_2 && !(iB_22 = (iB_2)an_32).id_class(rye_3.id_int)) {
            iB_22.id_break(new rLY(rLD.id_this, 40));
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        rjC_2 rjC_22 = this.id_class(xc_32, (rRq_1)rYB2, rfH_22, rjm_3.id_break());
        rjU_2 rjU_22 = rjC_22.id_class().id_case();
        double d = (double)rfH_22.b_() + rjU_22.id_break;
        double d2 = (double)rfH_22.d_() + rjU_22.id_protected;
        for (int i = 0; i < 3; ++i) {
            if (!random.nextBoolean()) continue;
            rYB2.id_class(rLQ.id_double, d + random.nextDouble() / 5.0, (double)rfH_22.c_() + (0.5 - random.nextDouble()), d2 + random.nextDouble() / 5.0, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return super.id_catch(xc_32, rRq_12, rfH_22) || xc_32.id_class(xu_3.PR) || xc_32.id_class(xu_3.PY) || xc_32.id_class(xu_3.Po);
    }
}

