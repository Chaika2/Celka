/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aI_2;
import celestial.an_3;
import celestial.rYB;
import celestial.rcd_3;
import celestial.rfU_2;
import celestial.rff_3;
import celestial.rfo_3;
import celestial.rjG_2;
import celestial.rjM_2;
import celestial.rjU_2;
import celestial.rrEm_1;
import celestial.xc_3;
import java.util.Random;
import java.util.UUID;

public abstract class rhf_3
extends an_3 {
    private UUID id_class;
    private int id_break;
    private boolean id_protected;

    public void id_byte(double d, double d2, double d3, float f, float f2) {
        rjU_2 rjU_22 = new rjU_2(d, d2, d3).id_protected().id_break(((Random)this.id_throws[40]).nextGaussian() * (double)0.0075f * (double)f2, ((Random)this.id_throws[40]).nextGaussian() * (double)0.0075f * (double)f2, ((Random)this.id_throws[40]).nextGaussian() * (double)0.0075f * (double)f2).id_class((double)f);
        this.id_byte(rjU_22);
        float f3 = rfU_2.id_class(rhf_3.id_case(rjU_22));
        Float f4 = Float.valueOf((float)(rfU_2.id_protected(rjU_22.id_break, rjU_22.id_protected) * 57.2957763671875));
        this.id_throws[15] = f4;
        Float f5 = Float.valueOf((float)(rfU_2.id_protected(rjU_22.id_byte, (double)f3) * 57.2957763671875));
        this.id_throws[16] = f5;
        Float f6 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
        this.id_throws[17] = f6;
        Float f7 = Float.valueOf(((Float)this.id_throws[16]).floatValue());
        this.id_throws[18] = f7;
    }

    public rhf_3(aI_2<? extends rhf_3> aI_22, rYB rYB2) {
        super(aI_22, rYB2);
    }

    @Override
    public void id_this() {
        if (!this.id_protected) {
            this.id_protected = this.id_protected();
        }
        super.id_this();
    }

    protected void id_class(rff_3 rff_32) {
        xc_3 xc_32 = ((rYB)this.id_throws[7]).id_byte(rff_32.id_class());
        xc_32.id_class((rYB)this.id_throws[7], xc_32, rff_32, this);
    }

    public void id_class(an_3 an_32, float f, float f2, float f3, float f4, float f5) {
        float f6 = -rfU_2.id_class(f2 * ((float)Math.PI / 180)) * rfU_2.id_break(f * ((float)Math.PI / 180));
        float f7 = -rfU_2.id_class((f + f3) * ((float)Math.PI / 180));
        float f8 = rfU_2.id_break(f2 * ((float)Math.PI / 180)) * rfU_2.id_break(f * ((float)Math.PI / 180));
        this.id_byte(f6, f7, f8, f4, f5);
        rjU_2 rjU_22 = an_32.rv();
        this.id_byte(this.rv().id_break(rjU_22.id_break, an_32.BL() ? 0.0 : rjU_22.id_byte, rjU_22.id_protected));
    }

    protected void id_class(rjG_2 rjG_22) {
        rjM_2 rjM_22 = rjG_22.id_byte();
        if (rjM_22 == rjM_2.ENTITY) {
            this.id_class((rfo_3)rjG_22);
        } else if (rjM_22 == rjM_2.BLOCK) {
            this.id_class((rff_3)rjG_22);
        }
    }

    protected boolean id_class(an_3 an_32) {
        if (!an_32.id_native() && an_32.BM() && an_32.rY()) {
            an_3 an_33 = this.id_else();
            return an_33 == null || this.id_protected || !an_33.id_return(an_32);
        }
        return false;
    }

    protected void id_class(rfo_3 rfo_32) {
    }

    @Override
    protected void id_class(rcd_3 rcd_32) {
        if (this.id_class != null) {
            rcd_32.id_class("Owner", this.id_class);
        }
        if (this.id_protected) {
            rcd_32.id_class("LeftOwner", true);
        }
    }

    public void id_break(an_3 an_32) {
        if (an_32 != null) {
            this.id_class = an_32.ro();
            this.id_break = an_32.V();
        }
    }

    protected static float id_break(float f, float f2) {
        while (f2 - f < -180.0f) {
            f -= 360.0f;
        }
        while (f2 - f >= 180.0f) {
            f += 360.0f;
        }
        return rfU_2.id_catch(0.2f, f, f2);
    }

    @Override
    protected void id_break(rcd_3 rcd_32) {
        if (rcd_32.id_break("Owner")) {
            this.id_class = rcd_32.id_class("Owner");
        }
        this.id_protected = rcd_32.id_new("LeftOwner");
    }

    @Override
    public void id_extends(double d, double d2, double d3) {
        this.id_catch(d, d2, d3);
        if (((Float)this.id_throws[18]).floatValue() == 0.0f && ((Float)this.id_throws[17]).floatValue() == 0.0f) {
            float f = rfU_2.id_class(d * d + d3 * d3);
            Float f2 = Float.valueOf((float)(rfU_2.id_protected(d2, (double)f) * 57.2957763671875));
            this.id_throws[16] = f2;
            Float f3 = Float.valueOf((float)(rfU_2.id_protected(d, d3) * 57.2957763671875));
            this.id_throws[15] = f3;
            Float f4 = Float.valueOf(((Float)this.id_throws[16]).floatValue());
            this.id_throws[18] = f4;
            Float f5 = Float.valueOf(((Float)this.id_throws[15]).floatValue());
            this.id_throws[17] = f5;
            this.id_class(this.rx(), this.re(), this.BO(), ((Float)this.id_throws[15]).floatValue(), ((Float)this.id_throws[16]).floatValue());
        }
    }

    public an_3 id_else() {
        if (this.id_class != null && (rYB)this.id_throws[7] instanceof rrEm_1) {
            return ((rrEm_1)((rYB)this.id_throws[7])).id_break(this.id_class);
        }
        return this.id_break != 0 ? ((rYB)this.id_throws[7]).id_break(this.id_break) : null;
    }

    protected void id_return() {
        rjU_2 rjU_22 = this.rv();
        float f = rfU_2.id_class(rhf_3.id_case(rjU_22));
        Float f2 = Float.valueOf(rhf_3.id_break(((Float)this.id_throws[18]).floatValue(), (float)(rfU_2.id_protected(rjU_22.id_byte, (double)f) * 57.2957763671875)));
        this.id_throws[16] = f2;
        Float f3 = Float.valueOf(rhf_3.id_break(((Float)this.id_throws[17]).floatValue(), (float)(rfU_2.id_protected(rjU_22.id_break, rjU_22.id_protected) * 57.2957763671875)));
        this.id_throws[15] = f3;
    }

    private boolean id_protected() {
        an_3 an_33 = this.id_else();
        if (an_33 != null) {
            for (an_3 an_34 : ((rYB)this.id_throws[7]).id_break((an_3)this, this.rN().id_break(this.rv()).id_class(1.0), an_32 -> !an_32.id_native() && an_32.rY())) {
                if (an_34.PO() != an_33.PO()) continue;
                return false;
            }
        }
        return true;
    }
}

