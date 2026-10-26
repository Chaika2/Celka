/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gm_3;
import celestial.nu_3;
import celestial.rLx_1;
import celestial.rXs_1;

public class nm_3
extends nu_3 {
    private final rLx_1 id_break;

    public nm_3(gm_3 gm_32, double d, double d2, double d3, rXs_1 rXs_12, rLx_1 rLx_12) {
        super(gm_32, d, d2, d3, rXs_12);
        this.id_break = rLx_12;
        this.id_else *= 0.02f;
        this.id_this = 40;
    }

    @Override
    protected void id_catch() {
        if (this.id_this-- <= 0) {
            this.id_finally();
            this.id_byte.id_class(this.id_break, this.id_catch, this.id_private, this.id_implements, this.id_finally, this.id_extends, this.id_native);
        }
    }

    @Override
    protected void id_private() {
        this.id_finally *= 0.02;
        this.id_extends *= 0.02;
        this.id_native *= 0.02;
    }
}

