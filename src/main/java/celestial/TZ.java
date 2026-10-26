/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.Hx_1;
import celestial.Ml_1;
import celestial.Tf_1;
import celestial.qE_2;
import celestial.rbf_3;
import celestial.rqO_2;
import celestial.rrbN_2;
import celestial.rrbb_3;
import celestial.tZ_2;

public class TZ
extends Tf_1<rbf_3, tZ_2<rbf_3>> {
    private static final rqO_2 id_class = new rqO_2("textures/entity/cat/cat_collar.png");
    private final tZ_2<rbf_3> id_break = new tZ_2(0.01f);

    public TZ(qE_2<rbf_3, tZ_2<rbf_3>> qE_22) {
        super(qE_22);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, rbf_3 rbf_32, float f, float f2, float f3, float f4, float f5, float f6) {
        if (rbf_32.sZ()) {
            float[] fArray = rbf_32.sd().id_protected();
            if (rrbb_3.K()) {
                fArray = rrbN_2.id_class(rbf_32.sd(), fArray);
            }
            TZ.id_class(this.id_byte(), this.id_break, id_class, ml_1, hx_1, n, rbf_32, f, f2, f4, f5, f6, f3, fArray[0], fArray[1], fArray[2]);
        }
    }
}

