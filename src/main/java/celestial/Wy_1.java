/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Jq_1;
import celestial.kX_2;
import celestial.kd_3;
import celestial.rCL;
import celestial.rCN;
import celestial.rCT;
import celestial.rCm_1;
import celestial.rLT;
import celestial.rRR;
import celestial.rRg_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rXG;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjC_2;
import celestial.rjm_3;
import celestial.rls_3;
import celestial.rpr_3;
import celestial.rrEm_1;
import celestial.rxx_3;
import celestial.xF_2;
import celestial.xc_3;
import celestial.xd_3;
import celestial.xu_3;
import java.util.Random;

public class Wy_1
extends xF_2
implements kX_2,
kd_3 {
    public static final rCm_1 id_volatile = rCT.l;
    public static final rCN id_final = rCT.id_throw;
    protected static final rjC_2 id_package = xd_3.id_class(6.0, 0.0, 6.0, 10.0, 6.0, 10.0);
    protected static final rjC_2 id_int = xd_3.id_class(3.0, 0.0, 3.0, 13.0, 6.0, 13.0);
    protected static final rjC_2 id_new = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 6.0, 14.0);
    protected static final rjC_2 id_continue = xd_3.id_class(2.0, 0.0, 2.0, 14.0, 7.0, 14.0);

    protected Wy_1(Jq_1 jq_1) {
        super(jq_1);
        this.id_extends((xc_3)((xc_3)((xc_3)this.id_abstract.id_break()).id_class(id_volatile, 1)).id_class(id_final, true));
    }

    @Override
    public xc_3 id_class(rxx_3 rxx_32) {
        xc_3 xc_32 = rxx_32.id_int().id_byte(rxx_32.id_class());
        if (xc_32.id_class(this)) {
            return (xc_3)xc_32.id_class(id_volatile, Math.min(4, xc_32.id_byte(id_volatile) + 1));
        }
        rXE rXE2 = rxx_32.id_int().id_break(rxx_32.id_class());
        boolean bl = rXE2.id_class() == rXG.id_byte;
        return (xc_3)super.id_class(rxx_32).id_class(id_final, bl);
    }

    @Override
    public void id_class(rrEm_1 rrEm_12, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        if (!Wy_1.id_private(xc_32) && rrEm_12.id_byte(rfH_22.id_break()).id_class(rls_3.s)) {
            int n = 5;
            int n2 = 1;
            int n3 = 2;
            int n4 = 0;
            int n5 = rfH_22.b_() - 2;
            int n6 = 0;
            for (int i = 0; i < 5; ++i) {
                for (int j = 0; j < n2; ++j) {
                    int n7 = 2 + rfH_22.c_() - 1;
                    for (int k = n7 - 2; k < n7; ++k) {
                        xc_3 xc_33;
                        rfH_2 rfH_23 = new rfH_2(n5 + i, k, rfH_22.d_() - n6 + j);
                        if (rfH_23 == rfH_22 || random.nextInt(6) != 0 || !rrEm_12.id_byte(rfH_23).id_class(xu_3.id_try) || !(xc_33 = rrEm_12.id_byte(rfH_23.id_break())).id_class(rls_3.s)) continue;
                        rrEm_12.id_class(rfH_23, (xc_3)xu_3.hr.id_continue().id_class(id_volatile, random.nextInt(4) + 1), 3);
                    }
                }
                if (n4 < 2) {
                    n2 += 2;
                    ++n6;
                } else {
                    n2 -= 2;
                    --n6;
                }
                ++n4;
            }
            rrEm_12.id_class(rfH_22, (xc_3)xc_32.id_class(id_volatile, 4), 2);
        }
    }

    @Override
    protected void id_class(rCL<xd_3, xc_3> rCL2) {
        rCL2.id_class(id_volatile, id_final);
    }

    @Override
    public boolean id_class(rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, boolean bl) {
        return true;
    }

    @Override
    public boolean id_class(rYB rYB2, Random random, rfH_2 rfH_22, xc_3 xc_32) {
        return true;
    }

    @Override
    public rjC_2 id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rjm_3 rjm_32) {
        switch (xc_32.id_byte(id_volatile)) {
            default: {
                return id_package;
            }
            case 2: {
                return id_int;
            }
            case 3: {
                return id_new;
            }
            case 4: 
        }
        return id_continue;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22, rLT rLT2) {
        return false;
    }

    @Override
    public boolean id_class(xc_3 xc_32, rRR rRR2, rfH_2 rfH_22) {
        rfH_2 rfH_23 = rfH_22.id_break();
        return this.id_catch(rRR2.id_byte(rfH_23), rRR2, rfH_23);
    }

    @Override
    public xc_3 id_class(xc_3 xc_32, rpr_3 rpr_32, xc_3 xc_33, rRg_1 rRg_12, rfH_2 rfH_22, rfH_2 rfH_23) {
        if (!xc_32.id_class(rRg_12, rfH_22)) {
            return xu_3.id_class.id_continue();
        }
        if (xc_32.id_byte(id_final).booleanValue()) {
            rRg_12.id_extends().id_class(rfH_22, rXG.id_byte, rXG.id_byte.id_class(rRg_12));
        }
        return super.id_class(xc_32, rpr_32, xc_33, rRg_12, rfH_22, rfH_23);
    }

    @Override
    public boolean id_class(xc_3 xc_32, rxx_3 rxx_32) {
        return rxx_32.id_volatile().id_break() == this.id_case() && xc_32.id_byte(id_volatile) < 4 ? true : super.id_class(xc_32, rxx_32);
    }

    @Override
    public rXE id_throws(xc_3 xc_32) {
        return xc_32.id_byte(id_final) != false ? rXG.id_byte.id_class(false) : super.id_throws(xc_32);
    }

    @Override
    protected boolean id_catch(xc_3 xc_32, rRq_1 rRq_12, rfH_2 rfH_22) {
        return !xc_32.id_extends(rRq_12, rfH_22).id_class(rpr_3.UP).id_break() || xc_32.id_protected(rRq_12, rfH_22, rpr_3.UP);
    }

    public static boolean id_private(xc_3 xc_32) {
        return xc_32.id_byte(id_final) == false;
    }
}

