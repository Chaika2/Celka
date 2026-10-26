/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ch_1;
import celestial.gm_3;
import celestial.lO_2;

public class lz_3
extends lO_2 {
    private final Ch_1 id_class;

    public lz_3(gm_3 gm_32, double d, double d2, double d3, double d4, Ch_1 ch_1) {
        super(gm_32, d, d2, d3, 0.0, 0.0, 0.0);
        float f;
        this.id_class = ch_1;
        this.id_this = 4;
        this.id_synchronized = f = this.id_continue.nextFloat() * 0.6f + 0.4f;
        this.id_return = f;
        this.id_public = f;
        this.id_throw = 1.0f - (float)d4 * 0.5f;
        this.id_break(ch_1);
    }

    @Override
    public CJ id_class() {
        return CJ.id_protected;
    }

    @Override
    public int id_break(float f) {
        return 0xF000F0;
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
        }
    }
}

