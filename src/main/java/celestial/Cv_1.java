/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rLQ;

public class Cv_1
extends lO_2 {
    public Cv_1(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        this.id_finally *= (double)0.8f;
        this.id_extends *= (double)0.8f;
        this.id_native *= (double)0.8f;
        this.id_extends = this.id_continue.nextFloat() * 0.4f + 0.05f;
        this.id_throw *= this.id_continue.nextFloat() * 2.0f + 0.2f;
        this.id_this = (int)(16.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public CJ id_class() {
        return CJ.id_break;
    }

    @Override
    public float id_class(float f) {
        float f2 = ((float)this.id_super + f) / (float)this.id_this;
        return this.id_throw * (1.0f - f2 * f2);
    }

    @Override
    public int id_break(float f) {
        int n = super.id_break(f);
        int n2 = 240;
        int n3 = n >> 16 & 0xFF;
        return 0xF0 | n3 << 16;
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        float f = (float)this.id_super / (float)this.id_this;
        if (this.id_continue.nextFloat() > f) {
            this.id_byte.id_class(rLQ.id_double, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native);
        }
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            this.id_extends -= 0.03;
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_finally *= (double)0.999f;
            this.id_extends *= (double)0.999f;
            this.id_native *= (double)0.999f;
            if (this.id_volatile) {
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
        }
    }
}

