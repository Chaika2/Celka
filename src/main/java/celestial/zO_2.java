/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.dO_2;
import celestial.kE_2;
import celestial.kX_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCZ;
import celestial.rCm_1;
import celestial.rRq_1;
import celestial.rYB;
import celestial.rdb_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rpb_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import celestial.zh_3;
import java.util.Random;

public class zO_2
extends xF_2
implements kX_2 {
    public static final rCm_1 id_volatile = rCT.d;
    protected static final rjC_2[] id_final = new rjC_2[]{xd_3.id_class(7.0, 0.0, 7.0, 9.0, 2.0, 9.0), xd_3.id_class(7.0, 0.0, 7.0, 9.0, 4.0, 9.0), xd_3.id_class(7.0, 0.0, 7.0, 9.0, 6.0, 9.0), xd_3.id_class(7.0, 0.0, 7.0, 9.0, 8.0, 9.0), xd_3.id_class(7.0, 0.0, 7.0, 9.0, 10.0, 9.0), xd_3.id_class(7.0, 0.0, 7.0, 9.0, 12.0, 9.0), xd_3.id_class(7.0, 0.0, 7.0, 9.0, 14.0, 9.0), xd_3.id_class(7.0, 0.0, 7.0, 9.0, 16.0, 9.0)};
    private final zh_3 id_package;

    protected zO_2(zh_3 zh_32, Jq_1 jq_1) {
        super(jq_1);
        this.id_package = zh_32;
        this.id_extends((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 0));
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        return id_final[xc_32.id_byte(id_volatile)];
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return xc_32.id_byte(id_volatile) != 7;
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        int n = Math.min(7, xc_32.id_byte(id_volatile) + rfU_2.id_class(rrEm_12.id_int, 2, 5));
        xc_3 xc_33 = (xc_3)xc_32.id_class(id_volatile, n);
        rrEm_12.id_class(rfH_22, xc_33, 2);
        if (n == 7) {
            xc_33.id_break(rrEm_12, rfH_22, rrEm_12.id_int);
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(new rCZ[]{id_volatile});
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        float f;
        if (rrEm_12.id_class(rfH_22, 0) >= 9 && random.nextInt((int)(25.0f / (f = dO_2.id_class(this, rrEm_12, rfH_22))) + 1) == 0) {
            int n = xc_32.id_byte(id_volatile);
            if (n < 7) {
                xc_32 = (xc_3)xc_32.id_class(id_volatile, n + 1);
                rrEm_12.id_class(rfH_22, xc_32, 2);
            } else {
                rpr_3 rpr_32 = rpb_3.HORIZONTAL.id_class(random);
                rfH_2 rfH_23 = rfH_22.id_break(rpr_32);
                xc_3 xc_33 = rrEm_12.id_byte(rfH_23.id_break());
                if (rrEm_12.id_byte(rfH_23).id_catch() && (xc_33.id_class(xu_3.PS) || xc_33.id_class(xu_3.id_finally) || xc_33.id_class(xu_3.id_extends) || xc_33.id_class(xu_3.id_native) || xc_33.id_class(xu_3.id_implements))) {
                    rrEm_12.id_break(rfH_23, this.id_package.id_continue());
                    rrEm_12.id_break(rfH_22, (xc_3)this.id_package.id_implements().id_continue().id_class(kE_2.p, rpr_32));
                }
            }
        }
    }

    @Override
    public rdn_3 id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32) {
        rdb_3 rdb_32 = this.id_break();
        return rdb_32 == null ? rdn_3.id_break : new rdn_3(rdb_32);
    }

    protected rdb_3 id_break() {
        if (this.id_package == xu_3.Pg) {
            return rdy_3.Jk;
        }
        return this.id_package == xu_3.Bg ? rdy_3.JW : null;
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return xc_32.id_class(xu_3.PS);
    }

    public zh_3 id_implements() {
        return this.id_package;
    }
}

