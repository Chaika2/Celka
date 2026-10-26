/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.C_do;
import celestial.aI_2;
import celestial.rLQ;
import celestial.rRu_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rjU_2;
import celestial.rkg_3;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rpm_3;
import celestial.rpr_3;
import celestial.rsJ_2;
import celestial.rsd_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.rye_3;
import celestial.xc_3;
import celestial.xu_3;
import java.util.Random;

public class rsN_2
extends rsJ_2 {
    private static final rut_3<Boolean> id_protected = rmE_2.id_class(rsN_2.class, ruw_3.id_implements);
    private int id_catch;
    public double id_class;
    public double id_break;
    private static final rkg_3 id_private = rkg_3.id_class(rdy_3.Oh, rdy_3.OX);

    @Override
    protected void id_byte(rfH_2 rfH_22, xc_3 xc_32) {
        double d = 1.0E-4;
        double d2 = 0.001;
        super.id_byte(rfH_22, xc_32);
        rjU_2 rjU_22 = this.rv();
        double d3 = rsN_2.id_case(rjU_22);
        double d4 = this.id_class * this.id_class + this.id_break * this.id_break;
        if (d4 > 1.0E-4 && d3 > 0.001) {
            double d5 = rfU_2.id_class(d3);
            double d6 = rfU_2.id_class(d4);
            this.id_class = rjU_22.id_break / d5 * d6;
            this.id_break = rjU_22.id_protected / d5 * d6;
        }
    }

    protected void id_byte(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_protected, bl);
    }

    @Override
    public xc_3 id_int() {
        return (xc_3)((xc_3)xu_3.Ps.id_continue().id_class(C_do.id_volatile, rpr_3.NORTH)).id_class(C_do.id_final, this.id_else());
    }

    public rsN_2(aI_2<? extends rsN_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    public rsN_2(rYB rYB2, double d, double d2, double d3) {
        super(aI_2.B, rYB2, d, d2, d3);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (!((rYB)this.id_throws[7]).id_import()) {
            if (this.id_catch > 0) {
                --this.id_catch;
            }
            if (this.id_catch <= 0) {
                this.id_class = 0.0;
                this.id_break = 0.0;
            }
            this.id_byte(this.id_catch > 0);
        }
        if (this.id_else() && ((Random)this.id_throws[40]).nextInt(4) == 0) {
            ((rYB)this.id_throws[7]).id_class(rLQ.id_short, this.rx(), this.re() + 0.8, this.BO(), 0.0, 0.0, 0.0);
        }
    }

    @Override
    public ryZ_2 id_class(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (id_private.id_class(rdn_32) && this.id_catch + 3600 <= 32000) {
            if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                rdn_32.id_catch(1);
            }
            this.id_catch += 3600;
        }
        if (this.id_catch > 0) {
            this.id_class = this.rx() - rhd_32.rx();
            this.id_break = this.BO() - rhd_32.BO();
        }
        return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("PushX", this.id_class);
        rcd_32.id_class("PushZ", this.id_break);
        rcd_32.id_class("Fuel", (short)this.id_catch);
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_class = rcd_32.id_extends("PushX");
        this.id_break = rcd_32.id_extends("PushZ");
        this.id_catch = rcd_32.id_catch("Fuel");
    }

    @Override
    public void id_break(rye_3 rye_32) {
        super.id_break(rye_32);
        if (!rye_32.id_protected() && ((rYB)this.id_throws[7]).B().id_break(rRu_1.id_catch)) {
            this.id_class((rpL_2)xu_3.Ps);
        }
    }

    @Override
    protected void id_case() {
        double d = this.id_class * this.id_class + this.id_break * this.id_break;
        if (d > 1.0E-7) {
            d = rfU_2.id_class(d);
            this.id_class /= d;
            this.id_break /= d;
            this.id_byte(this.rv().id_throws(0.8, 0.0, 0.8).id_break(this.id_class, 0.0, this.id_break));
        } else {
            this.id_byte(this.rv().id_throws(0.98, 0.0, 0.98));
        }
        super.id_case();
    }

    protected boolean id_else() {
        return ((rmE_2)this.id_throws[49]).id_class(id_protected);
    }

    @Override
    protected double id_protected() {
        return 0.2;
    }

    @Override
    public rsd_3 id_final() {
        return rsd_3.FURNACE;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_protected, false);
    }
}

