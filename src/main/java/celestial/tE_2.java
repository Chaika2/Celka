/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.TF;
import celestial.iB_2;
import celestial.qE_2;
import celestial.rdn_3;
import celestial.rdy_3;
import celestial.rje_3;
import celestial.wf_3;

public class tE_2<T extends iB_2>
extends TF<T, wf_3<T>> {
    public tE_2(qE_2<T, wf_3<T>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        rdn_3 rdn_32 = ((iB_2)t).ss();
        ml_1.id_class();
        if (rdn_32.id_break() == rdy_3.JA) {
            ((wf_3)this.id_byte()).id_byte().id_class(ml_1);
            ((wf_3)this.id_byte()).id_break().id_class(ml_1);
            ml_1.id_class(0.0625, 0.25, 0.0);
            ml_1.id_class(rje_3.id_case.id_byte(180.0f));
            ml_1.id_class(rje_3.id_break.id_byte(140.0f));
            ml_1.id_class(rje_3.id_case.id_byte(10.0f));
            ml_1.id_class(0.0, (double)-0.4f, (double)0.4f);
        }
        super.id_class(ml_1, hx_1, n, t, f, f2, f3, f4, f5, f6);
        ml_1.id_break();
    }
}

