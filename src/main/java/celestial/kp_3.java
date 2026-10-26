/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kX_2;
import celestial.rDg_1;
import celestial.rRR;
import celestial.rRq_1;
import celestial.rUx_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rls_3;
import celestial.rrEm_1;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class kp_3
extends xF_2
implements kX_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(5.0, 0.0, 5.0, 11.0, 6.0, 11.0);

    public kp_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return true;
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return (double)random.nextFloat() < 0.4;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rrEm_12, rfH_22, xc_32, random);
    }

    public boolean id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, xc_3 xc_32, Random random) {
        rDg_1<?, ?> rDg_12;
        rrEm_12.id_class(rfH_22, false);
        if (this == xu_3.rq) {
            rDg_12 = rUx_1.rw;
        } else {
            if (this != xu_3.rT) {
                rrEm_12.id_class(rfH_22, xc_32, 3);
                return false;
            }
            rDg_12 = rUx_1.rI;
        }
        if (rDg_12.id_class(rrEm_12, rrEm_12.id_else().id_implements(), random, rfH_22)) {
            return true;
        }
        rrEm_12.id_class(rfH_22, xc_32, 3);
        return false;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 object, Random random) {
        if (random.nextInt(25) == 0) {
            int n = 5;
            int n2 = 4;
            for (rfH_2 rfH_22 : rfH_2.id_class(((rfH_2)object).id_break(-4, -1, -4), ((rfH_2)object).id_break(4, 1, 4))) {
                if (!rrEm_12.id_byte(rfH_22).id_class(this) || --n > 0) continue;
                return;
            }
            Object object2 = ((rfH_2)object).id_break(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            for (int i = 0; i < 4; ++i) {
                if (rrEm_12.id_finally((rfH_2)object2) && xc_32.id_class((rRR)rrEm_12, (rfH_2)object2)) {
                    object = object2;
                }
                object2 = ((rfH_2)object).id_break(random.nextInt(3) - 1, random.nextInt(2) - random.nextInt(2), random.nextInt(3) - 1);
            }
            if (rrEm_12.id_finally((rfH_2)object2) && xc_32.id_class((rRR)rrEm_12, (rfH_2)object2)) {
                rrEm_12.id_class((rfH_2)object2, xc_32, 2);
            }
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        xc_3 xc_33 = rRR2.id_byte(rfH_23);
        if (xc_33.id_class(rls_3.T)) {
            return true;
        }
        return rRR2.id_class(rfH_22, 0) < 13 && this.id_catch(xc_33, rRR2, rfH_23);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_volatile;
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_implements(rRq_12, rfH_22);
    }
}

