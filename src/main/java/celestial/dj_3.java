/*
 * Decompiled with CFR 0.152.
 * 
 * Could not load the following classes:
 *  com.google.common.collect.Lists
 */
package celestial;

import celestial.Jq_1;
import celestial.kh_3;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rLT;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXB;
import celestial.rXE;
import celestial.rXG;
import celestial.rXs_1;
import celestial.rYB;
import celestial.rdn_3;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rjw_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rzP_2;
import celestial.xN_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import com.google.common.collect.Lists;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class dj_3
extends xd_3
implements kh_3 {
    public static final rCm_1 id_volatile = rCT.A;
    protected final rXB id_final;
    private final List<rXE> id_int;
    public static final rjC_2 id_package = xd_3.id_class(0.0, 0.0, 0.0, 16.0, 8.0, 16.0);

    protected dj_3(rXB rXB2, Jq_1 jq_1) {
        super(jq_1);
        this.id_final = rXB2;
        this.id_int = Lists.newArrayList();
        this.id_int.add(rXB2.id_class(false));
        for (int i = 1; i < 8; ++i) {
            this.id_int.add(rXB2.id_class(8 - i, false));
        }
        this.id_int.add(rXB2.id_class(8, true));
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xd_3 xd_32, rfH_2 rfH_23, boolean bl) {
        if (this.id_class(rYB2, rfH_22, xc_32)) {
            rYB2.id_extends().id_class(rfH_22, xc_32.id_volatile().id_class(), this.id_final.id_class(rYB2));
        }
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (xc_32.id_volatile().id_break() || xc_33.id_volatile().id_break()) {
            rRg_12.id_extends().id_class(rfH_22, xc_32.id_volatile().id_class(), this.id_final.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, xc_3 xc_33, boolean bl) {
        if (this.id_class(rYB2, rfH_22, xc_32)) {
            rYB2.id_extends().id_class(rfH_22, xc_32.id_volatile().id_class(), this.id_final.id_class(rYB2));
        }
    }

    @Override
    public List<rdn_3> id_class(xc_3 xc_32, rzP_2 rzP_22) {
        return Collections.emptyList();
    }

    private boolean id_class(rYB rYB2, rfH_2 rfH_22, xc_3 xc_32) {
        if (this.id_final.id_class(rlG_2.id_byte)) {
            boolean bl = rYB2.id_byte(rfH_22.id_break()).id_class(xu_3.Po);
            for (rpr_3 rpr_32 : rpr_3.values()) {
                if (rpr_32 == rpr_3.DOWN) continue;
                rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
                if (rYB2.id_break(rfH_23).id_class(rlG_2.id_break)) {
                    xd_3 xd_32 = rYB2.id_break(rfH_22).id_break() ? xu_3.rg : xu_3.id_volatile;
                    rYB2.id_break(rfH_22, xd_32.id_continue());
                    this.id_class(rYB2, rfH_22);
                    return false;
                }
                if (!bl || !rYB2.id_byte(rfH_23).id_class(xu_3.hP)) continue;
                rYB2.id_break(rfH_22, xu_3.PK.id_continue());
                this.id_class(rYB2, rfH_22);
                return false;
            }
        }
        return true;
    }

    private void id_class(rRg_1 rRg_12, rfH_2 rfH_22) {
        rRg_12.id_byte(1501, rfH_22, 0);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return rjw_3.id_class();
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        xc_32.id_volatile().id_break(rrEm_12, rfH_22, random);
    }

    @Override
    public boolean id_class(xc_3 xc_32, xc_3 xc_33, rpr_3 rpr_32) {
        return xc_33.id_volatile().id_class().id_class(this.id_final);
    }

    @Override
    public xN_2 id_class(xc_3 xc_32) {
        return xN_2.INVISIBLE;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return !this.id_final.id_class(rlG_2.id_byte);
    }

    @Override
    public rXs_1 id_break(rRg_1 rRg_12, rfH_2 rfH_22, xc_3 xc_32) {
        if (xc_32.id_byte(id_volatile) == 0) {
            rRg_12.id_class(rfH_22, xu_3.id_class.id_continue(), 11);
            return this.id_final;
        }
        return rXG.id_class;
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return rjm_32.id_class(id_package, rfH_22, true) && xc_32.id_byte(id_volatile) == 0 && rjm_32.id_class(rRq_12.id_break(rfH_22.id_final()), this.id_final) ? id_package : rjw_3.id_class();
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        int n = xc_32.id_byte(id_volatile);
        return this.id_int.get(Math.min(n, 8));
    }

    @Override
    public boolean a_(xc_3 xc_32) {
        return xc_32.id_volatile().id_case();
    }

    @Override
    public boolean a_(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return false;
    }
}

