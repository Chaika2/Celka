/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.gm_3;
import celestial.nW_2;
import celestial.rfU_2;

public class CS
extends nW_2 {
    public CS(gm_3 gm_32, double d, double d2, double d3, double d4, double d5, double d6) {
        super(gm_32, d, d2, d3, d4, d5, d6);
    }

    @Override
    public float id_class(float f) {
        float f2 = ((float)this.id_super + f) / (float)this.id_this;
        return this.id_throw * (1.0f - f2 * f2 * 0.5f);
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
        float f2 = ((float)this.id_super + f) / (float)this.id_this;
        f2 = rfU_2.id_class(f2, 0.0f, 1.0f);
        int n = super.id_break(f);
        int n2 = n & 0xFF;
        int n3 = n >> 16 & 0xFF;
        if ((n2 += (int)(f2 * 15.0f * 16.0f)) > 240) {
            n2 = 240;
        }
        return n2 | n3 << 16;
    }
}

