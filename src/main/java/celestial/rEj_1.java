/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iQ_2;
import celestial.rEI;
import celestial.rPR;
import celestial.rPY;
import celestial.rPo_1;
import celestial.rfU_2;
import celestial.rjU_2;

public class rEj_1
extends rPY {
    private final rEI id_implements;

    public rEj_1(rEI rEI2) {
        super(rEI2);
        this.id_implements = rEI2;
    }

    @Override
    public void id_class() {
        if (this.id_private == rPo_1.MOVE_TO && !this.id_implements.id_public().id_native()) {
            rjU_2 rjU_22 = new rjU_2(this.id_break - this.id_implements.rx(), this.id_byte - this.id_implements.re(), this.id_protected - this.id_implements.BO());
            double d = rjU_22.id_case();
            double d2 = rjU_22.id_break / d;
            double d3 = rjU_22.id_byte / d;
            double d4 = rjU_22.id_protected / d;
            float f = (float)(rfU_2.id_protected(rjU_22.id_protected, rjU_22.id_break) * 57.2957763671875) - 90.0f;
            Float f2 = Float.valueOf(this.id_class(((Float)this.id_implements.id_throws[15]).floatValue(), f, 90.0f));
            this.id_implements.id_throws[15] = f2;
            Float f3 = Float.valueOf(((Float)this.id_implements.id_throws[15]).floatValue());
            this.id_implements.id_private[23] = f3;
            float f4 = (float)(this.id_throws * this.id_implements.id_class(iQ_2.id_protected));
            float f5 = rfU_2.id_catch(0.125f, this.id_implements.sB(), f4);
            this.id_implements.id_super(f5);
            double d5 = Math.sin((double)((Integer)this.id_implements.id_throws[41] + this.id_implements.V()) * 0.5) * 0.05;
            double d6 = Math.cos(((Float)this.id_implements.id_throws[15]).floatValue() * ((float)Math.PI / 180));
            double d7 = Math.sin(((Float)this.id_implements.id_throws[15]).floatValue() * ((float)Math.PI / 180));
            double d8 = Math.sin((double)((Integer)this.id_implements.id_throws[41] + this.id_implements.V()) * 0.75) * 0.05;
            this.id_implements.id_byte(this.id_implements.rv().id_break(d5 * d6, d8 * (d7 + d6) * 0.25 + (double)f5 * d3 * 0.1, d5 * d7));
            rPR rPR2 = this.id_implements.id_continue();
            double d9 = this.id_implements.rx() + d2 * 2.0;
            double d10 = this.id_implements.rH() + d3 / d;
            double d11 = this.id_implements.BO() + d4 * 2.0;
            double d12 = rPR2.id_protected();
            double d13 = rPR2.id_throws();
            double d14 = rPR2.id_case();
            if (!rPR2.id_byte()) {
                d12 = d9;
                d13 = d10;
                d14 = d11;
            }
            this.id_implements.id_continue().id_class(rfU_2.id_protected(0.125, d12, d9), rfU_2.id_protected(0.125, d13, d10), rfU_2.id_protected(0.125, d14, d11), 10.0f, 40.0f);
            this.id_implements.id_this(true);
        } else {
            this.id_implements.id_super(0.0f);
            this.id_implements.id_this(false);
        }
    }
}

