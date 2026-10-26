/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.WQ;
import celestial.kE_2;
import celestial.rCL;
import celestial.rCN;
import celestial.rCc_1;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpa_3;
import celestial.rpr_3;
import celestial.rqd_3;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zg_3;
import java.util.Random;

public class Wc_1
extends WQ {
    public static final rCc_1 id_final = kE_2.p;
    public static final rCN id_package = WQ.id_volatile;

    protected Wc_1(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_final, rpr_3.NORTH)).id_class(id_package, true));
    }

    @Override
    protected boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        rpr_3 rpr_32 = xc_32.id_byte(id_final).id_case();
        return rYB2.id_break(rfH_22.id_break(rpr_32), rpr_32);
    }

    @Override
    public int id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rpr_3 rpr_32) {
        return xc_32.id_byte(id_package) != false && xc_32.id_byte(id_final) != rpr_32 ? 15 : 0;
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rqd_3 rqd_32) {
        return xu_3.rY.id_class(xc_32, rqd_32);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpa_3 rpa_32) {
        return xu_3.rY.id_class(xc_32, rpa_32);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_final, id_package);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random) {
        if (xc_32.id_byte(id_package).booleanValue()) {
            rpr_3 rpr_32 = xc_32.id_byte(id_final).id_case();
            double d = 0.27;
            double d2 = (double)rfH_22.b_() + 0.5 + (random.nextDouble() - 0.5) * 0.2 + 0.27 * (double)rpr_32.id_implements();
            double d3 = (double)rfH_22.c_() + 0.7 + (random.nextDouble() - 0.5) * 0.2 + 0.22;
            double d4 = (double)rfH_22.d_() + 0.5 + (random.nextDouble() - 0.5) * 0.2 + 0.27 * (double)rpr_32.id_extends();
            rYB2.id_class(this.id_new, d2, d3, d4, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return xu_3.rY.id_class(xc_32, rRR2, rfH_22);
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return zg_3.id_private(xc_32);
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = xu_3.rY.id_class(rxx_32);
        return xc_32 == null ? null : (xc_3)this.id_continue().id_class(id_final, xc_32.id_byte(id_final));
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        return xu_3.rY.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public String id_volatile() {
        return this.id_case().id_break();
    }
}

