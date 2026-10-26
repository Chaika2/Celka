/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.CJ;
import celestial.Ok_1;
import celestial.gm_3;
import celestial.lO_2;
import celestial.ly_3;
import celestial.rfU_2;

public class na_3
extends lO_2 {
    public na_3(gm_3 gm_32, double d, double d2, double d3) {
        super(gm_32, d, d2, d3);
        this.id_this = 4;
    }

    @Override
    public float id_class(float f) {
        return 7.1f * rfU_2.id_class(((float)this.id_super + f - 1.0f) * 0.25f * (float)Math.PI);
    }

    @Override
    public void id_class(Ok_1 ok_1, ly_3 ly_32, float f) {
        this.id_throws(0.6f - ((float)this.id_super + f - 1.0f) * 0.25f * 0.5f);
        super.id_class(ok_1, ly_32, f);
    }

    @Override
    public CJ id_class() {
        return CJ.id_byte;
    }
}

