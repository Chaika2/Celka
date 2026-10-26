/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.iQ_2;
import celestial.iz_3;
import celestial.rOD;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rcy_3;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rhd_3;
import celestial.rhx_3;
import celestial.rmE_2;
import celestial.rpL_2;
import celestial.rpm_3;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.ryZ_2;
import celestial.xu_3;
import java.util.Random;

public abstract class rOK
extends rOD {
    private static final rut_3<Boolean> id_try = rmE_2.id_class(rOK.class, ruw_3.id_implements);

    protected rOK(aI_2<? extends rOK> aI_22, rYB rYB2) {
        super((aI_2<? extends rOD>)aI_22, rYB2);
        this.id_goto = false;
    }

    public void id_this(boolean bl) {
        ((rmE_2)this.id_throws[49]).id_break(id_try, bl);
    }

    public static iz_3 n() {
        return rOK.sq().id_class(iQ_2.id_protected, 0.175f).id_class(iQ_2.id_volatile, 0.5);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_class("ChestedHorse", this.sJ());
        if (this.sJ()) {
            rcy_3 rcy_32 = new rcy_3();
            for (int i = 2; i < this.id_synchronized.id_else(); ++i) {
                rdn_3 rdn_32 = this.id_synchronized.id_extends(i);
                if (rdn_32.id_class()) continue;
                rcd_3 rcd_33 = new rcd_3();
                rcd_33.id_class("Slot", (byte)i);
                rdn_32.id_break(rcd_33);
                rcy_32.add(rcd_33);
            }
            rcd_32.id_class("Items", rcy_32);
        }
    }

    @Override
    public boolean id_class(int n, rdn_3 rdn_32) {
        if (n == 499) {
            if (this.sJ() && rdn_32.id_class()) {
                this.id_this(false);
                this.sC();
                return true;
            }
            if (!this.sJ() && rdn_32.id_break() == xu_3.re.id_case()) {
                this.id_this(true);
                this.sC();
                return true;
            }
        }
        return super.id_class(n, rdn_32);
    }

    public int sc() {
        return 5;
    }

    protected void sd() {
        this.id_class(rqn_3.PD, 1.0f, (((Random)this.id_throws[40]).nextFloat() - ((Random)this.id_throws[40]).nextFloat()) * 0.2f + 1.0f);
    }

    @Override
    public ryZ_2 id_break(rhd_3 rhd_32, rpm_3 rpm_32) {
        rdn_3 rdn_32 = rhd_32.id_protected(rpm_32);
        if (!this.n_()) {
            if (this.sm() && rhd_32.sN()) {
                this.id_case(rhd_32);
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            if (this.BP()) {
                return super.id_break(rhd_32, rpm_32);
            }
        }
        if (!rdn_32.id_class()) {
            if (this.id_extends(rdn_32)) {
                return this.id_break(rhd_32, rdn_32);
            }
            if (!this.sm()) {
                this.sI();
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            if (!this.sJ() && rdn_32.id_break() == xu_3.re.id_case()) {
                this.id_this(true);
                this.sd();
                if (!((rhx_3)rhd_32.id_implements[18]).id_protected) {
                    rdn_32.id_catch(1);
                }
                this.sC();
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
            if (!this.n_() && !this.id_byte() && rdn_32.id_break() == rdy_3.hK) {
                this.id_case(rhd_32);
                return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
            }
        }
        if (this.n_()) {
            return super.id_break(rhd_32, rpm_32);
        }
        this.id_catch(rhd_32);
        return ryZ_2.id_class(((rYB)this.id_throws[7]).id_continue);
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_this(rcd_32.id_new("ChestedHorse"));
        if (this.sJ()) {
            rcy_3 rcy_32 = rcd_32.id_protected("Items", 10);
            this.sC();
            for (int i = 0; i < rcy_32.size(); ++i) {
                rcd_3 rcd_33 = rcy_32.id_class(i);
                int n = rcd_33.id_case("Slot") & 0xFF;
                if (n < 2 || n >= this.id_synchronized.id_else()) continue;
                this.id_synchronized.id_break(n, rdn_3.id_class(rcd_33));
            }
        }
        this.sl();
    }

    @Override
    protected void L() {
        this.id_byte(iQ_2.id_class).id_class(this.sV());
    }

    @Override
    protected int sx() {
        return this.sJ() ? 17 : super.sx();
    }

    @Override
    public double PS() {
        return super.PS() - 0.25;
    }

    public boolean sJ() {
        return ((rmE_2)this.id_throws[49]).id_class(id_try);
    }

    @Override
    protected void Sx() {
        super.Sx();
        if (this.sJ()) {
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_class((rpL_2)xu_3.re);
            }
            this.id_this(false);
        }
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_try, false);
    }
}

