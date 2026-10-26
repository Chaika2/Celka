/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rLc_1;
import celestial.rfU_2;

public class CV
extends lO_2 {
    private final Ch_1 id_class;

    public CV(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, rLc_1 rLc_12, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, d4, d5, d6);
        this.id_class = ch_1;
        this.id_finally *= (double)0.1f;
        this.id_extends *= (double)0.1f;
        this.id_native *= (double)0.1f;
        float f = (float)Math.random() * 0.4f + 0.6f;
        this.id_synchronized = ((float)(Math.random() * (double)0.2f) + 0.8f) * rLc_12.id_class() * f;
        this.id_return = ((float)(Math.random() * (double)0.2f) + 0.8f) * rLc_12.id_break() * f;
        this.id_public = ((float)(Math.random() * (double)0.2f) + 0.8f) * rLc_12.id_throws() * f;
        this.id_throw *= 0.75f * rLc_12.id_case();
        int n = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.id_this = (int)Math.max((float)n * rLc_12.id_case(), 1.0f);
        this.id_break(ch_1);
    }

    @Override
    public float id_class(float f) {
        return this.id_throw * rfU_2.id_class(((float)this.id_super + f) / (float)this.id_this * 32.0f, 0.0f, 1.0f);
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
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            this.id_break(this.id_class);
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            if (this.id_private == this.id_throws) {
                this.id_finally *= 1.1;
                this.id_native *= 1.1;
            }
            this.id_finally *= (double)0.96f;
            this.id_extends *= (double)0.96f;
            this.id_native *= (double)0.96f;
            if (this.id_volatile) {
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
        }
    }
}

