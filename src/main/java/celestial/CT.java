/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;

public class CT
extends lO_2 {
    private final Ch_1 id_class;

    protected CT(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Ch_1 ch_1) {
        super(gm_32, d, d2, d3);
        float f;
        this.id_class = ch_1;
        this.id_finally = d4 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.id_extends = d5 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.id_native = d6 + (Math.random() * 2.0 - 1.0) * (double)0.05f;
        this.id_synchronized = f = this.id_continue.nextFloat() * 0.3f + 0.7f;
        this.id_return = f;
        this.id_public = f;
        this.id_throw = 0.1f * (this.id_continue.nextFloat() * this.id_continue.nextFloat() * 6.0f + 1.0f);
        this.id_this = (int)(16.0 / ((double)this.id_continue.nextFloat() * 0.8 + 0.2)) + 2;
        this.id_break(ch_1);
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
            this.id_extends += 0.004;
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            this.id_finally *= (double)0.9f;
            this.id_extends *= (double)0.9f;
            this.id_native *= (double)0.9f;
            if (this.id_volatile) {
                this.id_finally *= (double)0.7f;
                this.id_native *= (double)0.7f;
            }
        }
    }
}

