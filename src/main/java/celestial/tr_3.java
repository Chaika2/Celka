/*
 * Decompiled with CFR 0.152.
 */
package celestial;

import celestial.HU;
import celestial.Hx_1;
import celestial.Iq_1;
import celestial.Ml_1;
import celestial.Ok_1;
import celestial.Tf_1;
import celestial.fZ_2;
import celestial.iB_2;
import celestial.qE_2;
import celestial.rje_3;
import celestial.rqO_2;
import celestial.wh_3;

public class tr_3<T extends iB_2>
extends Tf_1<T, wh_3<T>> {
    public static final rqO_2 id_class = new rqO_2("textures/entity/trident_riptide.png");
    private final Iq_1 id_break = new Iq_1(64, 64, 0, 0);

    public tr_3(qE_2<T, wh_3<T>> qE_22) {
        super(qE_22);
        this.id_break.id_class(-8.0f, -16.0f, -8.0f, 16.0f, 32.0f, 16.0f);
    }

    @Override
    public void id_class(Ml_1 ml_1, Hx_1 hx_1, int n, T t, float f, float f2, float f3, float f4, float f5, float f6) {
        if (((iB_2)t).Sz()) {
            Ok_1 ok_1 = hx_1.getBuffer(HU.id_protected(id_class));
            for (int i = 0; i < 3; ++i) {
                ml_1.id_class();
                float f7 = f4 * (float)(-(45 + i * 5));
                ml_1.id_class(rje_3.id_protected.id_byte(f7));
                float f8 = 0.75f * (float)i;
                ml_1.id_class(f8, f8, f8);
                ml_1.id_class(0.0, (double)(-0.2f + 0.6f * (float)i), 0.0);
                this.id_break.id_class(ml_1, ok_1, n, fZ_2.id_class);
                ml_1.id_break();
            }
        }
    }
}

