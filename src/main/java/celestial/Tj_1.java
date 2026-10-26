/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.fZ_2;
import celestial.qE_2;
import celestial.rOi_1;
import celestial.rdP_2;
import celestial.rdn_3;
import celestial.rxC_2;
import celestial.tV_2;

public class Tj_1
extends Tf_1<rOi_1, tV_2<rOi_1>> {
    private final tV_2<rOi_1> id_class = new tV_2(0.1f);

    public Tj_1(qE_2<rOi_1, tV_2<rOi_1>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rOi_1 rOi_12, float f, float f2, float f3, float f4, float f5, float f6) {
        rdn_3 rdn_32 = rOi_12.n();
        if (rdn_32.id_break() instanceof rdP_2) {
            float f7;
            float f8;
            float f9;
            rdP_2 rdP_22 = (rdP_2)rdn_32.id_break();
            ((tV_2)this.id_byte()).id_class(this.id_class);
            this.id_class.id_class(rOi_12, f, f2, f3);
            this.id_class.id_class(rOi_12, f, f2, f4, f5, f6);
            if (rdP_22 instanceof rxC_2) {
                int n2 = ((rxC_2)rdP_22).d_(rdn_32);
                f9 = (float)(n2 >> 16 & 0xFF) / 255.0f;
                f8 = (float)(n2 >> 8 & 0xFF) / 255.0f;
                f7 = (float)(n2 & 0xFF) / 255.0f;
            } else {
                f9 = 1.0f;
                f8 = 1.0f;
                f7 = 1.0f;
            }
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_protected(rdP_22.id_catch()));
            this.id_class.id_class(ml_1, ok_1, n, fZ_2.id_class, f9, f8, f7, 1.0f);
        }
    }
}

