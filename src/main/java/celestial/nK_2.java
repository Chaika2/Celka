/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rfU_2;

public class nK_2
extends lO_2 {
    private final float id_class;
    private final Ch_1 id_break;

    public nK_2(gm_3 gm_32, double d, double d2, double d3, float f, float f2, float f3, Ch_1 ch_1) {
        super(gm_32, d, d2, d3);
        this.id_break = ch_1;
        this.id_synchronized = f;
        this.id_return = f2;
        this.id_public = f3;
        float f4 = 0.9f;
        this.id_throw *= 0.67499995f;
        int n = (int)(32.0 / (Math.random() * 0.8 + 0.2));
        this.id_this = (int)Math.max((float)n * 0.9f, 1.0f);
        this.id_break(ch_1);
        this.id_class = ((float)Math.random() - 0.5f) * 0.1f;
        this.id_while = (float)Math.random() * ((float)Math.PI * 2);
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
            this.id_break(this.id_break);
            this.id_try = this.id_while;
            this.id_while += (float)Math.PI * this.id_class * 2.0f;
            if (this.id_volatile) {
                this.id_while = 0.0f;
                this.id_try = 0.0f;
            }
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_extends -= (double)0.003f;
            this.id_extends = Math.max(this.id_extends, (double)-0.14f);
        }
    }
}

