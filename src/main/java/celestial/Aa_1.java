/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rfH_2;
import celestial.rlG_2;

public class Aa_1
extends lO_2 {
    public Aa_1(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2, d3);
        this.id_class(0.02f, 0.02f);
        this.id_throw *= this.id_continue.nextFloat() * 0.6f + 0.2f;
        this.id_finally = d4 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.id_extends = d5 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.id_native = d6 * (double)0.2f + (Math.random() * 2.0 - 1.0) * (double)0.02f;
        this.id_this = (int)(40.0 / (Math.random() * 0.8 + 0.2));
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
        this.id_extends += 0.005;
        if (this.id_this-- <= 0) {
            this.id_finally();
        } else {
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_finally *= (double)0.85f;
            this.id_extends *= (double)0.85f;
            this.id_native *= (double)0.85f;
            if (!this.id_byte.id_break(new rfH_2(this.id_catch, this.id_private, this.id_implements)).id_class(rlG_2.id_break)) {
                this.id_finally();
            }
        }
    }
}

