/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CK;
import celestial.Ch_1;
import celestial.gm_3;

public class lu_3
extends CK {
    public lu_3(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, ch_1, -0.05f);
        this.id_finally = d4;
        this.id_extends = d5;
        this.id_native = d6;
        this.id_throw *= 0.75f;
        this.id_this = 60 + this.id_continue.nextInt(12);
        this.id_break(ch_1);
        if (this.id_continue.nextInt(4) == 0) {
            this.id_class(0.6f + this.id_continue.nextFloat() * 0.2f, 0.6f + this.id_continue.nextFloat() * 0.3f, this.id_continue.nextFloat() * 0.2f);
        } else {
            this.id_class(0.1f + this.id_continue.nextFloat() * 0.2f, 0.4f + this.id_continue.nextFloat() * 0.3f, this.id_continue.nextFloat() * 0.2f);
        }
        this.id_case(0.6f);
    }
}

