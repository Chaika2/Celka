/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;
import celestial.rfH_2;
import celestial.rfU_2;
import celestial.rlG_2;

public class nd_3
extends lO_2 {
    private float id_class;

    public nd_3(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2, d3);
        this.id_this = (int)(Math.random() * 60.0) + 30;
        this.id_final = false;
        this.id_finally = 0.0;
        this.id_extends = -0.05;
        this.id_native = 0.0;
        this.id_class(0.02f, 0.02f);
        this.id_throw *= this.id_continue.nextFloat() * 0.6f + 0.2f;
        this.id_else = 0.002f;
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
            float f = 0.6f;
            this.id_finally += (double)(0.6f * rfU_2.id_break(this.id_class));
            this.id_native += (double)(0.6f * rfU_2.id_class(this.id_class));
            this.id_finally *= 0.07;
            this.id_native *= 0.07;
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            if (!this.id_byte.id_break(new rfH_2(this.id_catch, this.id_private, this.id_implements)).id_class(rlG_2.id_break) || this.id_volatile) {
                this.id_finally();
            }
            this.id_class = (float)((double)this.id_class + 0.08);
        }
    }
}

