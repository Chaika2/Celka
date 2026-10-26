/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.rKv_1;
import celestial.rLQ;
import celestial.rST;
import celestial.rSp_1;
import celestial.rSu_1;
import celestial.rUs_1;
import celestial.rYB;
import celestial.rfH_2;
import celestial.rjU_2;

public class rSL
extends rSp_1 {
    private rjU_2 id_break;
    private int id_byte;

    @Override
    public void id_byte() {
        this.id_break = null;
        this.id_byte = 0;
    }

    public rSL(rSu_1 rSu_12) {
        super(rSu_12);
    }

    @Override
    public void id_class() {
        if (this.id_byte++ % 10 == 0) {
            float f = (this.id_class.Sa().nextFloat() - 0.5f) * 8.0f;
            float f2 = (this.id_class.Sa().nextFloat() - 0.5f) * 4.0f;
            float f3 = (this.id_class.Sa().nextFloat() - 0.5f) * 8.0f;
            ((rYB)this.id_class.id_throws[7]).id_class(rLQ.id_synchronized, this.id_class.rx() + (double)f, this.id_class.re() + 2.0 + (double)f2, this.id_class.BO() + (double)f3, 0.0, 0.0, 0.0);
        }
    }

    @Override
    public void id_break() {
        double d;
        ++this.id_byte;
        if (this.id_break == null) {
            rfH_2 rfH_22 = ((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING, rUs_1.id_class);
            this.id_break = rjU_2.id_protected(rfH_22);
        }
        if (!((d = this.id_break.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO())) < 100.0 || d > 22500.0 || ((Boolean)this.id_class.id_throws[23]).booleanValue() || ((Boolean)this.id_class.id_throws[24]).booleanValue())) {
            this.id_class.id_public(1.0f);
        } else {
            this.id_class.id_public(0.0f);
        }
    }

    @Override
    public float id_throws() {
        return 3.0f;
    }

    @Override
    public rjU_2 id_case() {
        return this.id_break;
    }

    public rST<rSL> id_protected() {
        return rST.id_finally;
    }
}

