/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.IQ;
import celestial.Ml_1;
import celestial.QY;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.rXQ;
import celestial.rba_3;
import celestial.rdn_3;
import celestial.rje_3;
import celestial.tT_2;

public class Ty_1
extends Tf_1<rba_3, tT_2<rba_3>> {
    public Ty_1(qE_2<rba_3, tT_2<rba_3>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rba_3 rba_32, float f, float f2, float f3, float f4, float f5, float f6) {
        float f7;
        boolean bl = rba_32.Sc();
        boolean bl2 = rba_32.n_();
        ml_1.id_class();
        if (bl2) {
            f7 = 0.75f;
            ml_1.id_class(0.75f, 0.75f, 0.75f);
            ml_1.id_class(0.0, 0.5, (double)0.209375f);
        }
        ml_1.id_class((double)(((tT_2)this.id_byte()).id_class.id_byte / 16.0f), (double)(((tT_2)this.id_byte()).id_class.id_protected / 16.0f), (double)(((tT_2)this.id_byte()).id_class.id_throws / 16.0f));
        f7 = rba_32.id_throw(f3);
        ml_1.id_class(rje_3.id_case.id_break(f7));
        ml_1.id_class(rje_3.id_protected.id_byte(f5));
        ml_1.id_class(rje_3.id_break.id_byte(f6));
        if (rba_32.n_()) {
            if (bl) {
                ml_1.id_class((double)0.4f, (double)0.26f, (double)0.15f);
            } else {
                ml_1.id_class((double)0.06f, (double)0.26f, -0.5);
            }
        } else if (bl) {
            ml_1.id_class((double)0.46f, (double)0.26f, (double)0.22f);
        } else {
            ml_1.id_class((double)0.06f, (double)0.27f, -0.5);
        }
        ml_1.id_class(rje_3.id_break.id_byte(90.0f));
        if (bl) {
            ml_1.id_class(rje_3.id_case.id_byte(90.0f));
        }
        rdn_3 rdn_32 = rba_32.id_class(rXQ.MAINHAND);
        QY.id_instanceof().id_import().id_class(rba_32, rdn_32, IQ.GROUND, false, ml_1, hx_1, n);
        ml_1.id_break();
    }
}

