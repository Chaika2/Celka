/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.iB_2;
import celestial.iQ_2;
import celestial.rEx_1;
import celestial.rPY;
import celestial.rPo_1;
import celestial.rfU_2;

public class rEz_1
extends rPY {
    private final rEx_1 id_implements;

    public rEz_1(rEx_1 rEx_12) {
        super(rEx_12);
        this.id_implements = rEx_12;
    }

    @Override
    public void id_class() {
        iB_2 iB_22 = this.id_implements.I_();
        if (this.id_implements.su() && this.id_implements.rT()) {
            if (iB_22 != null && iB_22.re() > this.id_implements.re() || this.id_implements.id_protected) {
                this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, 0.002, 0.0));
            }
            if (this.id_private != rPo_1.MOVE_TO || this.id_implements.id_public().id_native()) {
                this.id_implements.id_super(0.0f);
                return;
            }
            double d = this.id_break - this.id_implements.rx();
            double d2 = this.id_byte - this.id_implements.re();
            double d3 = this.id_protected - this.id_implements.BO();
            double d4 = rfU_2.id_class(d * d + d2 * d2 + d3 * d3);
            d2 /= d4;
            float f = (float)(rfU_2.id_protected(d3, d) * 57.2957763671875) - 90.0f;
            Float f2 = Float.valueOf(this.id_class(((Float)this.id_implements.id_throws[15]).floatValue(), f, 90.0f));
            this.id_implements.id_throws[15] = f2;
            Float f3 = Float.valueOf(((Float)this.id_implements.id_throws[15]).floatValue());
            this.id_implements.id_private[23] = f3;
            float f4 = (float)(this.id_throws * this.id_implements.id_class(iQ_2.id_protected));
            float f5 = rfU_2.id_catch(0.125f, this.id_implements.sB(), f4);
            this.id_implements.id_super(f5);
            this.id_implements.id_byte(this.id_implements.rv().id_break((double)f5 * d * 0.005, (double)f5 * d2 * 0.1, (double)f5 * d3 * 0.005));
        } else {
            if (!rEx_1.id_class(this.id_implements)) {
                this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, -0.008, 0.0));
            }
            super.id_class();
        }
    }
}

