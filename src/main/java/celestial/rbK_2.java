/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iQ_2;
import celestial.rPY;
import celestial.rPo_1;
import celestial.rbo_3;
import celestial.rfU_2;

public class rbK_2
extends rPY {
    private final rbo_3 id_implements;

    public rbK_2(rbo_3 rbo_32) {
        super(rbo_32);
        this.id_implements = rbo_32;
    }

    @Override
    public void id_class() {
        if (this.id_implements.rT()) {
            this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, 0.005, 0.0));
        }
        if (this.id_private == rPo_1.MOVE_TO && !this.id_implements.id_public().id_native()) {
            double d;
            double d2;
            double d3 = this.id_break - this.id_implements.rx();
            double d4 = d3 * d3 + (d2 = this.id_byte - this.id_implements.re()) * d2 + (d = this.id_protected - this.id_implements.BO()) * d;
            if (d4 < 2.500000277905201E-7) {
                this.id_class.id_catch(0.0f);
            } else {
                float f = (float)(rfU_2.id_protected(d, d3) * 57.2957763671875) - 90.0f;
                Float f2 = Float.valueOf(this.id_class(((Float)this.id_implements.id_throws[15]).floatValue(), f, 10.0f));
                this.id_implements.id_throws[15] = f2;
                Float f3 = Float.valueOf(((Float)this.id_implements.id_throws[15]).floatValue());
                this.id_implements.id_private[23] = f3;
                Float f4 = Float.valueOf(((Float)this.id_implements.id_throws[15]).floatValue());
                this.id_implements.id_private[25] = f4;
                float f5 = (float)(this.id_throws * this.id_implements.id_class(iQ_2.id_protected));
                if (this.id_implements.rT()) {
                    this.id_implements.id_super(f5 * 0.02f);
                    float f6 = -((float)(rfU_2.id_protected(d2, (double)rfU_2.id_class(d3 * d3 + d * d)) * 57.2957763671875));
                    f6 = rfU_2.id_class(rfU_2.id_catch(f6), -85.0f, 85.0f);
                    Float f7 = Float.valueOf(this.id_class(((Float)this.id_implements.id_throws[16]).floatValue(), f6, 5.0f));
                    this.id_implements.id_throws[16] = f7;
                    float f8 = rfU_2.id_break(((Float)this.id_implements.id_throws[16]).floatValue() * ((float)Math.PI / 180));
                    float f9 = rfU_2.id_class(((Float)this.id_implements.id_throws[16]).floatValue() * ((float)Math.PI / 180));
                    Float f10 = Float.valueOf(f8 * f5);
                    this.id_implements.id_private[44] = f10;
                    Float f11 = Float.valueOf(-f9 * f5);
                    this.id_implements.id_private[43] = f11;
                } else {
                    this.id_implements.id_super(f5 * 0.1f);
                }
            }
        } else {
            this.id_implements.id_super(0.0f);
            this.id_implements.id_try(0.0f);
            this.id_implements.id_while(0.0f);
            this.id_implements.id_catch(0.0f);
        }
    }
}

