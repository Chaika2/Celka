/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRq_1;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rrEm_1;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class kf_3
extends xF_2 {
    public static final rCm_1 id_volatile = rCT.J;
    private static final rjC_2[] id_final = new rjC_2[]{xd_3.id_class(0.0, 0.0, 0.0, 16.0, 5.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 11.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 14.0, 16.0)};

    protected kf_3(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        int n = xc_32.id_byte(id_volatile);
        if (n < 3 && random.nextInt(10) == 0) {
            xc_32 = (xc_3)xc_32.id_class(id_volatile, n + 1);
            rrEm_12.id_class(rfH_22, xc_32, 2);
        }
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final[xc_32.id_byte(id_volatile)];
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        return new rdn_3(rdy_3.JL);
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_class(xu_3.PY);
    }

    @Override
    public boolean a_(xc_3 xc_32) {
        return xc_32.id_byte(id_volatile) < 3;
    }
}

