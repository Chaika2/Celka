/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.ay_3;
import celestial.rST;
import celestial.rSu_1;
import celestial.rSw_1;
import celestial.rYB;
import celestial.rfU_2;
import celestial.rhd_3;
import celestial.rjU_2;

public class rSt_1
extends rSw_1 {
    private static final ay_3 id_break = new ay_3().id_class(150.0);
    private final ay_3 id_byte = new ay_3().id_class(20.0).id_class(iB_22 -> Math.abs(iB_22.re() - rSu_12.re()) <= 10.0);
    private int id_protected;

    @Override
    public void id_byte() {
        this.id_protected = 0;
    }

    public rSt_1(rSu_1 rSu_12) {
        super(rSu_12);
    }

    @Override
    public void id_break() {
        ++this.id_protected;
        rhd_3 rhd_32 = ((rYB)this.id_class.id_throws[7]).id_class(this.id_byte, this.id_class, this.id_class.rx(), this.id_class.re(), this.id_class.BO());
        if (rhd_32 != null) {
            if (this.id_protected > 25) {
                this.id_class.L().id_class(rST.id_private);
            } else {
                rjU_2 rjU_22 = new rjU_2(rhd_32.rx() - this.id_class.rx(), 0.0, rhd_32.BO() - this.id_class.BO()).id_protected();
                rjU_2 rjU_23 = new rjU_2(rfU_2.id_class(((Float)this.id_class.id_throws[15]).floatValue() * ((float)Math.PI / 180)), 0.0, -rfU_2.id_break(((Float)this.id_class.id_throws[15]).floatValue() * ((float)Math.PI / 180))).id_protected();
                float f = (float)rjU_23.id_break(rjU_22);
                float f2 = (float)(Math.acos(f) * 57.2957763671875) + 0.5f;
                if (f2 < 0.0f || f2 > 10.0f) {
                    float f3;
                    double d = rhd_32.rx() - this.id_class.id_super.rx();
                    double d2 = rhd_32.BO() - this.id_class.id_super.BO();
                    double d3 = rfU_2.id_class(rfU_2.id_case(180.0 - rfU_2.id_protected(d, d2) * 57.2957763671875 - (double)((Float)this.id_class.id_throws[15]).floatValue()), -100.0, 100.0);
                    this.id_class.id_public *= 0.8f;
                    float f4 = f3 = rfU_2.id_class(d * d + d2 * d2) + 1.0f;
                    if (f3 > 40.0f) {
                        f3 = 40.0f;
                    }
                    this.id_class.id_public = (float)((double)this.id_class.id_public + d3 * (double)(0.7f / f3 / f4));
                    rSu_1 rSu_12 = this.id_class;
                    Float f5 = Float.valueOf(((Float)rSu_12.id_throws[15]).floatValue() + this.id_class.id_public);
                    rSu_12.id_throws[15] = f5;
                }
            }
        } else if (this.id_protected >= 100) {
            rhd_32 = ((rYB)this.id_class.id_throws[7]).id_class(id_break, this.id_class, this.id_class.rx(), this.id_class.re(), this.id_class.BO());
            this.id_class.L().id_class(rST.id_throws);
            if (rhd_32 != null) {
                this.id_class.L().id_class(rST.id_implements);
                this.id_class.L().id_break(rST.id_implements).id_class(new rjU_2(rhd_32.rx(), rhd_32.re(), rhd_32.BO()));
            }
        }
    }

    public rST<rSt_1> id_protected() {
        return rST.id_catch;
    }
}

