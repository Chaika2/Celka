/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.rLQ;
import celestial.rRW;
import celestial.rRq_1;
import celestial.rRu_1;
import celestial.rRz_1;
import celestial.rXE;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rhd_3;
import celestial.rhm_3;
import celestial.rls_3;
import celestial.rpL_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rsJ_2;
import celestial.rsd_3;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public class rsv_3
extends rsJ_2 {
    private int id_class = -1;

    @Override
    public xc_3 id_int() {
        return xu_3.rf.id_continue();
    }

    public rsv_3(aI_2<? extends rsv_3> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    public rsv_3(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.E, rYB2, d, d2, d3);
    }

    @Override
    public void id_this() {
        double d;
        super.id_this();
        if (this.id_class > 0) {
            --this.id_class;
            ((rYB)this.id_throws[7]).id_class(rLQ.id_double, this.rx(), this.re() + 0.5, this.BO(), 0.0, 0.0, 0.0);
        } else if (this.id_class == 0) {
            this.id_private(rsv_3.id_case(this.rv()));
        }
        if (((Boolean)this.id_throws[23]).booleanValue() && (d = rsv_3.id_case(this.rv())) >= (double)0.01f) {
            this.id_private(d);
        }
    }

    @Override
    public void id_class(int n, int n2, int n3, boolean bl) {
        if (bl && this.id_class < 0) {
            this.id_else();
        }
    }

    @Override
    public void id_class(byte by) {
        if (by == 10) {
            this.id_else();
        } else {
            super.id_class(by);
        }
    }

    @Override
    public float id_class(rRW rRW2, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, rXE rXE2, float f) {
        return !this.id_public() || !xc_32.id_class(rls_3.id_float) && !rRq_12.id_byte(rfH_22.id_final()).id_class(rls_3.id_float) ? super.id_class(rRW2, rRq_12, rfH_22, xc_32, rXE2, f) : 0.0f;
    }

    @Override
    public boolean id_class(rRW rRW2, rRq_1 rRq_12, rfH_2 rfH_22, xc_3 xc_32, float f) {
        return !this.id_public() || !xc_32.id_class(rls_3.id_float) && !rRq_12.id_byte(rfH_22.id_final()).id_class(rls_3.id_float) ? super.id_class(rRW2, rRq_12, rfH_22, xc_32, f) : false;
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("TNTFuse", this.id_class);
    }

    @Override
    public boolean id_class(float f, float f2) {
        if (f >= 3.0f) {
            float f3 = f / 10.0f;
            this.id_private((double)(f3 * f3));
        }
        return super.id_class(f, f2);
    }

    @Override
    public boolean id_break(rye_3 rye_32, float f) {
        rhm_3 rhm_32;
        an_3 an_32 = rye_32.id_finally();
        if (an_32 instanceof rhm_3 && (rhm_32 = (rhm_3)an_32).Pz()) {
            this.id_private(rhm_32.rv().id_catch());
        }
        return super.id_break(rye_32, f);
    }

    @Override
    public void id_break(rye_3 rye_32) {
        double d = rsv_3.id_case(this.rv());
        if (!(rye_32.id_int() || rye_32.id_protected() || d >= (double)0.01f)) {
            super.id_break(rye_32);
            if (!rye_32.id_protected() && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
                this.id_class((rpL_2)xu_3.rf);
            }
        } else if (this.id_class < 0) {
            this.id_else();
            this.id_class = ((Random)this.id_throws[40]).nextInt(20) + ((Random)this.id_throws[40]).nextInt(20);
        }
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_byte("TNTFuse", 99)) {
            this.id_class = rcd_32.id_private("TNTFuse");
        }
    }

    public void id_else() {
        this.id_class = 80;
        if (!((rYB)this.id_throws[7]).id_continue) {
            ((rYB)this.id_throws[7]).id_class((an_3)this, (byte)10);
            if (!this.BF()) {
                ((rYB)this.id_throws[7]).id_class((rhd_3)null, this.rx(), this.re(), this.BO(), rqn_3.db, rqL_2.BLOCKS, 1.0f, 1.0f);
            }
        }
    }

    public int id_return() {
        return this.id_class;
    }

    public boolean id_public() {
        return this.id_class > -1;
    }

    protected void id_private(double d) {
        if (!((rYB)this.id_throws[7]).id_continue) {
            double d2 = Math.sqrt(d);
            if (d2 > 5.0) {
                d2 = 5.0;
            }
            ((rYB)this.id_throws[7]).id_class(this, this.rx(), this.re(), this.BO(), (float)(4.0 + ((Random)this.id_throws[40]).nextDouble() * 1.5 * d2), rRz_1.BREAK);
            this.PD();
        }
    }

    @Override
    public rsd_3 id_final() {
        return rsd_3.TNT;
    }
}

