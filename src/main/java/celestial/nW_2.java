/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.gm_3;
import celestial.lO_2;

public abstract class nW_2
extends lO_2 {
    protected nW_2(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2, d3, d4, d5, d6);
        this.id_finally = this.id_finally * (double)0.01f + d4;
        this.id_extends = this.id_extends * (double)0.01f + d5;
        this.id_native = this.id_native * (double)0.01f + d6;
        this.id_catch += (double)((this.id_continue.nextFloat() - this.id_continue.nextFloat()) * 0.05f);
        this.id_private += (double)((this.id_continue.nextFloat() - this.id_continue.nextFloat()) * 0.05f);
        this.id_implements += (double)((this.id_continue.nextFloat() - this.id_continue.nextFloat()) * 0.05f);
        this.id_this = (int)(8.0 / (Math.random() * 0.8 + 0.2)) + 4;
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            this.id_class(this.id_finally, this.id_extends, this.id_native);
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

