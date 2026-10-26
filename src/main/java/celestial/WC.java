/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.QZ;
import celestial.kX_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rrEm_1;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class WC
extends xF_2
implements kX_2 {
    public static final rCm_1 id_volatile = rCT.y;
    protected static final rjC_2 id_final = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 12.0, 14.0);
    private final QZ id_package;

    protected WC(QZ qZ, Jq_1 jq_1) {
        super(jq_1);
        this.id_package = qZ;
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return (double)rYB2.id_int.nextFloat() < 0.45;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        this.id_class(rrEm_12, rfH_22, xc_32, random);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return true;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final;
    }

    public void id_class(rrEm_1 rrEm_12, rfH_2 rfH_22, xc_3 xc_32, Random random) {
        if (xc_32.id_byte(id_volatile) == 0) {
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile), 4);
        } else {
            this.id_package.id_class(rrEm_12, rrEm_12.id_else().id_implements(), rfH_22, xc_32, random);
        }
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (rrEm_12.id_package(rfH_22.id_final()) >= 9 && random.nextInt(7) == 0) {
            this.id_class(rrEm_12, rfH_22, xc_32, random);
        }
    }
}

