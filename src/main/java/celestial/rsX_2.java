/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.ap_3;
import celestial.iB_2;
import celestial.iG_2;
import celestial.iM_2;
import celestial.rFJ;
import celestial.rLQ;
import celestial.rRz_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfU_2;
import celestial.rmE_2;
import celestial.ruS_2;
import celestial.rut_3;
import celestial.ruw_3;

public class rsX_2
extends an_3 {
    private static final rut_3<Integer> id_class = rmE_2.id_class(rsX_2.class, ruw_3.id_break);
    private iB_2 id_break;
    private int id_protected = 80;

    public rsX_2(aI_2<? extends rsX_2> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
        Boolean bl = true;
        this.id_throws[2] = bl;
    }

    public rsX_2(rYB rYB2, double d, double d2, double d3, iB_2 iB_22) {
        this((aI_2<? extends rsX_2>)aI_2.Q, rYB2);
        this.id_new(d, d2, d3);
        double d4 = rYB2.id_int.nextDouble() * 6.2831854820251465;
        this.id_catch(-Math.sin(d4) * 0.02, 0.2f, -Math.cos(d4) * 0.02);
        this.id_class(80);
        Double d5 = d;
        this.id_throws[8] = d5;
        Double d6 = d2;
        this.id_throws[9] = d6;
        Double d7 = d3;
        this.id_throws[10] = d7;
        this.id_break = iB_22;
    }

    @Override
    public void id_this() {
        if (!this.rw()) {
            this.id_byte(this.rv().id_break(0.0, -0.04, 0.0));
        }
        this.id_class(iG_2.SELF, this.rv());
        this.id_byte(this.rv().id_class(0.98));
        if (((Boolean)this.id_throws[20]).booleanValue()) {
            this.id_byte(this.rv().id_throws(0.7, -0.5, 0.7));
        }
        --this.id_protected;
        if (this.id_protected <= 0) {
            this.PD();
            if (!((rYB)this.id_throws[7]).id_continue) {
                this.id_private();
            }
        } else {
            this.PM();
            if (((rYB)this.id_throws[7]).id_continue) {
                ((rYB)this.id_throws[7]).id_class(rLQ.id_double, this.rx(), this.re() + 0.5, this.BO(), 0.0, 0.0, 0.0);
            }
        }
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        rcd_32.id_class("Fuse", (short)this.id_case());
    }

    public void id_class(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, n);
        this.id_protected = n;
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_class.equals(rut_32)) {
            this.id_protected = this.id_throws();
        }
    }

    @Override
    protected float id_class(iM_2 iM_22, ap_3 ap_32) {
        return 0.15f;
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        this.id_class(rcd_32.id_catch("Fuse"));
    }

    public int id_throws() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    public float id_catch() {
        float f = this.id_throws();
        float f2 = f - (float)this.id_case();
        return rfU_2.id_class(f2 / f, 0.0f, 1.0f);
    }

    public int id_case() {
        return this.id_protected;
    }

    public iB_2 id_protected() {
        return this.id_break;
    }

    private void id_private() {
        ((rYB)this.id_throws[7]).id_class(this, this.rx(), this.id_byte(0.0625), this.BO(), 4.0f, rRz_1.BREAK);
    }

    @Override
    public boolean rY() {
        return (Boolean)this.id_throws[27] == false;
    }

    @Override
    protected boolean PK() {
        return false;
    }

    @Override
    protected void m_() {
        ((rmE_2)this.id_throws[49]).id_class(id_class, 80);
    }

    @Override
    public ruS_2<?> p_() {
        return new rFJ(this);
    }
}

