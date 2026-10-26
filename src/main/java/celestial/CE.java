/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rfU_2;

public class CE
extends lO_2 {
    public CE(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        this.id_finally *= (double)0.01f;
        this.id_extends *= (double)0.01f;
        this.id_native *= (double)0.01f;
        this.id_extends += 0.1;
        this.id_throw *= 1.5f;
        this.id_this = 16;
        this.id_final = false;
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
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            if (this.id_private == this.id_throws) {
                this.id_finally *= 1.1;
                this.id_native *= 1.1;
            }
            this.id_finally *= (double)0.86f;
            this.id_extends *= (double)0.86f;
            this.id_native *= (double)0.86f;
            if (this.id_volatile) {
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
        }
    }
}

