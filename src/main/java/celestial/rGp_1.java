/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.rEr_1;
import celestial.rGT;
import celestial.rLQ;
import celestial.rLy_1;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfU_2;
import celestial.rmE_2;
import celestial.rqA_2;
import celestial.rsi_3;
import celestial.rut_3;
import celestial.ruw_3;

public abstract class rGp_1
extends rsi_3 {
    private static final rut_3<Byte> id_super = rmE_2.id_class(rGp_1.class, ruw_3.id_class);
    protected int id_protected;
    private rGT id_this = rGT.NONE;

    @Override
    protected void id_double() {
        super.id_double();
        if (this.id_protected > 0) {
            --this.id_protected;
        }
    }

    protected rGp_1(aI_2<? extends rGp_1> aI_22, rYB rYB2) {
        super((aI_2<? extends rsi_3>)aI_22, rYB2);
    }

    @Override
    public void id_this() {
        super.id_this();
        if (((rYB)this.id_throws[7]).id_continue && this.sn()) {
            rGT rGT2 = this.sC();
            double d = rGT2.particleSpeed[0];
            double d2 = rGT2.particleSpeed[1];
            double d3 = rGT2.particleSpeed[2];
            float f = ((Float)this.id_private[23]).floatValue() * ((float)Math.PI / 180) + rfU_2.id_break((float)((Integer)this.id_throws[41]).intValue() * 0.6662f) * 0.25f;
            float f2 = rfU_2.id_break(f);
            float f3 = rfU_2.id_class(f);
            ((rYB)this.id_throws[7]).id_class(rLQ.id_else, this.rx() + (double)f2 * 0.6, this.re() + 1.8, this.BO() + (double)f3 * 0.6, d, d2, d3);
            ((rYB)this.id_throws[7]).id_class(rLQ.id_else, this.rx() - (double)f2 * 0.6, this.re() + 1.8, this.BO() - (double)f3 * 0.6, d, d2, d3);
        }
    }

    protected int sl() {
        return this.id_protected;
    }

    public void id_class(rGT rGT2) {
        this.id_this = rGT2;
        ((rmE_2)this.id_throws[49]).id_break(id_super, (byte)rGT2.id);
    }

    public static /* synthetic */ rLy_1 id_class(rGp_1 rGp_12) {
        return rGp_12.id_final;
    }

    @Override
    public void id_class(rcd_3 rcd_32) {
        super.id_class(rcd_32);
        rcd_32.id_break("SpellTicks", this.id_protected);
    }

    protected abstract rqA_2 sc();

    @Override
    public void id_break(rcd_3 rcd_32) {
        super.id_break(rcd_32);
        this.id_protected = rcd_32.id_private("SpellTicks");
    }

    @Override
    public rEr_1 id_throws() {
        if (this.sn()) {
            return rEr_1.SPELLCASTING;
        }
        return this.sW() ? rEr_1.CELEBRATING : rEr_1.CROSSED;
    }

    public boolean sn() {
        if (((rYB)this.id_throws[7]).id_continue) {
            return ((rmE_2)this.id_throws[49]).id_class(id_super) > 0;
        }
        return this.id_protected > 0;
    }

    protected rGT sC() {
        return !((rYB)this.id_throws[7]).id_continue ? this.id_this : rGT.id_class(((rmE_2)this.id_throws[49]).id_class(id_super).byteValue());
    }

    @Override
    protected void m_() {
        super.m_();
        ((rmE_2)this.id_throws[49]).id_class(id_super, (byte)0);
    }
}

