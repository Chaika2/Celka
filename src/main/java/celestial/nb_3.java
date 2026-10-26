/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rfU_2;
import celestial.rhd_3;

public class nb_3
extends lO_2 {
    private final Ch_1 id_class;

    public nb_3(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        float f;
        this.id_class = ch_1;
        float f2 = 2.5f;
        this.id_finally *= (double)0.1f;
        this.id_extends *= (double)0.1f;
        this.id_native *= (double)0.1f;
        this.id_finally += d4;
        this.id_extends += d5;
        this.id_native += d6;
        this.id_synchronized = f = 1.0f - (float)(Math.random() * (double)0.3f);
        this.id_return = f;
        this.id_public = f;
        this.id_throw *= 1.875f;
        int n = (int)(8.0 / (Math.random() * 0.8 + 0.3));
        this.id_this = (int)Math.max((float)n * 2.5f, 1.0f);
        this.id_final = false;
        this.id_break(ch_1);
    }

    @Override
    public float id_class(float f) {
        return this.id_throw * rfU_2.id_class(((float)this.id_super + f) / (float)this.id_this * 32.0f, 0.0f, 1.0f);
    }

    @Override
    public CJ id_class() {
        return CJ.id_byte;
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            double d;
            this.id_break(this.id_class);
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_finally *= (double)0.96f;
            this.id_extends *= (double)0.96f;
            this.id_native *= (double)0.96f;
            rhd_3 rhd_32 = this.id_byte.id_class(this.id_catch, this.id_private, this.id_implements, 2.0, false);
            if (rhd_32 != null && this.id_private > (d = rhd_32.re())) {
                this.id_private += (d - this.id_private) * 0.2;
                this.id_extends += (rhd_32.rv().id_byte - this.id_extends) * 0.2;
                this.id_break(this.id_catch, this.id_private, this.id_implements);
            }
            if (this.id_volatile) {
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
        }
    }
}

