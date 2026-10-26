/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Cw_1;
import celestial.gm_3;

public class CR
extends Cw_1 {
    public CR(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2, d3, d4, d5, d6);
        this.id_throw = (float)((double)this.id_throw * 1.5);
        this.id_this = (int)(Math.random() * 2.0) + 60;
    }

    @Override
    public float id_class(float f) {
        float f2 = 1.0f - ((float)this.id_super + f) / ((float)this.id_this * 1.5f);
        return this.id_throw * f2;
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            float f = (float)this.id_super / (float)this.id_this;
            this.id_catch += this.id_finally * (double)f;
            this.id_private += this.id_extends * (double)f;
            this.id_implements += this.id_native * (double)f;
        }
    }
}

