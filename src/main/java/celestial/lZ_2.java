/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;

public class lZ_2
extends lO_2 {
    public lZ_2(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2 - 0.125, d3);
        this.id_synchronized = 0.4f;
        this.id_return = 0.4f;
        this.id_public = 0.7f;
        this.id_class(0.01f, 0.01f);
        this.id_throw *= this.id_continue.nextFloat() * 0.6f + 0.2f;
        this.id_this = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.id_final = false;
    }

    public lZ_2(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2 - 0.125, d3, d4, d5, d6);
        this.id_class(0.01f, 0.01f);
        this.id_throw *= this.id_continue.nextFloat() * 0.6f + 0.6f;
        this.id_this = (int)(16.0 / (Math.random() * 0.8 + 0.2));
        this.id_final = false;
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
        }
    }
}

