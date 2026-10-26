/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rRq_1;
import celestial.rfH_2;
import celestial.rpB_2;

public class Cf_1
extends lO_2 {
    protected Cf_1(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        this.id_finally *= (double)0.3f;
        this.id_extends = Math.random() * (double)0.2f + (double)0.1f;
        this.id_native *= (double)0.3f;
        this.id_class(0.01f, 0.01f);
        this.id_else = 0.06f;
        this.id_this = (int)(8.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public CJ id_class() {
        return CJ.id_break;
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        if (this.id_this-- <= 0) {
            this.id_finally();
        } else {
            rfH_2 rfH_22;
            double d;
            this.id_extends -= (double)this.id_else;
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_finally *= (double)0.98f;
            this.id_extends *= (double)0.98f;
            this.id_native *= (double)0.98f;
            if (this.id_volatile) {
                if (Math.random() < 0.5) {
                    this.id_finally();
                }
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
            if ((d = Math.max(this.id_byte.id_byte(rfH_22 = new rfH_2(this.id_catch, this.id_private, this.id_implements)).id_extends(this.id_byte, rfH_22).id_class(rpB_2.Y, this.id_catch - (double)rfH_22.b_(), this.id_implements - (double)rfH_22.d_()), (double)this.id_byte.id_break(rfH_22).id_class((rRq_1)this.id_byte, rfH_22))) > 0.0 && this.id_private < (double)rfH_22.c_() + d) {
                this.id_finally();
            }
        }
    }
}

