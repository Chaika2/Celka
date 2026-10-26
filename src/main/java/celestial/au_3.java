/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aU_2;
import celestial.am_3;
import celestial.iO_2;
import celestial.rLQ;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rmE_2;
import celestial.rrEm_1;
import celestial.rut_3;
import celestial.ruw_3;
import java.util.Random;

public abstract class au_3
extends aA_2 {
    private static final rut_3<Boolean> id_super = rmE_2.id_class(au_3.class, ruw_3.id_implements);
    protected int id_class;
    protected int id_break;
    protected int id_protected;

    protected au_3(aI_2<? extends au_3> aI_22, rYB rYB2) {
        super((aI_2<? extends aA_2>)aI_22, rYB2);
    }

    public void id_class(int n, boolean bl) {
        int n2 = this.O_();
        if ((n2 += n * 20) > 0) {
            n2 = 0;
        }
        int n3 = n2 - n2;
        this.e_(n2);
        if (bl) {
            this.id_break += n3;
            if (this.id_protected == 0) {
                this.id_protected = 40;
            }
        }
        if (this.O_() == 0) {
            this.e_(this.id_break);
        }
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        am_3 am_32;
        if (aU_22 == null) {
            aU_22 = new am_3(true);
        }
        if ((am_32 = (am_3)aU_22).id_byte() && am_32.id_class() > 0 && ((Random)this.id_throws[40]).nextFloat() <= am_32.id_protected()) {
            this.e_(-24000);
        }
        am_32.id_break();
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("Age", this.O_());
        rcd_32.id_break("ForcedAge", this.id_break);
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_super.equals(rut_32)) {
            this.q_();
        }
        super.id_class(rut_32);
    }

    @Override
    public void id_class(boolean bl) {
        this.e_(bl ? -24000 : 0);
    }

    public abstract au_3 id_class(rrEm_1 var1, au_3 var2);

    @Override
    public void id_default() {
        super.id_default();
        if (((rYB)this.id_throws[7]).id_continue) {
            if (this.id_protected > 0) {
                if (this.id_protected % 4 == 0) {
                    ((rYB)this.id_throws[7]).id_class(rLQ.id_char, this.id_break(1.0), this.Ph() + 0.5, this.id_protected(1.0), 0.0, 0.0, 0.0);
                }
                --this.id_protected;
            }
        } else if (this.BM()) {
            int n = this.O_();
            if (n < 0) {
                this.e_(++n);
            } else if (n > 0) {
                this.e_(--n);
            }
        }
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.e_(rcd_32.id_private("Age"));
        this.id_break = rcd_32.id_private("ForcedAge");
    }

    public int O_() {
        if (((rYB)this.id_throws[7]).id_continue) {
            return ((rmE_2)this.id_throws[49]).id_class(id_super) != false ? -1 : 1;
        }
        return this.id_class;
    }

    protected void P_() {
    }

    public boolean N_() {
        return false;
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_super, false);
    }

    @Override
    public boolean n_() {
        return this.O_() < 0;
    }

    public void e_(int n) {
        int n2 = this.id_class;
        this.id_class = n;
        if (n2 < 0 && n >= 0 || n2 >= 0 && n < 0) {
            ((rmE_2)this.id_throws[49]).id_break(id_super, n < 0);
            this.P_();
        }
    }

    public void d_(int n) {
        this.id_class(n, false);
    }
}

