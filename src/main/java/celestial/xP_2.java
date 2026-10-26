/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jp_1;
import celestial.Jq_1;
import celestial.kX_2;
import celestial.rCL;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rCu_1;
import celestial.rCy_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rjC_2;
import celestial.rjU_2;
import celestial.rjm_3;
import celestial.rkx_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class xP_2
extends xd_3
implements kX_2 {
    protected static final rjC_2 id_volatile = xd_3.id_class(5.0, 0.0, 5.0, 11.0, 16.0, 11.0);
    protected static final rjC_2 id_final = xd_3.id_class(3.0, 0.0, 3.0, 13.0, 16.0, 13.0);
    protected static final rjC_2 id_package = xd_3.id_class(6.5, 0.0, 6.5, 9.5, 16.0, 9.5);
    public static final rCm_1 id_int = rCT.h;
    public static final rCu_1<rCy_1> id_new = rCT.o;
    public static final rCm_1 id_continue = rCT.y;

    @Override
    public Jp_1 id_byte() {
        return Jp_1.XZ;
    }

    public xP_2(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_int, 0)).id_class(id_new, rCy_1.NONE)).id_class(id_continue, 0));
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        int n;
        int n2 = this.id_class(rRq_12, rfH_22);
        return n2 + (n = this.id_break(rRq_12, rfH_22)) + 1 < 16 && rRq_12.id_byte(rfH_22.id_break(n2)).id_byte(id_continue) != 1;
    }

    @Override
    public void id_class(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        int n;
        if (xc_32.id_byte(id_continue) == 0 && random.nextInt(3) == 0 && rrEm_12.id_finally(rfH_22.id_final()) && rrEm_12.id_class(rfH_22.id_final(), 0) >= 9 && (n = this.id_break(rrEm_12, rfH_22) + 1) < 16) {
            this.id_class(xc_32, (rYB)rrEm_12, rfH_22, random, n);
        }
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        return rRR2.id_byte(rfH_22.id_break()).id_class(rls_3.M);
    }

    protected int id_class(rRq_1 rRq_12, rfH_2 rfH_22) {
        int n;
        for (n = 0; n < 16 && rRq_12.id_byte(rfH_22.id_break(n + 1)).id_class(xu_3.hs); ++n) {
        }
        return n;
    }

    protected void id_class(xc_3 xc_32, rYB rYB2, rfH_2 rfH_22, Random random, int n) {
        xc_3 xc_33 = rYB2.id_byte(rfH_22.id_break());
        rfH_2 rfH_23 = rfH_22.id_catch(2);
        xc_3 xc_34 = rYB2.id_byte(rfH_23);
        rCy_1 rCy_12 = rCy_1.NONE;
        if (n >= 1) {
            if (xc_33.id_class(xu_3.hs) && xc_33.id_byte(id_new) != rCy_1.NONE) {
                if (xc_33.id_class(xu_3.hs) && xc_33.id_byte(id_new) != rCy_1.NONE) {
                    rCy_12 = rCy_1.LARGE;
                    if (xc_34.id_class(xu_3.hs)) {
                        rYB2.id_class(rfH_22.id_break(), (xc_3)xc_33.id_class(id_new, rCy_1.SMALL), 3);
                        rYB2.id_class(rfH_23, (xc_3)xc_34.id_class(id_new, rCy_1.NONE), 3);
                    }
                }
            } else {
                rCy_12 = rCy_1.SMALL;
            }
        }
        int n2 = xc_32.id_byte(id_int) != 1 && !xc_34.id_class(xu_3.hs) ? 0 : 1;
        int n3 = !(n >= 11 && random.nextFloat() < 0.25f || n == 15) ? 0 : 1;
        rYB2.id_class(rfH_22.id_final(), (xc_3)((xc_3)((xc_3)this.id_continue().id_class(id_int, n2)).id_class(id_new, rCy_12)).id_class(id_continue, n3), 3);
    }

    @Override
    public float id_class(xc_3 xc_32, rhd_3 rhd_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return rhd_32.ss().id_break() instanceof rkx_3 ? 1.0f : super.id_class(xc_32, rhd_32, rRq_12, rfH_22);
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        int n = this.id_class((rRq_1)rrEm_12, rfH_22);
        int n2 = this.id_break(rrEm_12, rfH_22);
        int n3 = n + n2 + 1;
        int n4 = 1 + random.nextInt(2);
        for (int i = 0; i < n4; ++i) {
            rfH_2 rfH_23 = rfH_22.id_break(n);
            xc_3 xc_33 = rrEm_12.id_byte(rfH_23);
            if (n3 >= 16 || xc_33.id_byte(id_continue) == 1 || !rrEm_12.id_finally(rfH_23.id_final())) {
                return;
            }
            this.id_class(xc_33, (rYB)rrEm_12, rfH_23, random, n3);
            ++n;
            ++n3;
        }
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        if (!rXE2.id_byte()) {
            return null;
        }
        xc_3 xc_32 = rxx_32.id_int().id_byte(rxx_32.id_class().id_break());
        if (xc_32.id_class(rls_3.M)) {
            if (xc_32.id_class(xu_3.hS)) {
                return (xc_3)this.id_continue().id_class(id_int, 0);
            }
            if (xc_32.id_class(xu_3.hs)) {
                int n = xc_32.id_byte(id_int) > 0 ? 1 : 0;
                return (xc_3)this.id_continue().id_class(id_int, n);
            }
            xc_3 xc_33 = rxx_32.id_int().id_byte(rxx_32.id_class().id_final());
            return !xc_33.id_class(xu_3.hs) && !xc_33.id_class(xu_3.hS) ? xu_3.hS.id_continue() : (xc_3)this.id_continue().id_class(id_int, xc_33.id_byte(id_int));
        }
        return null;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rjC_2 rjC_22 = xc_32.id_byte(id_new) == rCy_1.LARGE ? id_final : id_volatile;
        rjU_2 rjU_22 = xc_32.id_class(rfH_22);
        return rjC_22.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (!xc_32.id_class(rRg_12, rfH_22)) {
            rRg_12.id_finally().id_class(rfH_22, this, 1);
        }
        if (rpr_32 == rpr_3.UP && xc_33.id_class(xu_3.hs) && xc_33.id_byte(id_int) > xc_32.id_byte(id_int)) {
            rRg_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_int), 2);
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_int, id_new, id_continue);
    }

    protected int id_break(rRq_1 rRq_12, rfH_2 rfH_22) {
        int n;
        for (n = 0; n < 16 && rRq_12.id_byte(rfH_22.id_catch(n + 1)).id_class(xu_3.hs); ++n) {
        }
        return n;
    }

    @Override
    public rjC_2 id_break(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        rjU_2 rjU_22 = xc_32.id_class(rfH_22);
        return id_package.id_class(rjU_22.id_break, rjU_22.id_byte, rjU_22.id_protected);
    }

    @Override
    public void id_break(xc_3 xc_32, rrEm_1 rrEm_12, rfH_2 rfH_22, Random random) {
        if (!xc_32.id_class((rRR)rrEm_12, rfH_22)) {
            rrEm_12.id_break(rfH_22, true);
        }
    }

    @Override
    public boolean a_(xc_3 xc_32) {
        return xc_32.id_byte(id_continue) == 0;
    }

    @Override
    public boolean a_(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return true;
    }
}

