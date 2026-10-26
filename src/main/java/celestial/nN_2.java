/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rfU_2;

public class nN_2
extends lO_2 {
    private boolean id_class;
    private final Ch_1 id_break;

    public nN_2(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Ch_1 ch_1) {
        super(gm_32, d, d2, d3);
        this.id_finally = d4;
        this.id_extends = d5;
        this.id_native = d6;
        this.id_synchronized = rfU_2.id_class(this.id_continue, 0.7176471f, 0.8745098f);
        this.id_return = rfU_2.id_class(this.id_continue, 0.0f, 0.0f);
        this.id_public = rfU_2.id_class(this.id_continue, 0.8235294f, 0.9764706f);
        this.id_throw *= 0.75f;
        this.id_this = (int)(20.0 / ((double)this.id_continue.nextFloat() * 0.8 + 0.2));
        this.id_class = false;
        this.id_final = false;
        this.id_break = ch_1;
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
            this.id_break(this.id_break);
            if (this.id_volatile) {
                this.id_extends = 0.0;
                this.id_class = true;
            }
            if (this.id_class) {
                this.id_extends += 0.002;
            }
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            if (this.id_private == this.id_throws) {
                this.id_finally *= 1.1;
                this.id_native *= 1.1;
            }
            this.id_finally *= (double)0.96f;
            this.id_native *= (double)0.96f;
            if (this.id_class) {
                this.id_extends *= (double)0.96f;
            }
        }
    }
}

