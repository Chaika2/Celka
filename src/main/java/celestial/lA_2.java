/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;

public class lA_2
extends lO_2 {
    private final Ch_1 id_class;

    public lA_2(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        this.id_class = ch_1;
        this.id_finally *= (double)0.3f;
        this.id_extends = Math.random() * (double)0.2f + (double)0.1f;
        this.id_native *= (double)0.3f;
        this.id_class(0.01f, 0.01f);
        this.id_this = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.id_break(ch_1);
        this.id_else = 0.0f;
        this.id_finally = d4;
        this.id_extends = d5;
        this.id_native = d6;
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
        int n = 60 - this.id_this;
        if (this.id_this-- <= 0) {
            this.id_finally();
        } else {
            this.id_extends -= (double)this.id_else;
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_finally *= (double)0.98f;
            this.id_extends *= (double)0.98f;
            this.id_native *= (double)0.98f;
            float f = (float)n * 0.001f;
            this.id_class(f, f);
            this.id_class(this.id_class.id_class(n % 4, 4));
        }
    }
}

