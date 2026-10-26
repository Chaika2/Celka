/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rfU_2;

public class nh_3
extends lO_2 {
    public nh_3(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        float f;
        this.id_finally *= (double)0.1f;
        this.id_extends *= (double)0.1f;
        this.id_native *= (double)0.1f;
        this.id_finally += d4 * 0.4;
        this.id_extends += d5 * 0.4;
        this.id_native += d6 * 0.4;
        this.id_synchronized = f = (float)(Math.random() * (double)0.3f + (double)0.6f);
        this.id_return = f;
        this.id_public = f;
        this.id_throw *= 0.75f;
        this.id_this = Math.max((int)(6.0 / (Math.random() * 0.8 + 0.6)), 1);
        this.id_final = false;
        this.id_case();
    }

    @Override
    public CJ id_class() {
        return CJ.id_break;
    }

    @Override
    public float id_class(float f) {
        return this.id_throw * rfU_2.id_class(((float)this.id_super + f) / (float)this.id_this * 32.0f, 0.0f, 1.0f);
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_return = (float)((double)this.id_return * 0.96);
            this.id_public = (float)((double)this.id_public * 0.9);
            this.id_finally *= (double)0.7f;
            this.id_extends *= (double)0.7f;
            this.id_native *= (double)0.7f;
            this.id_extends -= (double)0.02f;
            if (this.id_volatile) {
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
        }
    }
}

