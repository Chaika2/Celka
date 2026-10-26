/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.aI_2;
import celestial.an_3;
import celestial.cG_2;
import celestial.fZ_2;
import celestial.qE_2;
import celestial.qF_2;
import celestial.rOh_1;
import celestial.rcd_3;
import celestial.rhd_3;
import celestial.rrbb_3;
import celestial.rrdZ;
import celestial.wh_3;
import celestial.ws_3;

public class TY<T extends rhd_3>
extends Tf_1<T, wh_3<T>> {
    private final ws_3 id_class = new ws_3();

    public TY(qE_2<T, wh_3<T>> qE_22) {
        super(qE_22);
    }

    private void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, boolean bl) {
        rcd_3 rcd_32 = bl ? ((rhd_3)t).sQ() : ((rhd_3)t).sJ();
        aI_2.id_class(rcd_32.id_native("id")).filter(aI_22 -> aI_22 == aI_2.X).ifPresent(aI_22 -> {
            Object object;
            an_3 an_32 = rrbb_3.z().id_break;
            if (t instanceof cG_2) {
                rOh_1 rOh_12;
                object = (cG_2)t;
                rOh_1 rOh_13 = rOh_12 = bl ? (rOh_1)((cG_2)object).id_class[9] : (rOh_1)((cG_2)object).id_class[10];
                if (rOh_12 != null) {
                    rrbb_3.z().id_break = rOh_12;
                    if (rrbb_3.rs()) {
                        rrdZ.id_class(rOh_12);
                    }
                }
            }
            ml_1.id_class();
            ml_1.id_class(bl ? (double)0.4f : (double)-0.4f, t.x() ? (double)-1.3f : -1.5, 0.0);
            object = hx_1.getBuffer(this.id_class.id_class(qF_2.id_class[rcd_32.id_private("Variant")]));
            this.id_class.id_class(ml_1, (Ok_1)object, n, fZ_2.id_class, f, f2, f3, f4, (Integer)rhd_32.id_throws[41]);
            ml_1.id_break();
            rrbb_3.z().id_break = an_32;
            if (rrbb_3.rs()) {
                rrdZ.id_class(an_32);
            }
        });
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        this.id_class(ml_1, hx_1, n, t, f, f2, f5, f6, true);
        this.id_class(ml_1, hx_1, n, t, f, f2, f5, f6, false);
    }
}

