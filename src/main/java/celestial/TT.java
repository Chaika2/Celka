/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.IQ;
import celestial.Ml_1;
import celestial.QY;
import celestial.Tf_1;
import celestial.iB_2;
import celestial.qE_2;
import celestial.rdn_3;
import celestial.rje_3;
import celestial.rpZ_2;
import celestial.tR_2;
import celestial.tp_3;

public class TT<T extends iB_2, M extends tp_3<T>>
extends Tf_1<T, M> {
    public TT(qE_2<T, M> qE_22) {
        super(qE_22);
    }

    private void id_class(iB_2 iB_22, rdn_3 rdn_32, IQ iQ, rpZ_2 rpZ_22, Ml_1 ml_1, Hx_1 hx_1, int n) {
        if (!rdn_32.id_class()) {
            ml_1.id_class();
            ((tR_2)this.id_byte()).id_class(rpZ_22, ml_1);
            ml_1.id_class(rje_3.id_break.id_byte(-90.0f));
            ml_1.id_class(rje_3.id_protected.id_byte(180.0f));
            boolean bl = rpZ_22 == rpZ_2.LEFT;
            ml_1.id_class((double)((float)(bl ? -1 : 1) / 16.0f), 0.125, -0.625);
            QY.id_instanceof().id_import().id_class(iB_22, rdn_32, iQ, bl, ml_1, hx_1, n);
            ml_1.id_break();
        }
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        rdn_3 rdn_32;
        boolean bl = ((iB_2)t).Su() == rpZ_2.RIGHT;
        rdn_3 rdn_33 = bl ? ((iB_2)t).Sn() : ((iB_2)t).ss();
        rdn_3 rdn_34 = rdn_32 = bl ? ((iB_2)t).ss() : ((iB_2)t).Sn();
        if (!rdn_33.id_class() || !rdn_32.id_class()) {
            ml_1.id_class();
            if (((tp_3)this.id_byte()).id_int) {
                float f7 = 0.5f;
                ml_1.id_class(0.0, 0.75, 0.0);
                ml_1.id_class(0.5f, 0.5f, 0.5f);
            }
            this.id_class((iB_2)t, rdn_32, IQ.THIRD_PERSON_RIGHT_HAND, rpZ_2.RIGHT, ml_1, hx_1, n);
            this.id_class((iB_2)t, rdn_33, IQ.THIRD_PERSON_LEFT_HAND, rpZ_2.LEFT, ml_1, hx_1, n);
            ml_1.id_break();
        }
    }
}

