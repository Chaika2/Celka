/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.iQ_2;
import celestial.rOp_1;
import celestial.rPY;
import celestial.rPo_1;
import celestial.rfU_2;
import celestial.rlG_2;

public class rOq_1
extends rPY {
    private final rOp_1 id_implements;

    public rOq_1(rOp_1 rOp_12) {
        super(rOp_12);
        this.id_implements = rOp_12;
    }

    @Override
    public void id_class() {
        if (((an_3)this.id_implements).id_class(rlG_2.id_break)) {
            this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, 0.005, 0.0));
        }
        if (this.id_private == rPo_1.MOVE_TO && !this.id_implements.id_public().id_native()) {
            float f = (float)(this.id_throws * this.id_implements.id_class(iQ_2.id_protected));
            this.id_implements.id_super(rfU_2.id_catch(0.125f, this.id_implements.sB(), f));
            double d = this.id_break - this.id_implements.rx();
            double d2 = this.id_byte - this.id_implements.re();
            double d3 = this.id_protected - this.id_implements.BO();
            if (d2 != 0.0) {
                double d4 = rfU_2.id_class(d * d + d2 * d2 + d3 * d3);
                this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, (double)this.id_implements.sB() * (d2 / d4) * 0.1, 0.0));
            }
            if (d != 0.0 || d3 != 0.0) {
                float f2 = (float)(rfU_2.id_protected(d3, d) * 57.2957763671875) - 90.0f;
                Float f3 = Float.valueOf(this.id_class(((Float)this.id_implements.id_throws[15]).floatValue(), f2, 90.0f));
                this.id_implements.id_throws[15] = f3;
                Float f4 = Float.valueOf(((Float)this.id_implements.id_throws[15]).floatValue());
                this.id_implements.id_private[23] = f4;
            }
        } else {
            this.id_implements.id_super(0.0f);
        }
    }
}

