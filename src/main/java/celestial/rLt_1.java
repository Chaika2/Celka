/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rLT;
import celestial.rLn_1;
import celestial.rLp_1;
import celestial.rLq_1;
import celestial.rLv_1;
import celestial.rRq_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rlG_2;
import celestial.rpr_3;
import celestial.xc_3;

public class rLt_1
extends rLn_1 {
    private final boolean id_finally;

    private rLp_1 id_byte(int n, int n2, int n3) {
        rfw_3 rfw_32 = new rfw_3();
        for (int i = n; i < n + this.id_protected; ++i) {
            for (int j = n2; j < n2 + this.id_throws; ++j) {
                for (int k = n3; k < n3 + this.id_case; ++k) {
                    rXE rXE2 = this.id_class.id_break(rfw_32.id_class(i, j, k));
                    xc_3 xc_32 = this.id_class.id_byte(rfw_32.id_class(i, j, k));
                    if (rXE2.id_byte() && xc_32.id_class((rRq_1)this.id_class, rfw_32.id_break(), rLT.WATER) && xc_32.id_catch()) {
                        return rLp_1.BREACH;
                    }
                    if (rXE2.id_class(rlG_2.id_break)) continue;
                    return rLp_1.BLOCKED;
                }
            }
        }
        xc_3 xc_33 = this.id_class.id_byte(rfw_32);
        return xc_33.id_class((rRq_1)this.id_class, (rfH_2)rfw_32, rLT.WATER) ? rLp_1.WATER : rLp_1.BLOCKED;
    }

    public rLt_1(boolean bl) {
        this.id_finally = bl;
    }

    @Override
    public rLp_1 id_class(rRq_1 rRq_12, int n, int n2, int n3, is_3 is_32, int n4, int n5, int n6, boolean bl, boolean bl2) {
        return this.id_class(rRq_12, n, n2, n3);
    }

    @Override
    protected rLq_1 id_class(int n, int n2, int n3) {
        rLq_1 rLq_12 = null;
        rLp_1 rLp_12 = this.id_class((rYB)this.id_break.id_throws[7], n, n2, n3);
        float f = this.id_break.id_class(rLp_12);
        if (f >= 0.0f) {
            rLq_12 = super.id_class(n, n2, n3);
            rLq_12.id_native = rLp_12;
            rLq_12.id_extends = Math.max(rLq_12.id_extends, f);
            if (this.id_class.id_break(new rfH_2(n, n2, n3)).id_byte()) {
                rLq_12.id_extends += 8.0f;
            }
        }
        return rLp_12 == rLp_1.OPEN ? rLq_12 : rLq_12;
    }

    @Override
    public rLp_1 id_class(rRq_1 rRq_12, int n, int n2, int n3) {
        rfH_2 rfH_22 = new rfH_2(n, n2, n3);
        rXE rXE2 = rRq_12.id_break(rfH_22);
        xc_3 xc_32 = rRq_12.id_byte(rfH_22);
        if (rXE2.id_byte() && xc_32.id_class(rRq_12, rfH_22.id_break(), rLT.WATER) && xc_32.id_catch()) {
            return rLp_1.BREACH;
        }
        return rXE2.id_class(rlG_2.id_break) && xc_32.id_class(rRq_12, rfH_22, rLT.WATER) ? rLp_1.WATER : rLp_1.BLOCKED;
    }

    @Override
    public rLv_1 id_class(double d, double d2, double d3) {
        return new rLv_1(super.id_class(rfU_2.id_byte(d - (double)(this.id_break.PN() / 2.0f)), rfU_2.id_byte(d2 + 0.5), rfU_2.id_byte(d3 - (double)(this.id_break.PN() / 2.0f))));
    }

    @Override
    public int id_class(rLq_1[] rLq_1Array, rLq_1 rLq_12) {
        int n = 0;
        for (rpr_3 rpr_32 : rpr_3.values()) {
            rLq_1 rLq_13 = this.id_break(rLq_12.id_class + rpr_32.id_implements(), rLq_12.id_break + rpr_32.id_finally(), rLq_12.id_byte + rpr_32.id_extends());
            if (rLq_13 == null || rLq_13.id_implements) continue;
            rLq_1Array[n++] = rLq_13;
        }
        return n;
    }

    private rLq_1 id_break(int n, int n2, int n3) {
        rLp_1 rLp_12 = this.id_byte(n, n2, n3);
        return (!this.id_finally || rLp_12 != rLp_1.BREACH) && rLp_12 != rLp_1.WATER ? null : this.id_class(n, n2, n3);
    }

    @Override
    public rLq_1 id_break() {
        return super.id_class(rfU_2.id_byte(this.id_break.rN().id_class), rfU_2.id_byte(this.id_break.rN().id_break + 0.5), rfU_2.id_byte(this.id_break.rN().id_byte));
    }
}

