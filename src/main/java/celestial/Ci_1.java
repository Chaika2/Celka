/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;
import java.util.Random;

public class Ci_1
extends lO_2 {
    private static final Random id_class = new Random();
    private final Ch_1 id_break;

    public Ci_1(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, 0.5 - id_class.nextDouble(), d5, 0.5 - id_class.nextDouble());
        this.id_break = ch_1;
        this.id_extends *= (double)0.2f;
        if (d4 == 0.0 && d6 == 0.0) {
            this.id_finally *= (double)0.1f;
            this.id_native *= (double)0.1f;
        }
        this.id_throw *= 0.75f;
        this.id_this = (int)(8.0 / (Math.random() * 0.8 + 0.2));
        this.id_final = false;
        this.id_break(ch_1);
    }

    @Override
    public CJ id_class() {
        return CJ.id_byte;
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
            this.id_extends += 0.004;
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

