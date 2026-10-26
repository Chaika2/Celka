/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.is_3;
import celestial.rGB;
import celestial.rPY;
import celestial.rfU_2;
import celestial.rjU_2;

public class rGM
extends rPY {
    private float id_finally;
    public final /* synthetic */ rGB id_implements;

    public rGM(rGB rGB2, is_3 is_32) {
        this.id_implements = rGB2;
        super(is_32);
        this.id_finally = 0.1f;
    }

    @Override
    public void id_class() {
        if (((Boolean)this.id_implements.id_throws[23]).booleanValue()) {
            rGB rGB2 = this.id_implements;
            Float f = Float.valueOf(((Float)rGB2.id_throws[15]).floatValue() + 180.0f);
            rGB2.id_throws[15] = f;
            this.id_finally = 0.1f;
        }
        float f = (float)(this.id_implements.id_break.id_break - this.id_implements.rx());
        float f2 = (float)(this.id_implements.id_break.id_byte - this.id_implements.re());
        float f3 = (float)(this.id_implements.id_break.id_protected - this.id_implements.BO());
        double d = rfU_2.id_byte(f * f + f3 * f3);
        double d2 = 1.0 - (double)rfU_2.id_throws(f2 * 0.7f) / d;
        f = (float)((double)f * d2);
        f3 = (float)((double)f3 * d2);
        d = rfU_2.id_byte(f * f + f3 * f3);
        double d3 = rfU_2.id_byte(f * f + f3 * f3 + f2 * f2);
        float f4 = ((Float)this.id_implements.id_throws[15]).floatValue();
        float f5 = (float)rfU_2.id_protected((double)f3, (double)f);
        float f6 = rfU_2.id_catch(((Float)this.id_implements.id_throws[15]).floatValue() + 90.0f);
        float f7 = rfU_2.id_catch(f5 * 57.295776f);
        Float f8 = Float.valueOf(rfU_2.id_protected(f6, f7, 4.0f) - 90.0f);
        this.id_implements.id_throws[15] = f8;
        Float f9 = Float.valueOf(((Float)this.id_implements.id_throws[15]).floatValue());
        this.id_implements.id_private[23] = f9;
        this.id_finally = rfU_2.id_protected(f4, ((Float)this.id_implements.id_throws[15]).floatValue()) < 3.0f ? rfU_2.id_byte(this.id_finally, 1.8f, 0.005f * (1.8f / this.id_finally)) : rfU_2.id_byte(this.id_finally, 0.2f, 0.025f);
        float f10 = (float)(-(rfU_2.id_protected((double)(-f2), d) * 57.2957763671875));
        Float f11 = Float.valueOf(f10);
        this.id_implements.id_throws[16] = f11;
        float f12 = ((Float)this.id_implements.id_throws[15]).floatValue() + 90.0f;
        double d4 = (double)(this.id_finally * rfU_2.id_break(f12 * ((float)Math.PI / 180))) * Math.abs((double)f / d3);
        double d5 = (double)(this.id_finally * rfU_2.id_class(f12 * ((float)Math.PI / 180))) * Math.abs((double)f3 / d3);
        double d6 = (double)(this.id_finally * rfU_2.id_class(f10 * ((float)Math.PI / 180))) * Math.abs((double)f2 / d3);
        rjU_2 rjU_22 = this.id_implements.rv();
        this.id_implements.id_byte(rjU_22.id_throws(new rjU_2(d4, d6, d5).id_protected(rjU_22).id_class(0.2)));
    }
}

