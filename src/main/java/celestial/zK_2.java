/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.JY;
import celestial.Jq_1;
import celestial.an_3;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.xc_3;
import celestial.xd_3;

public class zK_2
extends JY {
    public static final rCm_1 id_int = rCT.H;
    private final int id_new;

    protected zK_2(int n, Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_int, 0));
        this.id_new = n;
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_int});
    }

    @Override
    protected xc_3 id_class(xc_3 xc_32, int n) {
        return (xc_3)xc_32.id_class(id_int, n);
    }

    @Override
    protected void id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        rRg_12.id_class((rhd_3)null, rfH_22, rqn_3.GI, rqL_2.BLOCKS, 0.3f, 0.90000004f);
    }

    @Override
    protected int id_break() {
        return 10;
    }

    @Override
    protected void id_break(rRg_1 rRg_12, rfH_2 rfH_22) {
        rRg_12.id_class((rhd_3)null, rfH_22, rqn_3.Gw, rqL_2.BLOCKS, 0.3f, 0.75f);
    }

    @Override
    protected int id_break(rYB rYB2, rfH_2 rfH_22) {
        int n = Math.min(rYB2.id_class(an_3.class, id_package.id_class(rfH_22)).size(), this.id_new);
        if (n > 0) {
            float f = (float)Math.min(this.id_new, n) / (float)this.id_new;
            return rfU_2.id_case(f * 15.0f);
        }
        return 0;
    }

    @Override
    protected int id_catch(xc_3 xc_32) {
        return xc_32.id_byte(id_int);
    }
}

