/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iQ_2;
import celestial.is_3;
import celestial.rPY;
import celestial.rPo_1;
import celestial.rfU_2;

public class rPV
extends rPY {
    private final int id_implements;
    private final boolean id_finally;

    public rPV(is_3 is_32, int n, boolean bl) {
        super(is_32);
        this.id_implements = n;
        this.id_finally = bl;
    }

    @Override
    public void id_class() {
        if (this.id_private == rPo_1.MOVE_TO) {
            this.id_private = rPo_1.WAIT;
            this.id_class.id_finally(true);
            double d = this.id_break - this.id_class.rx();
            double d2 = this.id_byte - this.id_class.re();
            double d3 = this.id_protected - this.id_class.BO();
            double d4 = d * d + d2 * d2 + d3 * d3;
            if (d4 < 2.500000277905201E-7) {
                this.id_class.id_while(0.0f);
                this.id_class.id_catch(0.0f);
                return;
            }
            float f = (float)(rfU_2.id_protected(d3, d) * 57.2957763671875) - 90.0f;
            Float f2 = Float.valueOf(this.id_class(((Float)this.id_class.id_throws[15]).floatValue(), f, 90.0f));
            this.id_class.id_throws[15] = f2;
            float f3 = this.id_class.BL() ? (float)(this.id_throws * this.id_class.id_class(iQ_2.id_protected)) : (float)(this.id_throws * this.id_class.id_class(iQ_2.id_throws));
            this.id_class.id_super(f3);
            double d5 = rfU_2.id_class(d * d + d3 * d3);
            float f4 = (float)(-(rfU_2.id_protected(d2, d5) * 57.2957763671875));
            Float f5 = Float.valueOf(this.id_class(((Float)this.id_class.id_throws[16]).floatValue(), f4, this.id_implements));
            this.id_class.id_throws[16] = f5;
            this.id_class.id_while(d2 > 0.0 ? f3 : -f3);
        } else {
            if (!this.id_finally) {
                this.id_class.id_finally(false);
            }
            this.id_class.id_while(0.0f);
            this.id_class.id_catch(0.0f);
        }
    }
}

