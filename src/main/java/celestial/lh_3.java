/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CK;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.rfH_2;

public class lh_3
extends CK {
    public lh_3(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, ch_1, 0.0f);
        this.id_throw = 0.5f;
        this.id_throws(1.0f);
        this.id_class(0.0f, 0.0f, 0.0f);
        this.id_this = (int)((double)(this.id_throw * 12.0f) / (Math.random() * (double)0.8f + (double)0.2f));
        this.id_break(ch_1);
        this.id_final = false;
        this.id_finally = d4;
        this.id_extends = d5;
        this.id_native = d6;
        this.id_case(0.0f);
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            this.id_break(this.id_class);
            if (this.id_super > this.id_this / 2) {
                this.id_throws(1.0f - ((float)this.id_super - (float)(this.id_this / 2)) / (float)this.id_this);
            }
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            if (this.id_byte.id_byte(new rfH_2(this.id_catch, this.id_private, this.id_implements)).id_catch()) {
                this.id_extends -= (double)0.008f;
            }
            this.id_finally *= (double)0.92f;
            this.id_extends *= (double)0.92f;
            this.id_native *= (double)0.92f;
            if (this.id_volatile) {
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
        }
    }
}

