/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.lO_2;

public class nV_2
extends lO_2 {
    private final double id_class;
    private final double id_break;
    private final double id_interface;

    public nV_2(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2, d3);
        this.id_finally = d4;
        this.id_extends = d5;
        this.id_native = d6;
        this.id_class = d;
        this.id_break = d2;
        this.id_interface = d3;
        this.id_protected = d + d4;
        this.id_throws = d2 + d5;
        this.id_case = d3 + d6;
        this.id_catch = this.id_protected;
        this.id_private = this.id_throws;
        this.id_implements = this.id_case;
        this.id_throw = 0.1f * (this.id_continue.nextFloat() * 0.5f + 0.2f);
        float f = this.id_continue.nextFloat() * 0.6f + 0.4f;
        this.id_synchronized = 0.9f * f;
        this.id_return = 0.9f * f;
        this.id_public = f;
        this.id_final = false;
        this.id_this = (int)(Math.random() * 10.0) + 30;
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
    public int id_break(float f) {
        int n = super.id_break(f);
        float f2 = (float)this.id_super / (float)this.id_this;
        f2 *= f2;
        f2 *= f2;
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n3 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n3 = 240;
        }
        return n2 | n3 << 16;
    }

    @Override
    public void id_case() {
        this.id_protected = this.id_catch;
        this.id_throws = this.id_private;
        this.id_case = this.id_implements;
        if (this.id_super++ >= this.id_this) {
            this.id_finally();
        } else {
            float f = (float)this.id_super / (float)this.id_this;
            f = 1.0f - f;
            float f2 = 1.0f - f;
            f2 *= f2;
            f2 *= f2;
            this.id_catch = this.id_class + this.id_finally * (double)f;
            this.id_private = this.id_break + this.id_extends * (double)f - (double)(f2 * 1.2f);
            this.id_implements = this.id_interface + this.id_native * (double)f;
        }
    }
}

