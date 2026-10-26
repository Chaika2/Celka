/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;

public class lJ_2
extends lO_2 {
    public lJ_2(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2, d3, d4, d5, d6);
        float f;
        this.id_synchronized = f = this.id_continue.nextFloat() * 0.1f + 0.2f;
        this.id_return = f;
        this.id_public = f;
        this.id_class(0.02f, 0.02f);
        this.id_throw *= this.id_continue.nextFloat() * 0.6f + 0.5f;
        this.id_finally *= (double)0.02f;
        this.id_extends *= (double)0.02f;
        this.id_native *= (double)0.02f;
        this.id_this = (int)(20.0 / (Math.random() * 0.8 + 0.2));
    }

    @Override
    public void id_class(double d, double d2, double d3) {
        this.id_class(this.id_volatile().id_protected(d, d2, d3));
        this.id_extends();
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
        if (this.id_this-- <= 0) {
            this.id_finally();
        } else {
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_finally *= 0.99;
            this.id_extends *= 0.99;
            this.id_native *= 0.99;
        }
    }
}

