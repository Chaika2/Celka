/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aA_2;
import celestial.aI_2;
import celestial.aL_2;
import celestial.rLp_1;
import celestial.rRR;
import celestial.rYB;
import celestial.rhd_3;
import celestial.rye_3;

public abstract class rOl_1
extends aA_2 {
    @Override
    public int id_char() {
        return 120;
    }

    @Override
    protected int id_byte(rhd_3 rhd_32) {
        return 1 + ((rYB)this.id_throws[7]).id_int.nextInt(3);
    }

    protected rOl_1(aI_2<? extends rOl_1> aI_22, rYB rYB2) {
        super((aI_2<? extends aA_2>)aI_22, rYB2);
        this.id_class(rLp_1.WATER, 0.0f);
    }

    protected void id_class(int n) {
        if (this.BM() && !this.Pa()) {
            this.id_throws(n - 1);
            if (this.PA() == -20) {
                this.id_throws(0);
                this.id_break(rye_3.id_private, 2.0f);
            }
        } else {
            this.id_throws(300);
        }
    }

    @Override
    public boolean id_class(rRR rRR2) {
        return rRR2.id_protected(this);
    }

    @Override
    public boolean u() {
        return false;
    }

    @Override
    public boolean id_protected(rhd_3 rhd_32) {
        return false;
    }

    @Override
    public void Pn() {
        int n = this.PA();
        super.Pn();
        this.id_class(n);
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_throws;
    }

    @Override
    public boolean SO() {
        return true;
    }
}

