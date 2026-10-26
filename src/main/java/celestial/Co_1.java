/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rfU_2;

public class Co_1
extends lO_2 {
    private final Ch_1 id_class;
    private final double id_break;

    protected Co_1(gm_3 gm_32, double d, double d2, double d3, float f, float f2, float f3, double d4, double d5, double d6, float f4, Ch_1 ch_1, float f5, int n, double d7, boolean bl) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        float f6;
        this.id_break = d7;
        this.id_class = ch_1;
        this.id_finally *= (double)f;
        this.id_extends *= (double)f2;
        this.id_native *= (double)f3;
        this.id_finally += d4;
        this.id_extends += d5;
        this.id_native += d6;
        this.id_synchronized = f6 = gm_32.id_int.nextFloat() * f5;
        this.id_return = f6;
        this.id_public = f6;
        this.id_throw *= 0.75f * f4;
        this.id_this = (int)((double)n / ((double)gm_32.id_int.nextFloat() * 0.8 + 0.2));
        this.id_this = (int)((float)this.id_this * f4);
        this.id_this = Math.max(this.id_this, 1);
        this.id_break(ch_1);
        this.id_final = bl;
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
            this.id_extends += this.id_break;
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

