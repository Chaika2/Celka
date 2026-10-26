/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;

public class ns_3
extends lO_2 {
    public ns_3(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6, boolean bl) {
        super(gm_32, d, d2, d3);
        this.id_protected(3.0f);
        this.id_class(0.25f, 0.25f);
        this.id_this = bl ? this.id_continue.nextInt(50) + 280 : this.id_continue.nextInt(50) + 80;
        this.id_else = 3.0E-6f;
        this.id_finally = d4;
        this.id_extends = d5 + (double)(this.id_continue.nextFloat() / 500.0f);
        this.id_native = d6;
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
        if (this.id_super++ < this.id_this && !(this.id_goto <= 0.0f)) {
            this.id_finally += (double)(this.id_continue.nextFloat() / 5000.0f * (float)(this.id_continue.nextBoolean() ? 1 : -1));
            this.id_native += (double)(this.id_continue.nextFloat() / 5000.0f * (float)(this.id_continue.nextBoolean() ? 1 : -1));
            this.id_extends -= (double)this.id_else;
            this.id_class(this.id_finally, this.id_extends, this.id_native);
            if (this.id_super >= this.id_this - 60 && this.id_goto > 0.01f) {
                this.id_goto -= 0.015f;
            }
        } else {
            this.id_finally();
        }
    }
}

