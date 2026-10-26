/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dO_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpL_2;
import celestial.rrEm_1;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class xh_3
extends dO_2 {
    public static final rCm_1 id_volatile = rCT.J;
    private static final rjC_2[] id_package = new rjC_2[]{xd_3.id_class(0.0, 0.0, 0.0, 16.0, 2.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 4.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 6.0, 16.0), xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0)};

    public xh_3(Jq_1 jq_1) {
        super(jq_1);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_package[xc_32.id_byte(this.id_break())];
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (random.nextInt(3) != 0) {
            super.id_class(xc_32, rrEm_12, rfH_22, random);
        }
    }

    @Override
    protected int id_class(rYB rYB2) {
        return super.id_class(rYB2) / 3;
    }

    @Override
    public rCm_1 id_break() {
        return id_volatile;
    }

    @Override
    protected rpL_2 id_finally() {
        return rdy_3.kJ;
    }

    @Override
    public int id_implements() {
        return 3;
    }
}

