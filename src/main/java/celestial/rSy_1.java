/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.an_3;
import celestial.rKv_1;
import celestial.rLQ;
import celestial.rST;
import celestial.rSp_1;
import celestial.rSu_1;
import celestial.rUs_1;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rjU_2;
import java.util.Random;

public class rSy_1
extends rSp_1 {
    private rjU_2 id_break;

    @Override
    public void id_byte() {
        this.id_break = null;
    }

    public rSy_1(rSu_1 rSu_12) {
        super(rSu_12);
    }

    @Override
    public void id_class() {
        rjU_2 rjU_22 = this.id_class.id_byte(1.0f).id_protected();
        rjU_22.id_break(-0.7853982f);
        double d = this.id_class.id_super.rx();
        double d2 = this.id_class.id_super.id_byte(0.5);
        double d3 = this.id_class.id_super.BO();
        for (int i = 0; i < 8; ++i) {
            Random random = this.id_class.Sa();
            double d4 = d + random.nextGaussian() / 2.0;
            double d5 = d2 + random.nextGaussian() / 2.0;
            double d6 = d3 + random.nextGaussian() / 2.0;
            rjU_2 rjU_23 = this.id_class.rv();
            ((rYB)this.id_class.id_throws[7]).id_class(rLQ.id_implements, d4, d5, d6, -rjU_22.id_break * (double)0.08f + rjU_23.id_break, -rjU_22.id_byte * (double)0.3f + rjU_23.id_byte, -rjU_22.id_protected * (double)0.08f + rjU_23.id_protected);
            rjU_22.id_break(0.19634955f);
        }
    }

    @Override
    public void id_break() {
        if (this.id_break == null) {
            this.id_break = rjU_2.id_protected(((rYB)this.id_class.id_throws[7]).id_class(rKv_1.MOTION_BLOCKING_NO_LEAVES, rUs_1.id_class));
        }
        if (this.id_break.id_protected(this.id_class.rx(), this.id_class.re(), this.id_class.BO()) < 1.0) {
            this.id_class.L().id_break(rST.id_case).id_private();
            this.id_class.L().id_class(rST.id_catch);
        }
    }

    @Override
    public float id_throws() {
        return 1.5f;
    }

    @Override
    public rjU_2 id_case() {
        return this.id_break;
    }

    @Override
    public float id_implements() {
        float f = rfU_2.id_class(an_3.id_case(this.id_class.rv())) + 1.0f;
        float f2 = Math.min(f, 40.0f);
        return f2 / f;
    }

    public rST<rSy_1> id_protected() {
        return rST.id_protected;
    }
}

