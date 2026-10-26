/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.eX_2;
import celestial.iQ_2;
import celestial.rON;
import celestial.rPY;
import celestial.rPo_1;
import celestial.rfU_2;

public class rOv_1
extends rPY {
    private final rON id_implements;

    public rOv_1(rON rON2) {
        super(rON2);
        this.id_implements = rON2;
    }

    @Override
    public void id_class() {
        this.id_catch();
        if (this.id_private == rPo_1.MOVE_TO && !this.id_implements.id_public().id_native()) {
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
            this.id_implements.id_super(rfU_2.id_catch(0.125f, this.id_implements.sB(), f4));
            this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, (double)this.id_implements.sB() * d2 * 0.1, 0.0));
        } else {
            this.id_implements.id_super(0.0f);
        }
    }

    private void id_catch() {
        if (this.id_implements.rT()) {
            this.id_implements.id_byte(this.id_implements.rv().id_break(0.0, 0.005, 0.0));
            if (!this.id_implements.sx().id_class((eX_2)this.id_implements.Ps(), 16.0)) {
                this.id_implements.id_super(Math.max(this.id_implements.sB() / 2.0f, 0.08f));
            }
            if (this.id_implements.n_()) {
                this.id_implements.id_super(Math.max(this.id_implements.sB() / 3.0f, 0.06f));
            }
        } else if (rON.id_break(this.id_implements)) {
            this.id_implements.id_super(Math.max(this.id_implements.sB() / 2.0f, 0.06f));
        }
    }
}

