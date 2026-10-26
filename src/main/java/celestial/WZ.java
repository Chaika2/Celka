/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.Wk_1;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rLc_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rff_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rxx_3;
import celestial.ryZ_2;
import celestial.xc_3;
import celestial.xd_3;
import java.util.Random;

public class WZ
extends Wk_1 {
    public static final rCN id_volatile = rCT.id_super;
    public static final rCm_1 id_int = rCT.Q;

    protected WZ(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(p, rpr_3.NORTH)).id_class(id_int, 1)).id_class(id_volatile, false)).id_class(id_package, false));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_package).booleanValue()) {
            rpr_3 rpr_32 = xc_32.id_byte(p);
            double d = (double)rfH_22.b_() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            double d2 = (double)rfH_22.c_() + 0.4 + (random.nextDouble() - 0.5) * 0.2;
            double d3 = (double)rfH_22.d_() + 0.5 + (random.nextDouble() - 0.5) * 0.2;
            float f = -5.0f;
            if (random.nextBoolean()) {
                f = xc_32.id_byte(id_int) * 2 - 1;
            }
            double d4 = (f /= 16.0f) * (float)rpr_32.id_implements();
            double d5 = f * (float)rpr_32.id_extends();
            rYB2.id_class(rLc_1.id_class, d + d4, d2, d3 + d5, 0.0, 0.0, 0.0);
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(p, id_int, id_volatile, id_package);
    }

    @Override
    public ryZ_2 id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, rhd_3 rhd_32, rpm_3 rpm_32, rff_3 rff_32) {
        if (!((rhx_3)rhd_32.id_implements[18]).id_throws) {
            return ryZ_2.PASS;
        }
        rYB2.id_class(rfH_22, (xc_3)xc_32.id_class(id_int), 3);
        return ryZ_2.id_class(rYB2.id_continue);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return !rRg_12.id_import() && rpr_32.id_final() != xc_32.id_byte(p).id_final() ? (xc_3)xc_32.id_class(id_volatile, this.id_class((rRR)rRg_12, rfH_22, xc_32)) : super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = super.id_class(rxx_32);
        return (xc_3)xc_32.id_class(id_volatile, this.id_class((rRR)rxx_32.id_int(), rxx_32.id_class(), xc_32));
    }

    @Override
    public boolean id_class(rRR rRR2, rfH_2 rfH_22, xc_3 xc_32) {
        return this.id_break(rRR2, rfH_22, xc_32) > 0;
    }

    @Override
    protected boolean id_implements(xc_3 xc_32) {
        return WZ.id_volatile(xc_32);
    }

    @Override
    protected int id_private(xc_3 xc_32) {
        return xc_32.id_byte(id_int) * 2;
    }
}

