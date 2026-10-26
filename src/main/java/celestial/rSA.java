/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.aZ_2;
import celestial.rLD;
import celestial.rLQ;
import celestial.rLY;
import celestial.rST;
import celestial.rSu_1;
import celestial.rSw_1;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rfw_3;
import celestial.rjU_2;

public class rSA
extends rSw_1 {
    private int id_break;
    private int id_byte;
    private aZ_2 id_protected;

    @Override
    public void id_byte() {
        this.id_break = 0;
        ++this.id_byte;
    }

    public rSA(rSu_1 rSu_12) {
        super(rSu_12);
    }

    @Override
    public void id_class() {
        ++this.id_break;
        if (this.id_break % 2 == 0 && this.id_break < 10) {
            rjU_2 rjU_22 = this.id_class.id_byte(1.0f).id_protected();
            rjU_22.id_break(-0.7853982f);
            double d = this.id_class.id_super.rx();
            double d2 = this.id_class.id_super.id_byte(0.5);
            double d3 = this.id_class.id_super.BO();
            for (int i = 0; i < 8; ++i) {
                double d4 = d + this.id_class.Sa().nextGaussian() / 2.0;
                double d5 = d2 + this.id_class.Sa().nextGaussian() / 2.0;
                double d6 = d3 + this.id_class.Sa().nextGaussian() / 2.0;
                for (int j = 0; j < 6; ++j) {
                    ((rYB)this.id_class.id_throws[7]).id_class(rLQ.id_implements, d4, d5, d6, -rjU_22.id_break * (double)0.08f * (double)j, -rjU_22.id_byte * (double)0.6f, -rjU_22.id_protected * (double)0.08f * (double)j);
                }
                rjU_22.id_break(0.19634955f);
            }
        }
    }

    @Override
    public void id_break() {
        ++this.id_break;
        if (this.id_break >= 200) {
            if (this.id_byte >= 4) {
                this.id_class.L().id_class(rST.id_throws);
            } else {
                this.id_class.L().id_class(rST.id_catch);
            }
        } else if (this.id_break == 10) {
            double d;
            rjU_2 rjU_22 = new rjU_2(this.id_class.id_super.rx() - this.id_class.rx(), 0.0, this.id_class.id_super.BO() - this.id_class.BO()).id_protected();
            float f = 5.0f;
            double d2 = this.id_class.id_super.rx() + rjU_22.id_break * 5.0 / 2.0;
            double d3 = this.id_class.id_super.BO() + rjU_22.id_protected * 5.0 / 2.0;
            double d4 = d = this.id_class.id_super.id_byte(0.5);
            rfw_3 rfw_32 = new rfw_3(d2, d, d3);
            while (((rYB)this.id_class.id_throws[7]).id_finally(rfw_32)) {
                if ((d4 -= 1.0) < 0.0) {
                    d4 = d;
                    break;
                }
                rfw_32.id_break(d2, d4, d3);
            }
            d4 = rfU_2.id_byte(d4) + 1;
            this.id_protected = new aZ_2((rYB)this.id_class.id_throws[7], d2, d4, d3);
            this.id_protected.id_class(this.id_class);
            this.id_protected.id_byte(5.0f);
            this.id_protected.id_break(200);
            this.id_protected.id_class(rLQ.id_implements);
            this.id_protected.id_class(new rLY(rLD.id_catch));
            ((rYB)this.id_class.id_throws[7]).a_(this.id_protected);
        }
    }

    @Override
    public void id_catch() {
        if (this.id_protected != null) {
            this.id_protected.PD();
            this.id_protected = null;
        }
    }

    public rST<rSA> id_protected() {
        return rST.id_case;
    }

    public void id_private() {
        this.id_byte = 0;
    }
}

