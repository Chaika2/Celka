/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.aL_2;
import celestial.aU_2;
import celestial.aV_2;
import celestial.ap_3;
import celestial.iM_2;
import celestial.iO_2;
import celestial.iQ_2;
import celestial.rEK;
import celestial.rGE;
import celestial.rGG;
import celestial.rGM;
import celestial.rGO;
import celestial.rGS;
import celestial.rGX;
import celestial.rGh_1;
import celestial.rGs_1;
import celestial.rLQ;
import celestial.rPf_1;
import celestial.rRf_1;
import celestial.rRh_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rjU_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rqL_2;
import celestial.rqn_3;
import celestial.rut_3;
import celestial.ruw_3;
import celestial.rye_3;
import java.util.Random;

public class rGB
extends aV_2
implements rEK {
    private static final rut_3<Integer> id_class = rmE_2.id_class(rGB.class, ruw_3.id_break);
    public rjU_2 id_break = rjU_2.id_class;
    public rfH_2 id_protected = rfH_2.id_protected;
    public rGS id_super = rGS.CIRCLE;

    @Override
    protected boolean id_boolean() {
        return true;
    }

    @Override
    protected rqA_2 id_byte(rye_3 rye_32) {
        return rqn_3.OR;
    }

    public static /* synthetic */ Random id_byte(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    @Override
    protected void id_double() {
        super.id_double();
    }

    public rGB(aI_2<? extends rGB> aI_22, rYB rYB2) {
        super((aI_2<? extends aV_2>)aI_22, rYB2);
        this.id_finally = 5;
        this.id_native = new rGM(this, this);
        this.id_extends = new rGG(this, this);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (((rYB)this.id_throws[7]).id_continue) {
            float f = rfU_2.id_break((float)(this.V() * 3 + (Integer)this.id_throws[41]) * 0.13f + (float)Math.PI);
            float f2 = rfU_2.id_break((float)(this.V() * 3 + (Integer)this.id_throws[41] + 1) * 0.13f + (float)Math.PI);
            if (f > 0.0f && f2 <= 0.0f) {
                ((rYB)this.id_throws[7]).id_class(this.rx(), this.re(), this.BO(), rqn_3.Og, this.Pr(), 0.95f + ((Random)this.id_throws[40]).nextFloat() * 0.05f, 0.95f + ((Random)this.id_throws[40]).nextFloat() * 0.05f, false);
            }
            int n = this.id_throws();
            float f3 = rfU_2.id_break(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180)) * (1.3f + 0.21f * (float)n);
            float f4 = rfU_2.id_class(((Float)this.id_throws[15]).floatValue() * ((float)Math.PI / 180)) * (1.3f + 0.21f * (float)n);
            float f5 = (0.3f + f * 0.45f) * ((float)n * 0.2f + 1.0f);
            ((rYB)this.id_throws[7]).id_class(rLQ.id_const, this.rx() + (double)f3, this.re() + (double)f5, this.BO() + (double)f4, 0.0, 0.0, 0.0);
            ((rYB)this.id_throws[7]).id_class(rLQ.id_const, this.rx() - (double)f3, this.re() + (double)f5, this.BO() - (double)f4, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public aU_2 id_class(rRf_1 rRf_12, rRh_1 rRh_12, iO_2 iO_22, aU_2 aU_22, rcd_3 rcd_32) {
        this.id_protected = this.Bs().id_break(5);
        this.id_class(0);
        return super.id_class(rRf_12, rRh_12, iO_22, aU_22, rcd_32);
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("AX", this.id_protected.b_());
        rcd_32.id_break("AY", this.id_protected.c_());
        rcd_32.id_break("AZ", this.id_protected.d_());
        rcd_32.id_break("Size", this.id_throws());
    }

    @Override
    public boolean id_class(double d) {
        return true;
    }

    public static /* synthetic */ Random id_class(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    @Override
    public boolean id_class(aI_2<?> aI_22) {
        return true;
    }

    public void id_class(int n) {
        ((rmE_2)this.id_throws[49]).id_break(id_class, rfU_2.id_class(n, 0, 64));
    }

    @Override
    public void id_class(rut_3<?> rut_32) {
        if (id_class.equals(rut_32)) {
            this.id_catch();
        }
        super.id_class(rut_32);
    }

    @Override
    public void id_default() {
        if (this.BM() && this.F()) {
            this.id_case(8);
        }
        super.id_default();
    }

    public static /* synthetic */ Random id_break(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    @Override
    protected float id_break(iM_2 iM_22, ap_3 ap_32) {
        return ap_32.id_break * 0.35f;
    }

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        if (rcd_32.id_throws("AX")) {
            this.id_protected = new rfH_2(rcd_32.id_private("AX"), rcd_32.id_private("AY"), rcd_32.id_private("AZ"));
        }
        this.id_class(rcd_32.id_private("Size"));
    }

    public static /* synthetic */ Random id_throws(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    public int id_throws() {
        return ((rmE_2)this.id_throws[49]).id_class(id_class);
    }

    public static /* synthetic */ Random id_finally(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    public static /* synthetic */ Random id_catch(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    private void id_catch() {
        this.q_();
        this.id_byte(iQ_2.id_case).id_class(6 + this.id_throws());
    }

    public static /* synthetic */ Random id_extends(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    public static /* synthetic */ Random id_case(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    public static /* synthetic */ Random id_implements(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    @Override
    protected rPf_1 id_new() {
        return new rGE(this, this);
    }

    @Override
    protected rqA_2 id_static() {
        return rqn_3.Of;
    }

    public static /* synthetic */ Random id_protected(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    public static /* synthetic */ Random id_private(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    @Override
    protected void id_final() {
        this.id_package.id_class(1, new rGh_1(this));
        this.id_package.id_class(2, new rGX(this));
        this.id_package.id_class(3, new rGO(this));
        this.id_int.id_class(1, new rGs_1(this));
    }

    public static /* synthetic */ Random id_native(rGB rGB2) {
        return (Random)rGB2.id_throws[40];
    }

    @Override
    public rqL_2 Pr() {
        return rqL_2.HOSTILE;
    }

    @Override
    protected rqA_2 Bt() {
        return rqn_3.OV;
    }

    @Override
    public aL_2 sG() {
        return aL_2.id_break;
    }

    @Override
    protected float Si() {
        return 1.0f;
    }

    @Override
    public ap_3 a_(iM_2 iM_22) {
        int n = this.id_throws();
        ap_3 ap_32 = super.a_(iM_22);
        float f = (ap_32.id_class + 0.2f * (float)n) / ap_32.id_class;
        return ap_32.id_class(f);
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_class, 0);
    }
}

